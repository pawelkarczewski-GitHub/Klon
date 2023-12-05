package basicModels;

import java.time.LocalDate;
import java.util.Date;

public class Movie {
    private String title;
    private LocalDate releaseDate;  //LocalDate.of(1999, 10, 01)
    private double budget;
    private Boolean isOnMyList;
    private int rating;
    private char category;

    public Movie(String title, LocalDate releaseDate, double budget, Boolean isOnMyList, int rating, char category) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.budget = budget;
        this.isOnMyList = isOnMyList;
        this.rating = rating;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Boolean getOnMyList() {
        return isOnMyList;
    }

    public void setOnMyList(Boolean onMyList) {
        isOnMyList = onMyList;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", budget=" + budget +
                ", isOnMyList=" + isOnMyList +
                ", rating=" + rating +
                ", category=" + category +
                '}';
    }
}
