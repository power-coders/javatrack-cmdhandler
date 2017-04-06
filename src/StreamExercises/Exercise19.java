package StreamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

/**
 * Created by joris on 19.01.17.
 */
/*
We have the same situation as in the above before.
We want to create our own collector (personNameCollector) this time to be able to use it as:
String names = persons.stream().collect(personNameCollector);
The string shall show ADAM | PETER | EVA | MORIZ | MAX when printed.
Again: Use streams and functions to create the Map.
Hint:
Create the collector using StringJoiner. Then define:
 Supplier
 Accumulator
 Combiner
 Finisher
Output is:
ADAM | PETER | EVA | MORIZ | MAX
 */
public class Exercise19 {
    public static void main(String[] args) {
        class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String toString() {
                return name;
            }
        }

        List<Person> persons = Arrays.asList(new Person("Adam", 18), new Person("Peter", 23), new Person("Eva", 23), new Person("Moriz", 62), new Person("Max", 42));


        Collector<Person,StringJoiner,String> personNameCollector = Collector.of(() ->
                        new StringJoiner(" | "), // supplier
                        (j, p) -> j.add(p.name.toUpperCase()), // accumulator
                        (j1, j2) -> j1.merge(j2), // combiner
                        StringJoiner::toString); // finisher

        String phrase = persons.stream().collect(personNameCollector);
        System.out.println(phrase);
    }
}
