package StreamExercises;

import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Stream.of("Anna", "Adam", "Eva", "Tom", "Kurt")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                //prints foreach only for the filtered values
                .forEach(s -> System.out.println("forEach: " + s));
    }
}

/*
Output:
map: Anna
filter: ANNA
forEach: ANNA
map: Adam
filter: ADAM
forEach: ADAM
map: Eva
filter: EVA
map: Tom
filter: TOM
map: Kurt
filter: KURT

 */