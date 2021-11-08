package day01;

import java.time.LocalDateTime;
import java.util.List;

public record Movie(String title, List<LocalDateTime> showings) {

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getShowings() {
        return showings;
    }

    public boolean hasShowing(LocalDateTime showing) {
        return showings.contains(showing);
    }
}
