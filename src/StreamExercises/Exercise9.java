package StreamExercises;

import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
public class Exercise9 {
    public static void main(String[] args) {
            Stream.of("Anna", "Adam", "Eva", "Maria", "Ruth")
                    .map(s -> {
                        System.out.println("map: " + s);
                        return s.toUpperCase();
                    })
                    //checks if there is any element in the stream which matches the given Predicate
                    .anyMatch(s -> {
                        System.out.println("anyMatch: " + s);
                        return s.startsWith("A");
                    });
        }
    }


/*
Output:
map: Anna
anyMatch: ANNA

 */
