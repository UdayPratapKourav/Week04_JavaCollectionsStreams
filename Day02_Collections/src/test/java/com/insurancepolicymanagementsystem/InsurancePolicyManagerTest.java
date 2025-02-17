package com.insurancepolicymanagementsystem;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagerTest {

    @Test
    public void testAddAndRetrievePolicies() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Policy policy1 = new Policy("P001", "Alice", LocalDate.now().plusDays(15), "Health", 5000.0);
        manager.addPolicy(policy1);

        assertTrue(manager.getAllPolicies().contains(policy1));
    }

    @Test
    public void testPoliciesExpiringSoon() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Policy expiringPolicy = new Policy("P002", "Bob", LocalDate.now().plusDays(10), "Auto", 3000.0);
        Policy futurePolicy = new Policy("P003", "Charlie", LocalDate.now().plusDays(50), "Home", 4000.0);

        manager.addPolicy(expiringPolicy);
        manager.addPolicy(futurePolicy);

        List<Policy> expiringSoon = manager.getPoliciesExpiringSoon();
        assertTrue(expiringSoon.contains(expiringPolicy));
        assertFalse(expiringSoon.contains(futurePolicy));
    }

    @Test
    public void testGetPoliciesByCoverageType() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        Policy policy1 = new Policy("P004", "David", LocalDate.now().plusDays(20), "Health", 6000.0);
        manager.addPolicy(policy1);

        List<Policy> healthPolicies = manager.getPoliciesByCoverageType("Health");
        assertEquals(1, healthPolicies.size());
        assertEquals("P004", healthPolicies.get(0).getPolicyNumber());
    }

    @Test
    public void testNoDuplicates() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new Policy("P005", "Eve", LocalDate.now().plusDays(30), "Auto", 2000.0));

        List<Policy> duplicates = manager.getDuplicatePolicies();
        assertTrue(duplicates.isEmpty());
    }
}
