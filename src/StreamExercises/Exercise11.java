package StreamExercises;

import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
public class Exercise11 {
    public static void main(String[] args) {
        Stream.of("Anna", "Adam", "Eva", "Tom", "Kurt")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}

/*
Output:
filter: Anna
filter: Adam
filter: Eva
filter: Tom
filter: Kurt
sort: Adam; Anna
map: Adam
forEach: ADAM
map: Anna
forEach: ANNA
 */
