package StreamExercises;

import java.util.Arrays;
import java.util.List;

/**
 * Created by joris on 19.01.17.
 */
/*
Define an int array with the values 1,2,3.
Create a stream and do the following:
 Change the stream values with 2*v+1.
 Calculate the average of all stream values.
 Print the result if any.
Output is:
5.0
 */
public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,2,3);
        mylist.stream()
                .mapToInt(v -> 2*v+1)
                .average()
                .ifPresent(System.out::println);
    }
}
