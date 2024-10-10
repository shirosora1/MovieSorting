import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Double.compare(movie1.getRating(), movie2.getRating());
    }
}