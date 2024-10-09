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

    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }

    public double getRating() {
        return this.rating;
    }

    public int getAgeRating() {
        return ageRating;
    }

    // prints the details rather than data memory address

    @Override
    public String toString() {
        return title + " (" + year + ") - Rating: " + rating;
    }
}