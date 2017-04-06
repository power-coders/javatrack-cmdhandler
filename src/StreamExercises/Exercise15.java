package StreamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by joris on 19.01.17.
 */
/*
We have the same situation as in the above exercise. Use streams and functions to calculate the
average age of all persons. The average shall be calculated and displayed as a double.
Output is:
33.6
Solution:
 */
public class Exercise15 {
    public static void main(String[] args) {
        class Person{
            String name;
            int age;

            public Person(String name,int age){
                this.name = name;
                this.age = age;
            }
            public String toString(){return name;}
        }

        List<Person> persons = Arrays.asList(new Person("Adam", 18), new Person("Peter", 23), new Person("Eva", 23), new Person("Moriz", 62), new Person("Max", 42));

        persons.stream().mapToDouble(p -> p.age)
                .average()
                .ifPresent(System.out::println);

        //alternate Solution
        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(p -> p.age));
        System.out.println(averageAge);
    }
}
