package StreamExercises;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Anna", "Adam", "Eva", "Tom", "Kurt")
                        .filter(s -> s.startsWith("A"));
        System.out.println(streamSupplier.get().anyMatch(s -> true));
        System.out.println(streamSupplier.get().noneMatch(s -> true));
    }
}

/*
true
false
 */
