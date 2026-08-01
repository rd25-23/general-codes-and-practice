/* ✅ Task 1:

* Create class
* Add default + parameterized constructor

✅ Task 2:

* Add constructor overloading

✅ Task 3:

* Create one object
* Copy it into another

✅ Task 4:

* Add destructor → print message            */

#include <iostream>
using namespace std;

class Student
{
public:
    string name;
    int age;

    Student()
    {
        cout << "default " << endl;
        name = "unknown";
        age = 0;
    }
    Student(string name, int age)
    {
        cout << "parametrized" << endl;
        this->name = name;
        this->age = age;
    }
    Student(string name)
    {
        cout << "one parameter" << endl;
        this->name = name;
        age = 18;
    }
    Student(int age, string name)
    {
        cout << "reverse parameter" << endl;
        this->age = age;
        this->name = name;
    }
    Student(Student &s)
    {
        cout << "copy constructor" << endl;
        name = s.name;
        age = s.age;
    }
    ~Student()
    {
        cout << "destructor called for " << name << endl;
    }
    void display()
    {
        cout << "name: " << name << endl;
        cout << "age: " << age << endl;
        cout << "------------------" << endl;
    }
};

int main()
{
    Student s1;
    s1.display();

    Student s2("Pranav", 18);
    s2.display();

    Student s3("Arjun");
    s3.display();

    {
        Student temp("Temp");
    }

    Student s4(20, "Atharv");
    s4.display();

    Student s5 = s4;
    s5.display();
}
