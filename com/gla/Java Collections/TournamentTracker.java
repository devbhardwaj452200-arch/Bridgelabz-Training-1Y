import java.util.*;

// Player class
class Player {
    int id;
    String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Ensure uniqueness using id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name;
    }
}

// Match class
class Match {
    Player p1, p2;

    public Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}

// Result class
class Result {
    Player winner;
    Player loser;

    public Result(Player winner, Player loser) {
        this.winner = winner;
        this.loser = loser;
    }

    @Override
    public String toString() {
        return winner + " defeated " + loser;
    }
}

// Score class (for leaderboard)
class Score implements Comparable<Score> {
    Player player;
    int points;

    public Score(Player player, int points) {
        this.player = player;
        this.points = points;
    }

    // Sort descending by score
    @Override
    public int compareTo(Score other) {
        if (this.points != other.points) {
            return other.points - this.points; // descending
        }
        return this.player.name.compareTo(other.player.name);
    }

    @Override
    public String toString() {
        return player + " : " + points;
    }
}

public class TournamentTracker {
    public static void main(String[] args) {

        // 1. Register players (Set ensures uniqueness)
        Set<Player> players = new HashSet<>();
        Player p1 = new Player(1, "Alice");
        Player p2 = new Player(2, "Bob");
        Player p3 = new Player(3, "Charlie");

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(new Player(1, "Alice")); // duplicate, won't be added

        System.out.println("Registered Players: " + players);

        // 2. Schedule matches (Queue)
        Queue<Match> matchQueue = new LinkedList<>();
        matchQueue.add(new Match(p1, p2));
        matchQueue.add(new Match(p2, p3));
        matchQueue.add(new Match(p1, p3));

        // 3. Store results (List)
        List<Result> results = new ArrayList<>();

        // Score map
        Map<Player, Integer> scoreMap = new HashMap<>();
        for (Player p : players) {
            scoreMap.put(p, 0);
        }

        // Process matches
        while (!matchQueue.isEmpty()) {
            Match match = matchQueue.poll();

            // Random winner (simulation)
            Player winner = Math.random() > 0.5 ? match.p1 : match.p2;
            Player loser = (winner == match.p1) ? match.p2 : match.p1;

            results.add(new Result(winner, loser));

            // Update score
            scoreMap.put(winner, scoreMap.get(winner) + 10);
        }

        // 4. Leaderboard (TreeSet sorted)
        TreeSet<Score> leaderboard = new TreeSet<>();
        for (Map.Entry<Player, Integer> entry : scoreMap.entrySet()) {
            leaderboard.add(new Score(entry.getKey(), entry.getValue()));
        }

        // Display results
        System.out.println("\nMatch Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}
