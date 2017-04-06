package StreamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by joris on 19.01.17.
 */
/*
We have the same situation as in the above before.
This time we want to create a String which contains the names of all persons which are of legal
age (>=18) in Switzerland.
When we print this String it shall show something like: In Switzerland Adam and Peter
and Eva and Moriz and Max are of legal age.
Again: Use streams and functions to create the String.
Hint: Use Collectors.joining to create the final result.
Output is:
In Switzerland Adam and Peter and Eva and Moriz and Max are of legal age.
 */
public class Exercise17 {
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

        String phrase = persons.stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Switzerland ", " are of legal age"));
        System.out.println(phrase);

    }
}

/*
String phrase = persons.stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                .collect(Collectors.joining(delimiter"and", prfix"In Switzerland", suffix"are of legal age"));
 */
