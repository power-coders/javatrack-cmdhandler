package StreamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by joris on 19.01.17.
 */
/*
We have the same situation as in the above before.
We want to create a Map this time. The map shall contain as key the age off the persons and as
value a string which contains the person of that age as you see below:
{18=Adam, 23=Peter;Eva, 42=Max, 62=Moriz}
Peter and Eva have the same age!
Again: Use streams and functions to create the Map.
Hint: Use Collectors.toMap to create the final result.
Output is:
{18=Adam, 23=Peter;Eva, 42=Max, 62=Moriz}
 */
public class Exercise18 {
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

        Map<Integer,String> personmap = persons.stream()
                //third paramater merges, when to items with same key
                .collect(Collectors.toMap(p -> p.age,p -> p.name,(name1,name2) -> name1 + ";" + name2));
        System.out.println(personmap);
    }
}
