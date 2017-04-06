package StreamExercises;

import java.util.stream.IntStream;

/**
 * Created by joris on 19.01.17.
 */
/*
Use IntStream to define a range of int values and to print them out.
Output is:
1
2
3
 */
public class Exercise3 {
    public static void main(String[] args) {
        IntStream.range(1,4)
                .forEach(System.out::println);
    }
}
