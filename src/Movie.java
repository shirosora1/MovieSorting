public class Movie {
    private String title;
    private int year;
    private double ratingImdb;
    private int ageRating;

    public Movie(String title, int year, double ratingImdb, int ageRating) {
        this.title = title;
        this.year = year;
        this.ratingImdb = ratingImdb;
        this.ageRating = ageRating;
    }

    // Getters

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return ratingImdb;
    }

    public int getAgeRating() {
        return ageRating;
    }

    // toString to override default,
    // allows title etc to be shown over memory address

    @Override
    public String toString() {
        return title + " (" + year + ")" + " - rating: " + ratingImdb;
    }
}