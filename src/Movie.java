 /*
The class Movie is started below. An instance of class Movie represents a film.
This class has the following three class variables:
title, which is a String representing the title of the movie
studio, which is a String representing the studio that made the movie
rating, which is a String representing the rating of the movie (i.e. PG-13, R, etc)

public class Movie {
private String title;
private String studio;
private String rating;
// your code goes here
}
Write a constructor for the class Movie, which takes a String representing the title of the movie,
a String representing the studio, and a String representing the rating as its arguments, and sets the
respective class variables to these values.

Write a second constructor for the class Movie, which takes a String representing the title of the movie
and a String representing the studio as its arguments, and sets the respective class variables to these
values, while the class variable rating is set to “PG”.

Write a method getPg, which takes an array of base type Movie as its argument, and returns a new array of
only those movies in the input array with a rating of “PG”. You may assume that the input array is full of
Movie instances. The returned array need not be full.

Write a piece of code that creates an instance of the class Movie with the title “Casino Royal”, the
studio “Eon Productions”, and the rating “"PG-13"”

 */
 public class Movie {
     private String title;
     private String studio;
     private String rating;

     public Movie(String title, String studio, String rating){
 //        this.title = title;
 //        this.studio = studio;
 //        this.rating = rating;
         System.out.println(title);
         System.out.println(studio);
         System.out.println(rating);
     }

     public Movie(String title, String studio){
         title = title;
         studio = studio;
         rating = "PG";
     }

     public static Movie[] getPG(Movie[] movies) {
         Movie[] pgMov = new Movie[movies.length];
         int newArrayIndex = 0;
         for (int i = 0; i < movies.length; i++) {
             if (movies[i].rating.equals("PG")) {
                 pgMov[newArrayIndex] = movies[i];
                 newArrayIndex++;
             }
         }
         return pgMov;
     }


     public static void main(String[] args) {
         Movie movie = new Movie("Casino Royale", "Eon Productions", "PG-13");
         Movie movie2 = new Movie("Avatar","Lightstorm Entertainment");
        // System.out.println(movie.toString());

     }
}
