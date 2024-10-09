import java.util.Comparator;

public class AgeRatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Integer.compare(movie1.getAgeRating(), movie2.getAgeRating());
    }
}
