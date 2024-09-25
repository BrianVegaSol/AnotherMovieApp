import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String movieName = "Spiderman";
        System.out.println("My favorite movvie is: " + movieName);

        int releaseYear = 2010;
        String genre = "Action";
        double ratingIMDb = 9.5;
        boolean isSeries = true;
        char directorLastInitial = 'M';

        System.out.println("Movie Name: " + movieName);
        System.out.println("Released:" + releaseYear);
        System.out.println("Genre: " + genre);
        System.out.println("IMDb Rating: " + ratingIMDb);
        System.out.println("Part of a Serier: " + ratingIMDb);
        System.out.println("Director's Last Initial" + directorLastInitial);

        String[] movieNames = {"Seven Pounds", "Interstellar", "Inception"};
        int [] moviewReleaseYear = {2008, 2009, 2010};
        String [] favMovieGenres = {"Action", "Drama", "Thriller"};


        //comment


        System.out.println("First genre: " + favMovieGenres[0]); //first item in my array
        System.out.println("Third genre: " + favMovieGenres[2]); //last item in my array
        System.out.println("Second genre: " + favMovieGenres[1]); //second item in my array
        System.out.println("First genre: " + Arrays.toString(favMovieGenres));

    }
}