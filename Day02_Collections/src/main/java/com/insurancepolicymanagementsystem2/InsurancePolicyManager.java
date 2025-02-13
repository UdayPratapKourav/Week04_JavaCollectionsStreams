package com.insurancepolicymanagementsystem2;



import java.time.LocalDate;
import java.util.*;

class Policy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholder='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premium=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicyManager {
    private Map<String, Policy> hashMap = new HashMap<>();
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        return new ArrayList<>(treeMap.subMap(today, true, threshold, true).values());
    }

    public List<Policy> getPoliciesByHolder(String policyholderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        treeMap.headMap(today, true).clear();  // Remove expired policies from TreeMap

        // Remove from HashMap and LinkedHashMap
        hashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        linkedHashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000.0));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 3000.0));
        manager.addPolicy(new Policy("P003", "Alice", LocalDate.now().plusDays(25), "Home", 4000.0));
        manager.addPolicy(new Policy("P004", "Charlie", LocalDate.now().minusDays(5), "Travel", 2000.0)); // Expired

        System.out.println("Policy P002: " + manager.getPolicyByNumber("P002"));
        System.out.println("Policies Expiring Soon: " + manager.getPoliciesExpiringSoon());
        System.out.println("Policies for Alice: " + manager.getPoliciesByHolder("Alice"));

        manager.removeExpiredPolicies();
        System.out.println("After removing expired policies:");
        System.out.println(manager.getPoliciesExpiringSoon());
    }
}
