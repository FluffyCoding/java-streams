package com.unity;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsStreams {

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

        List<Integer> likeList = movies.stream()
                .sorted(Comparator.comparing(Movie::getLikes))
                .map(Movie::getLikes)
                .collect(Collectors.toList());
        //System.out.println(likeList);

        var movieMap = movies.stream()
                .filter(movie -> movie.getPrice() > 0)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));

        System.out.println(movieMap + "\n");


        var totalPrice = movies.stream()
                .collect(Collectors.summingInt(Movie::getPrice));


        var priceSummery = movies.stream()
                .collect(Collectors.summarizingInt(Movie::getPrice));

        var result = movies.stream().filter(m -> m.getPrice() > 1)
                .flatMap(movie -> Stream.of(movie.getLikes(),movie.getTitle()))
                .collect(Collectors.toList());


        System.out.println(priceSummery);
        System.out.println(result);

    }


}
