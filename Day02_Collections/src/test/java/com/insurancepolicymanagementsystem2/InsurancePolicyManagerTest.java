package com.insurancepolicymanagementsystem2;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

public class InsurancePolicyManagerTest {

    @Test
    public void testAddAndRetrievePolicy() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Policy policy = new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000.0);
        manager.addPolicy(policy);

        assertEquals(policy, manager.getPolicyByNumber("P001"));
    }

    @Test
    public void testPoliciesExpiringSoon() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Policy soonExpiring = new Policy("P002", "Bob", LocalDate.now().plusDays(10), "Auto", 3000.0);
        Policy futurePolicy = new Policy("P003", "Charlie", LocalDate.now().plusDays(50), "Home", 4000.0);

        manager.addPolicy(soonExpiring);
        manager.addPolicy(futurePolicy);

        List<Policy> expiringSoon = manager.getPoliciesExpiringSoon();
        assertTrue(expiringSoon.contains(soonExpiring));
        assertFalse(expiringSoon.contains(futurePolicy));
    }

    @Test
    public void testPoliciesByHolder() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Policy policy1 = new Policy("P004", "David", LocalDate.now().plusDays(20), "Health", 6000.0);
        manager.addPolicy(policy1);

        List<Policy> policies = manager.getPoliciesByHolder("David");
        assertEquals(1, policies.size());
        assertEquals("P004", policies.get(0).getPolicyNumber());
    }

    @Test
    public void testRemoveExpiredPolicies() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Policy expiredPolicy = new Policy("P005", "Eve", LocalDate.now().minusDays(10), "Auto", 2000.0);
        Policy validPolicy = new Policy("P006", "Eve", LocalDate.now().plusDays(20), "Auto", 2500.0);

        manager.addPolicy(expiredPolicy);
        manager.addPolicy(validPolicy);

        manager.removeExpiredPolicies();

        assertNull(manager.getPolicyByNumber("P005"));
        assertNotNull(manager.getPolicyByNumber("P006"));
    }
}
