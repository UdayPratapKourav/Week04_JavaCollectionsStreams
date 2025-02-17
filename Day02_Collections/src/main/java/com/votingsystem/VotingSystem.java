package com.votingsystem;



import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCountMap = new HashMap<>(); // Stores candidate votes
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>(); // Maintains vote order
    private TreeMap<String, Integer> sortedResults = new TreeMap<>(); // Stores sorted results

    // Method to cast a vote
    public void castVote(String candidate) {
        // Update HashMap (vote count)
        voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);

        // Update LinkedHashMap (vote order)
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);

        // Update TreeMap (sorted results)
        sortedResults.put(candidate, voteCountMap.get(candidate));
    }

    // Get current vote count for a candidate
    public int getVoteCount(String candidate) {
        return voteCountMap.getOrDefault(candidate, 0);
    }

    // Display all votes (in order of insertion)
    public void displayVotesInOrder() {
        System.out.println("Votes in order of casting:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display results sorted by candidate names
    public void displaySortedResults() {
        System.out.println("Sorted Voting Results:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        System.out.println("Votes for Alice: " + votingSystem.getVoteCount("Alice"));

        votingSystem.displayVotesInOrder();
        votingSystem.displaySortedResults();
    }
}
