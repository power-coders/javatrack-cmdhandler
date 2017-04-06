package StreamExercises;

import java.util.Arrays;
import java.util.List;

/**
 * Created by joris on 19.01.17.
 */

/*
Given is a list of the following Strings: "adam", "anna", "eva".
Print the first string names if any. Use streams in combination with stream operations to solve the
problem.
Output is:
adam
 */
public class Exercise2 {
    public static void main(String[] args) {
        List<String> mylist = Arrays.asList("adam","adam","eva");
        mylist.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
