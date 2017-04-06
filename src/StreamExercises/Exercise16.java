package StreamExercises;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by joris on 19.01.17.
 */
/*
We have the same situation as in the above exercise.
Use streams and functions to calculate and display the following:
 Number of elements.
 The sum of all ages.
 The minimum age.
 The average age.
 The maximum age.
Hint: Use IntSummaryStatistics and Collectors.summarizingInt.
Output is:
IntSummaryStatistics{count=5, sum=168, min=18, average=33.600000, max=62}
 */
public class Exercise16 {

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

        IntSummaryStatistics agesummary = persons.stream()
                .collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(agesummary);
    }

}
