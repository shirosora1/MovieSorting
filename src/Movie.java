public class Movie {

    private String title;
    private int year;
    private double rating;
    private int ageRating;

    public Movie(String title, int year, double rating, int ageRating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.ageRating = ageRating;
    }

    // Getters

    public double getRating() {
        return this.rating;
    }

    public int getYear() {
        return this.year;
    }

    // prints the details rather than data memory address

    @Override
    public String toString() {
        return title + " (" + year + ") - Rating: " + rating;
    }
}