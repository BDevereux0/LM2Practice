package com.example.java;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class YearCompare implements Comparator<Movie>{ //this is an annomous class, cannot put lambda here.

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getYear() - o2.getYear();
    }

}*/

public class Movie  {
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year

    public int compareTo(Movie m){
        return this.year - m.year;
    }

    public Movie (String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        /*ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        Collections.sort(list, (movie1, movie2)->movie1.getYear()-movie2.getYear());
        for (Movie movie: list) {
            System.out.println(movie);
        }*/
        Movie movie = new Movie("Force Awakens", 8.3, 2015);
        Movie movie1 = new Movie("Star Wars", 8.7, 1977);
        int result =movie.compareTo(movie1);
        System.out.println("result "+ result);

        //lambda below is equal to the anonymous class above.
        Comparator<Movie> movieComparator = ((o1, o2) -> o1.getYear() - o2.getYear());
        int movieLambda = movieComparator.compare(movie, movie1);
        System.out.println(movieLambda);
    }
}
