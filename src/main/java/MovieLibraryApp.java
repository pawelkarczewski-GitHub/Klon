import handlers.MenuHandler;
import handlers.UserInputHandler;
import models.MovieLibrary;

public class MovieLibraryApp {
    private String name;

    public static void main(String[] args) {


        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();

        while (true) {
            MenuHandler.print();
            System.out.println("\nEnter action: ");

            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    movieLibrary.getRandomMovieInformation();
                    break;

                case DISPLAYACTORMOVIES:
                    movieLibrary.printActorFilmography();
                    break;

                case QUIT:
                    System.out.println("\nQuiting...");
                    System.exit(1);
            }
        }
    }
}
