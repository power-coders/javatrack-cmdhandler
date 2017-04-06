package StreamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by joris on 19.01.17.
 */
/*
Define a simple Person class.
Then create a list of Persons with:
List<Person> persons = Arrays.asList(
new Person("Adam", 18),
new Person("Peter", 23),
new Person("Eva", 23),
new Person("Moriz", 62),
new Person("Max", 42));
Use streams and functions to create a new filtered list which contains only persons which name start with M. Then display the new list.
Output is:
[Moriz, Max]
 */
public class Exercise14 {


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

         List<Person> filteredpersons = persons.stream()
                 .filter(p -> p.name.startsWith("M"))
                 .collect(Collectors.toList());
         System.out.println(filteredpersons.toString());

        System.out.println(persons.stream().map(p -> p.age).reduce((a,b) -> a+b));

    }
}
