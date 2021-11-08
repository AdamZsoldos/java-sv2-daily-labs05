package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String title;
    private List<LocalDateTime> showings;

    public Movie(String title, List<LocalDateTime> showings) {
        this.title = title;
        this.showings = showings;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getShowings() {
        return showings;
    }
}
