class Student {
    int rollnumber;
    String name;

    public Student(int rollnumber, String name) {
        super();
        this.rollnumber = rollnumber;
        this.name = name;
    }

    void display() {
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");

        s1.display();
        s2.display();
    }
}