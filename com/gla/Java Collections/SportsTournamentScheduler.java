import java.util.*;

// Team class
class Team implements Comparable<Team> {
    int id;
    String name;
    int points;

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.points = 0;
    }

    // Ensure uniqueness (based on id)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team t = (Team) o;
        return id == t.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Sort by points (descending)
    @Override
    public int compareTo(Team other) {
        if (this.points != other.points) {
            return other.points - this.points; // descending
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " : " + points;
    }
}

// Match class
class Match {
    Team t1, t2;

    public Match(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}

// Result class
class Result {
    Team winner;
    Team loser;

    public Result(Team winner, Team loser) {
        this.winner = winner;
        this.loser = loser;
    }

    @Override
    public String toString() {
        return winner.name + " defeated " + loser.name;
    }
}

public class SportsTournamentScheduler {
    public static void main(String[] args) {

        // 1. Register teams (Set → unique)
        Set<Team> teams = new HashSet<>();
        Team t1 = new Team(1, "TeamA");
        Team t2 = new Team(2, "TeamB");
        Team t3 = new Team(3, "TeamC");

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        teams.add(new Team(1, "TeamA")); // duplicate

        System.out.println("Registered Teams: " + teams);

        // Schedule matches (Queue)
        Queue<Match> matchQueue = new LinkedList<>();
        matchQueue.add(new Match(t1, t2));
        matchQueue.add(new Match(t2, t3));
        matchQueue.add(new Match(t1, t3));

        // Store results
        List<Result> results = new ArrayList<>();

        // Process matches
        while (!matchQueue.isEmpty()) {
            Match match = matchQueue.poll();

            // Random winner (simulation)
            Team winner = Math.random() > 0.5 ? match.t1 : match.t2;
            Team loser = (winner == match.t1) ? match.t2 : match.t1;

            // Update points
            winner.points += 10;

            // Store result
            results.add(new Result(winner, loser));
        }

        // 4. Leaderboard (TreeSet sorted by points)
        TreeSet<Team> leaderboard = new TreeSet<>(teams);

        // Output results
        System.out.println("\nMatch Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}
