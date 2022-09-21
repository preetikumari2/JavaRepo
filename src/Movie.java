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
 public class Movie{
     private final String title;
     private final String studio;
     private final String rating;

     public String getStudio() {
         return studio;
     }
     public Movie(String title, String studio, String rating) {
         this.title = title;
         this.studio=studio;
         this.rating=rating;
     }
     public Movie(String title, String studio) {
         this.title = title;
         this.studio=studio;
         this.rating="PG";
     }
     public String getName(){
         return title;
     }
     public Movie[] getPG(Movie[] movies){
         Movie[] PGMovie=new Movie[movies.length];
         int arrayindex=0;
         for (Movie m: movies){
             if (m.rating.equals("PG")) {
                 PGMovie[arrayindex]=m;
                 arrayindex++;
             }
         }
         return PGMovie;
     }


     public static void main(String[] args) {
         Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
         Movie movie2 = new Movie("Avatar", "lightstrom Entertainments");
         Movie movie3 = new Movie("Death Note", "Eon Productions");
         Movie[] mov = new Movie[3];
         mov[0] = movie1;
         mov[1] = movie2;
         mov[2] = movie3;
         for (Movie m: (mov[0].getPG(mov))){
             if (m!=null)
                 System.out.print(m.getName()+" ");
         }
     }
 }
