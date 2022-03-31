package com.unity;

import java.util.List;
import java.util.function.Predicate;

public class FiltringElements {

    public static void main(String[] args) {


        List<Movie> movies = List.of(
                new Movie("Translator", 8),
                new Movie("Transporter", 11),
                new Movie("Expression", 55),
                new Movie("Procession", 15)
        );


        Predicate<Movie> isPopular = (movie -> movie.getLikes() > 10);

        movies.stream().filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle() + " Got " + movie.getLikes() + " Likes"));

    }
}
