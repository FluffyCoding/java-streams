package com.unity;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElements {


    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("Expression", 45,2,Gener.COMODY),
                new Movie("Terminator", 37,5,Gener.THRILLER),
                new Movie("Forrest Gump", 95,1,Gener.COMODY),
                new Movie("The Godfather", 55,2,Gener.ACTION),
                new Movie("Matrix Reloaded", 45,4,Gener.ACTION),
                new Movie("Transporter", 10,3,Gener.ACTION),
                new Movie("Interstellar", 99,5, Gener.THRILLER)
        );

        var generListMap = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGener,Collectors.toSet()));

        var generCount = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGener,
                        Collectors.counting()));

        var generCountWithName = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGener,
                        Collectors.mapping(Movie::getTitle,Collectors.joining(" , "))));


        System.out.println(generCount);
        System.out.println(generCountWithName);

    }

}
