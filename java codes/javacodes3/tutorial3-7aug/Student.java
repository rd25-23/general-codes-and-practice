public class Student {
    // Attributes to store student details
    private int rollNumber;
    private String name;
    private String department;

    public Student(int rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
    }

    public static void main(String[] args) {

        Student student1 = new Student(792, "Ritish Doad", "Computer Science");

        student1.displayDetails();

        System.out.println();

        Student student2 = new Student(102, "Priya Sharma", "Information Technology");
        student2.displayDetails();
    }
}
