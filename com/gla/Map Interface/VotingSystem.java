import java.util.HashMap;
import java.util.Map;

public class VotingSystem {

    public static void main(String[] args) {

        // Map: candidate -> votes
        Map<String, Integer> votes = new HashMap<>();

        // Simulate 10 votes
        castVote(votes, "Alice");
        castVote(votes, "Bob");
        castVote(votes, "Alice");
        castVote(votes, "Charlie");
        castVote(votes, "Bob");
        castVote(votes, "Alice");
        castVote(votes, "Charlie");
        castVote(votes, "Bob");
        castVote(votes, "Alice");
        castVote(votes, "Charlie");

        // Print total votes for each candidate
        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Find winner
        String winner = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        // Print winner
        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes.");
    }

    // Method to cast vote
    public static void castVote(Map<String, Integer> votes, String candidate) {
        if (votes.containsKey(candidate)) {
            votes.put(candidate, votes.get(candidate) + 1);
        } else {
            votes.put(candidate, 1);
        }
    }
}
