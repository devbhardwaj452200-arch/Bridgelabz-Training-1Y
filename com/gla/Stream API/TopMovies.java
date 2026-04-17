import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public double getRating() { return rating; }
    public int getReleaseYear() { return releaseYear; }

    @Override
    public String toString() {
        return name + " (" + releaseYear + ") - " + rating;
    }
}

public class TopMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.5, 2023),
                new Movie("Movie B", 9.0, 2024),
                new Movie("Movie C", 7.5, 2022),
                new Movie("Movie D", 8.8, 2024),
                new Movie("Movie E", 9.2, 2025),
                new Movie("Movie F", 8.0, 2023)
        );

        List<Movie> top5 = movies.stream()
                .filter(m -> m.getRating() > 7.0)
                .sorted(Comparator.comparing(Movie::getRating).reversed()
                        .thenComparing(Movie::getReleaseYear).reversed())
                .limit(5)
                .collect(Collectors.toList());

        top5.forEach(System.out::println);
    }
}
