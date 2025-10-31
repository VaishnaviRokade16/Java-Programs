import java.util.ArrayList;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vaishnavi", 1));
        employees.add(new Employee("Shree", 2));

        for (Employee e : employees) {
            System.out.println("ID: " + e.id + ", Name: " + e.name);
        }
    }
}

