package StreamExercises;

import java.util.stream.Stream;

/**
 * Created by joris on 19.01.17.
 */
public class Exercise13 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Anna", "Adam", "Eva", "Tom", "Kurt")
                .filter(s -> s.startsWith("A"));
        System.out.println(stream.anyMatch(s -> true));
        System.out.println(stream.noneMatch(s -> true));
    }
}
/*
Output:
Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
	at java.util.stream.ReferencePipeline.noneMatch(ReferencePipeline.java:459)
 */