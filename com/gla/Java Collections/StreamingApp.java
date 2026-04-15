import java.util.*;

// Movie class
class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }
}

public class StreamingApp {
    public static void main(String[] args) {

        // 1. All available movies (List)
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("Avengers", "Action"));
        allMovies.add(new Movie("Titanic", "Romance"));
        allMovies.add(new Movie("Interstellar", "Sci-Fi"));
        allMovies.add(new Movie("John Wick", "Action"));

        // Stack for watch history
        Stack<Movie> watchHistory = new Stack<>();

        // Queue for "Up Next"
        Queue<Movie> upNext = new LinkedList<>();

        // Set for unique genres watched
        Set<String> watchedGenres = new HashSet<>();

        // 1. Add movies to Up Next
        upNext.add(allMovies.get(0)); // Inception
        upNext.add(allMovies.get(1)); // Avengers
        upNext.add(allMovies.get(2)); // Titanic

        // 2. Watch movies (process queue)
        while (!upNext.isEmpty()) {
            Movie current = upNext.poll(); // get next movie

            System.out.println("Watching: " + current);

            // Move to watch history
            watchHistory.push(current);

            // 3. Track genre
            watchedGenres.add(current.genre);
        }

        // Display watch history
        System.out.println("\nWatch History:");
        for (Movie m : watchHistory) {
            System.out.println(m);
        }

        // Display unique genres
        System.out.println("\nGenres Watched: " + watchedGenres);

        // 4. Recommendations based on genres
        System.out.println("\nRecommended Movies:");
        for (Movie m : allMovies) {
            if (watchedGenres.contains(m.genre) && !watchHistory.contains(m)) {
                System.out.println(m);
            }
        }
    }
}
