package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String title;
    private List<LocalDateTime> playingDates;

    public Movie(String title, List<LocalDateTime> playingDates) {
        this.title = title;
        this.playingDates = playingDates;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getPlayingDates() {
        return playingDates;
    }
}


