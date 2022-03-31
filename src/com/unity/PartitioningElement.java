package com.unity;

import java.util.List;
import java.util.stream.Collectors;

public class PartitioningElement {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("Expression", 45, 2, Gener.COMODY),
                new Movie("Terminator", 37, 5, Gener.THRILLER),
                new Movie("Forrest Gump", 95, 1, Gener.COMODY),
                new Movie("The Godfather", 55, 2, Gener.ACTION),
                new Movie("Matrix Reloaded", 45, 4, Gener.ACTION),
                new Movie("Transporter", 10, 3, Gener.ACTION),
                new Movie("Interstellar", 99, 5, Gener.THRILLER)
        );


        var result = movies.stream().
                collect(Collectors.partitioningBy(
                        movie -> movie.getLikes() > 50,
                        Collectors.mapping(Movie::getTitle,Collectors.joining(" ,"))));
        System.out.println(result);
    }

}
