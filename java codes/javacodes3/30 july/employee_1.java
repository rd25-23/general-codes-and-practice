import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    void acceptData(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void displayData() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class employee_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        emp.acceptData(id, name, salary);
        emp.displayData();

        sc.close();
    }
}