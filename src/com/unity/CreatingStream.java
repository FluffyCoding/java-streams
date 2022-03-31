package com.unity;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {
        int[] numbers = {116, 700, 75, 967, 64, 10, 27, 131, 884, 436};
        //Arrays.stream(numbers).forEach(System.out::print);
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

        generateRandom();
        generateSerial();
    }

    public static void generateSerial(){
        Stream.iterate(10, n -> n += 1)
                .limit(15)
                .forEach(n-> System.out.print(n + " "));
    }

    public static void generateRandom(){

        Stream<Double> generate = Stream.generate(() -> (Math.random() + 1) * 100);
        generate.limit(15).forEach(x-> System.out.println(x));

    }

}
