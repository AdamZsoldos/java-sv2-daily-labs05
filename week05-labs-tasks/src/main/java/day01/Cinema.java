package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<String> findMovieByTime(LocalDateTime dateTime) {
        List<String> titles = new ArrayList<>();
        for (Movie movie : movies) {
            for (LocalDateTime showingDateTime : movie.getShowings()) {
                if (showingDateTime.equals(dateTime)) titles.add(movie.getTitle());
            }
        }
        return titles;
    }
}
