package com.votingsystem;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VotingSystemTest {

    @Test
    public void testVoteCasting() {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        assertEquals(2, votingSystem.getVoteCount("Alice"));
        assertEquals(1, votingSystem.getVoteCount("Bob"));
    }

    @Test
    public void testCandidateWithZeroVotes() {
        VotingSystem votingSystem = new VotingSystem();
        assertEquals(0, votingSystem.getVoteCount("Charlie"));
    }

    @Test
    public void testVoteOrderPreserved() {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Charlie");

        assertEquals(1, votingSystem.getVoteCount("Alice"));
        assertEquals(1, votingSystem.getVoteCount("Bob"));
        assertEquals(1, votingSystem.getVoteCount("Charlie"));
    }
}
