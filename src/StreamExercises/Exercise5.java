package StreamExercises;

import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
/*
Given is a Stream.of("a1", "e2", "a3")
Get the max number of the various string elements and display it if any. The string structure is as
given above.
Output is:
3
 */
public class Exercise5 {
    public static void main(String[] args) {
        Stream.of("a1","e2","a3")
                .map(e -> e.substring(1))
                .mapToInt(e -> Integer.parseInt(e))
                .max()
                .ifPresent(System.out::println);
    }
}
