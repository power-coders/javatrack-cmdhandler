package StreamExercises;

import java.util.stream.IntStream;

/**
 * Created by joris on 19.01.17.
 */
/*
Define an IntStream which contains the number 1,2,3.
Map the stream to a string stream which contains the values a1,a2,a3.
And print all of the elements of the resulting stream.
Output is:
a1
a2
a3
 */
public class Exercise6 {
    public static void main(String[] args) {
        IntStream.range(1,4)
                .mapToObj(e -> "a"+ Integer.toString(e))
                .forEach(System.out::println);
    }
}
