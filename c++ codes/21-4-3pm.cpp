#include <iostream>
using namespace std;
class Student
{
private:
    string name;
    int age;

public:
    Student(string name, int age)
    {
        this->name = name;
        this->age = age;
    }
    void setage(int age)
    {
        if (age > 0)
        {
            this->age = age;
        }
    }
    int getage()
    {
        return age;
    }
    string getname()
    {
        return name;
    }
};
int main()
{
    Student s1("Pranav", 18);
    cout << s1.getname() << endl;
    cout << s1.getage() << endl;
    s1.setage(20);
    cout << s1.getage() << endl;
}