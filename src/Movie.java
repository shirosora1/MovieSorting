public class Movie implements Comparable<Movie> {

    private String title;
    private int releaseYear;
    private double ratingImdb;
    private int ageRating;

    public Movie(String title, int releaseYear, double ratingImdb, int ageRating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.ageRating = ageRating;
        this.ratingImdb = ratingImdb;
    }

    // Getter
    public double getRating() {
        return ratingImdb;
    }

    @Override
    public int compareTo(Movie otherMovieRating) {
        return Double.compare(getRating(), otherMovieRating.getRating());
    }
}
