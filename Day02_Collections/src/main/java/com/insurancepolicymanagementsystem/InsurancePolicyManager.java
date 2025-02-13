package com.insurancepolicymanagementsystem;



import java.time.LocalDate;
import java.util.*;

class Policy implements Comparable<Policy> {
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

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        return Objects.equals(this.policyNumber, other.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" + "policyNumber='" + policyNumber + "', policyholder='" + policyholderName +
                "', expiryDate=" + expiryDate + ", coverageType='" + coverageType +
                "', premium=" + premiumAmount + "}";
    }
}

public class InsurancePolicyManager {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return new HashSet<>(hashSet);
    }

    public List<Policy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        List<Policy> expiringSoon = new ArrayList<>();

        for (Policy policy : treeSet) {
            if (!policy.getExpiryDate().isAfter(threshold)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        List<Policy> filteredPolicies = new ArrayList<>();
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }

    public List<Policy> getDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        List<Policy> duplicates = new ArrayList<>();

        for (Policy policy : hashSet) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        for (Policy policy : hashSet) {
            if (policyCount.get(policy.getPolicyNumber()) > 1) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    public void comparePerformance() {
        int n = 100000;
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            hashSet.add(new Policy("P" + i, "John Doe", LocalDate.now().plusDays(i), "Health", 1000.0));
        }
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedHashSet.add(new Policy("P" + i, "John Doe", LocalDate.now().plusDays(i), "Health", 1000.0));
        }
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            treeSet.add(new Policy("P" + i, "John Doe", LocalDate.now().plusDays(i), "Health", 1000.0));
        }
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(15), "Health", 5000.0));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 3000.0));
        manager.addPolicy(new Policy("P003", "Charlie", LocalDate.now().plusDays(25), "Home", 4000.0));

        System.out.println("All Policies: " + manager.getAllPolicies());
        System.out.println("Policies Expiring Soon: " + manager.getPoliciesExpiringSoon());
        System.out.println("Policies by Coverage (Health): " + manager.getPoliciesByCoverageType("Health"));
        manager.comparePerformance();
    }
}
