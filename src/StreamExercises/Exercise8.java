package StreamExercises;

import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
public class Exercise8 {

    public static void main(String[] l) {

        //Der erste block wird nicht ausgegeben, da der Filter auch nur objekte zurück gibt, Filter ist ein Predicate
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });

        //wird ausgegeben, wegen dem Foreach (Collector)
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}

/*
Output:
filter: d2
forEach: d2
filter: a2
forEach: a2
filter: b1
forEach: b1
filter: b3
forEach: b3
filter: c
forEach: c
 */
