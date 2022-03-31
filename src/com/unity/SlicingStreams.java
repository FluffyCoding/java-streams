package com.unity;

import java.util.List;

public class SlicingStreams {

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
            .takeWhile(movie -> movie.getLikes() > 35 )
            .forEach(m-> System.out.println(m.getTitle()));
        System.out.println("-------------------------");
    movies.stream()
            .skip(2)
            .limit(1)
            .forEach(m-> System.out.println(m.getTitle()));

    }

}
