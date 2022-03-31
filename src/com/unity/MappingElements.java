package com.unity;

import java.util.List;
import java.util.stream.Stream;

public class MappingElements {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Translator", 8),
                new Movie("Transporter", 10),
                new Movie("Expression", 55),
                new Movie("Procession", 15)
        );

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(m -> System.out.println(m.toUpperCase()));

        movies.stream()
                .map(movie -> movie.getLikes())
                .forEach(m-> System.out.println(m = m > 10 ? m : 0));


       var stream = Stream.of( List.of(1, 2, 3, 4, 5, 6, 7, 8,9,10),
                                                  List.of( 11,12, 13, 14, 15, 16, 17, 18),
                                                  List.of(19,20));
       stream.flatMap(list -> list.stream())
             .forEach(x-> System.out.println(x));

    }
}
