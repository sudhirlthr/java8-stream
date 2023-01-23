package java8.streams;

import com.github.javafaker.Faker;
import pojo.Address;
import pojo.Employee;
import pojo.State;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Builder {
    private static Faker faker = new Faker();
    public static List<State> getStateList(){
        return Stream.of(new State("jharkhand", "Ranchi"),
                new State("Bihar", "Patna"),
                new State("uttar pradesh", "Lucknow"),
                new State("himachal pradesh", "Shimla"),
                new State("Delhi", "New Delhi"),
                new State("Rajasthan", "Jaipur"),
                new State("Punjab", "Chandigadh"),
                new State("haryana", "Chandigadh"),
                new State("Sikkim", "Gangtok"),
                new State("Assam", "Dispur"),
                new State("Meghalaya", "Shilong"),
                new State("tripura","Aggartalla")
                ).collect(Collectors.toList());
    }
    public static List<Employee> getEmployeeList(){
        return Stream.of(new Employee(new Random().nextLong(6), "Raj", "Malhotra", new Random().nextDouble(10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList()),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList())
                ).collect(Collectors.toList());
    }
    public static List<Address> getAddressList(){
        return Stream.of(new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("tripura","Aggartalla")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("tripura","Aggartalla")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("Bihar", "Patna")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("Jharkhand","Ranchi")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("Rajasthan", "Jaipur")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("haryana", "Chandigadh")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("Assam", "Dispur")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("Meghalaya", "Shilong")),
                new Address(faker.address().buildingNumber(), faker.address().streetAddress(), faker.address().zipCode(), faker.address().cityName(), new State("Telangana","Hyderabad"))
        ).collect(Collectors.toList());
    }

    public static List<Employee> getEmployeeListWithDepartment(){
        return Stream.of(new Employee(new Random().nextLong(6), "Raj", "Malhotra", new Random().nextDouble(10), getAddressList(), "Engineering"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "Finance"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "Engineering"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "Support"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "Engineering"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "HR"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "HR"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "Finance"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "Finance"),
                new Employee(new Random().nextLong(6), faker.name().firstName(), faker.name().lastName(), new Random().nextDouble(4,10), getAddressList(), "Engineering")
        ).collect(Collectors.toList());
    }
}
