public class GameScoreboard {

    public static void main(String[] args) {

        // Array of Integer scores (null means player hasn't played)
        Integer[] scores = {100, null, 250, 300, null, 150};

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {

            if (score == null) {
                // Count players who haven't played
                notPlayedCount++;
            } else {
                // Auto-unboxing (Integer -> int)
                totalScore += score;
            }
        }

        // Output results
        System.out.println("Players who have not played: " + notPlayedCount);
        System.out.println("Total Score of valid players: " + totalScore);
    }
}
