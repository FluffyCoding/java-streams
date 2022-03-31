package com.unity;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;

public class PeekingElement {

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
                .filter(movie -> movie.getLikes() > 10)
                .sorted(Comparator.comparing(Movie::getLikes))
                .peek(l-> System.out.println(l.getLikes()))
                .map(Movie::getTitle)
                .sorted(Comparator.comparing(String::toLowerCase))
                .forEach(System.out::println);





    }

}
