package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private final List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime showing) {
        List<String> titles = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.hasShowing(showing)) titles.add(movie.getTitle());
        }
        return titles;
    }
}
