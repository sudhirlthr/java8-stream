package java8.streams;

import pojo.Employee;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Builder.getEmployeeList();
        OptionalDouble average = employeeList.stream().mapToInt(value -> value.getSalary().intValue()).average();
        System.out.println("Salary average: "+average.orElse(0));
        DoubleSummaryStatistics summaryStatistics = employeeList.stream().mapToDouble(value -> value.getSalary()).summaryStatistics();
        System.out.println("Average: "+summaryStatistics.getAverage());
        System.out.println("Max Salary: "+summaryStatistics.getAverage());
        System.out.println("Min Salary: "+summaryStatistics.getAverage());
        System.out.println("Avetage: "+summaryStatistics.getAverage());

    }
}
