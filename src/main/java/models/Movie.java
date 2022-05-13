package models;


import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private List<Actor> listOfActors;


    public Movie(String title, Director director, List<Actor> actors ) {
        this.title = title;
        this.director = director;
        this.listOfActors = actors;
    }

    public String getTitle() {
        return title;
    }


    public List<Actor> getListOfActors() {
        return listOfActors;
    }


    public Director getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title: " + title +
                "\ndirector: " + director +
                "\nactors: " + printActorsInOneRow();
    }

    private String printActorsInOneRow() {
        var actorsInRow = new StringBuilder();
        String separator = "";
        for (Actor listOfActor : listOfActors) {
            actorsInRow.append(separator + listOfActor + "");
            separator = ", ";
        }
        return actorsInRow.toString();
    }
}
