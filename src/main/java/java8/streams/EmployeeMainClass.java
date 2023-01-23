package java8.streams;

import pojo.Employee;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMainClass {
    public static void main(String[] args) {
        List<Employee> employeeList = Builder.getEmployeeList();
        /*employeeList.stream().forEach(employee -> {
            System.out.print("Id: "+employee.getId());
            System.out.print(" First Name: "+employee.getFname());
            System.out.print(" Last Name: "+employee.getLname());
            System.out.print(" Salary: "+employee.getSalary());
            employee.getAddressList().stream().forEach(address -> {
                System.out.print(",House number: "+address.getHouseNumber());
                System.out.print(",Locality: "+address.getLocality());
                System.out.print(",City: "+address.getDistrict());
                System.out.print(",Pincode: "+address.getPincode());
                System.out.print(",Capital name: "+address.getState().getCapitalName());
            });
            System.out.println();
        });*/

       printEmployeeList(employeeList);
       //sort employee based on name
        employeeList.stream().sorted(Comparator.comparing(Employee::getFname)).forEach(employee -> System.out.println(employee.getFname()));

        // Second highest salary of an employee
        System.out.println("Second highest salary: "+employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get());

        // Using Iterator remove 2nd highest salary
        Double secondHighestSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get().getSalary();
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (employee.getSalary().equals(secondHighestSalary)){
                iterator.remove();
                System.out.println("\nEmployee with Salary: "+secondHighestSalary+" has been deleted!");
            }
        }
        printEmployeeList(employeeList);

        // get employees GroupBy id
        printEmplyeeListGroupById(employeeList);
        getEmployeeByDepartmentName(Builder.getEmployeeListWithDepartment()).forEach((dept, employee) -> {
            System.out.println("Department: "+dept+", employee: "+employee.toString());
        });
    }

    private static void printEmplyeeListGroupById(List<Employee> employeeList) {
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getId)));
    }

    private static void printEmployeeList(List<Employee> employeeList) {
        // List of employee with salary in increasing order
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(employee -> {
            System.out.print("Id: "+employee.getId());
            System.out.print(" First Name: "+employee.getFname());
            System.out.print(" Last Name: "+employee.getLname());
            System.out.print(" Salary: "+employee.getSalary());
            employee.getAddressList().stream().forEach(address -> {
                System.out.print(",House number: "+address.getHouseNumber());
                System.out.print(",Locality: "+address.getLocality());
                System.out.print(",City: "+address.getDistrict());
                System.out.print(",Pincode: "+address.getPincode());
                System.out.print(",Capital name: "+address.getState().getCapitalName());
            });
            System.out.println();
        });
    }
    private static Map<String, List<Employee>> getEmployeeByDepartmentName(List<Employee> employeeList){
        Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(
                employee -> employee.getDepartment(),
                Collectors.mapping(employee -> employee, Collectors.toList())
        ));
        return map;
    }
}
