package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> result = new ArrayList<>();
        for (Movie actual : movies) {
            for (LocalDateTime actualDate : actual.getPlayingDates()) {
                if (actualDate.equals(time)) {
                    result.add(actual.getTitle());
                }
            }
        }
        return result;
    }
}
