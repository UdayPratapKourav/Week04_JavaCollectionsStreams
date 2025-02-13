package saveandretrieveobject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String fileName="src/main/java/saveandretrieveobject/file.txt";

    public static void serializeEmployees(List<Employee>employees){
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(employees);
            System.out.println("Employees have been serialized and saved to " + fileName);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static List<Employee> deserializeEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            employees = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while deserializing employees: " + e.getMessage());
        }
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John Doe", "Engineering", 75000));
        employees.add(new Employee(102, "Jane Smith", "HR", 65000));
        employees.add(new Employee(103, "Mike Johnson", "Finance", 72000));

        serializeEmployees(employees);

        List<Employee> retrievedEmployees = deserializeEmployees();
        System.out.println("Retrieved Employees:");
        for (Employee emp : retrievedEmployees) {
            System.out.println(emp);
        }

    }
}
