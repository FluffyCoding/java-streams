package com.unity;

import java.util.Comparator;
import java.util.List;

public class UniqueElements {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Expression", 45,2),
                new Movie("Terminator", 37,5),
                new Movie("Forrest Gump", 95,1),
                new Movie("The Godfather", 55,2),
                new Movie("Matrix Reloaded", 45,4),
                new Movie("Transporter", 10,3),
                new Movie("Interstellar", 99,5)
        );

    movies.stream()
            .sorted(Comparator.comparing(Movie::getPrice))
            .map(Movie::getPrice)
            .distinct()
            .forEach(System.out::println);



    }


}
