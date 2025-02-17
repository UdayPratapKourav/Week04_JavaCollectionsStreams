package com.mapinterface.groupobjectsbyproperty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "Finance")
        );

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        groupedEmployees.forEach((department, empList) ->
                System.out.println(department + ": " + empList));
    }
}
