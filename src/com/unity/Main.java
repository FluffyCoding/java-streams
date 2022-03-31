package com.unity;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("Translator", 8),
                new Movie("Transporter", 10),
                new Movie("Expression", 55),
                new Movie("Procession", 15)
        );

        // Imperative Programing Style
        int counter = 0;
        for (Movie m : movies) {
            if (m.getLikes() > 10) counter++;
        }
        System.out.println(counter);


        // Declarative programming Style
        long count = movies.stream().filter(m -> m
                                        .getLikes() > 10)
                                        .count();

        long titleFound = movies.stream().filter(movie -> movie
                                        .getTitle()
                                        .equals("Translator"))
                                        .count();

        long titleCounts = movies.stream().filter(movie -> movie
                                        .getTitle()
                                        .toLowerCase()
                                        .startsWith("p"))
                                        .count();

    }


}
