import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("Hocus Pocus", 1993, 6.9, 0);
        Movie movie2 = new Movie("Halloween", 1978, 7.7, 15);
        Movie movie3 = new Movie("The Witches", 1990, 6.8, 0);
        Movie movie4 = new Movie("Get Out", 2017, 7.8, 15);
        Movie movie5 = new Movie("Death becomes her", 1992, 6.7, 12);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        System.out.println("Before sorting: " + movies);

        movies.sort(new RatingComparator());
        System.out.println("After sorting: " + movies);
    }
}