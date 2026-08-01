#include <iostream>
using namespace std;
class Student // class name should be in capital letter
{
public:
    string name;
    int age;

    Student(string name, int age)
    {
        (*this).name = name;
        (*this).age = age;
    }

    void display()
    {
        cout << "name:" << name << endl;
        cout << "age:" << age << endl;
        cout << "------------------" << endl;
    }
};

int main()
{

    Student s1("Ritish", 18);
    s1.display();

    Student s2("Rohit", 20);
    s2.display();
}