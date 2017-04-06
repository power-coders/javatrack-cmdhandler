package StreamExercises;

import java.util.Arrays;
import java.util.List;

/**
 * Created by joris on 19.01.17.
 */

/*
Given is a list of the following Strings: "adam", "eva", "anna", "maria", "ruth".
We want to print all names starting with ‘A’ in a sorted way. Use streams in combination with
stream operations to solve the problem.
Output is:
ADAM
ANNA
 */
public class Exercise1 {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("adam", "eva", "anna", "maria", "ruth");
        myList.stream()
                .filter(a -> a.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
