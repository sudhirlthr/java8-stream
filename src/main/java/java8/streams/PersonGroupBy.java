package java8.streams;

import pojo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGroupBy {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "London", 21));
        people.add(new Person("Swann", "London", 21));
        people.add(new Person("Kevin", "London", 23));
        people.add(new Person("Monobo", "Tokyo", 23));
        people.add(new Person("Sam", "Paris", 23));
        people.add(new Person("Nadal", "Paris", 31));


        Map<String, List<Person>> personGroupByCity = people.stream().collect(Collectors.groupingBy(Person::getCity));
        System.out.println(personGroupByCity);
        System.out.println(people.stream().map(Person::getAge).collect(Collectors.summingInt(value -> value)));
    }
}
