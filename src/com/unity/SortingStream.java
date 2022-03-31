package com.unity;

import java.util.Comparator;
import java.util.List;

public class SortingStream {

    public static void main(String[] args) {
        List<Movie> movies = List.of(

                new Movie("Expression", 45),
                new Movie("Terminator", 37),
                new Movie("Forrest Gump", 95),
                new Movie("The Godfather", 55),
                new Movie("Matrix Reloaded", 45),
                new Movie("Transporter", 10),
                new Movie("Interstellar", 99)
        );

        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(movie -> System.out.println(movie.getTitle()));

        System.out.println("------------------------------");

        movies.stream()
                .sorted(Comparator.comparing(Movie::getLikes).reversed())
                .map(Movie::getLikes)
                .forEach(System.out::println);

    }


}
