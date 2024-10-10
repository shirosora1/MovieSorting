import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        // Age-rated as PG set as 0
        Movie movie1 = new Movie("Scooby-Doo on Zombie Island", 1998, 7.7, 0);
        Movie movie2 = new Movie("National Treasure", 2004, 6.9, 0);
        Movie movie3 = new Movie("Hocus Pocus", 1993, 6.9, 0);
        Movie movie4 = new Movie("Halloween", 1978, 7.7, 18);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        System.out.println("Before sorting: " + movies);
        movies.sort(new TitleComparator());
        System.out.println("After sorting: " + movies);
    }
}