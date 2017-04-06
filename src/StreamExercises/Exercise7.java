package StreamExercises;

import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
/*
Define a stream which contains the double values 1.0,2.0,3.0.
Map the stream to a string stream which contains the values a1,a2,a3.
And print all of the elements of the resulting stream.
Output is:
a1
a2
a3
 */
public class Exercise7 {
    public static void main(String[] args) {
        Stream.of(1.0,2.0,3.0).
                mapToInt(Double::intValue)
                .mapToObj(e -> "a" + Integer.toString(e))
                .forEach(System.out::println);
    }
}
