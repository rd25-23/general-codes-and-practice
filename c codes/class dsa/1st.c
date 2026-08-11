#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Employee
{
    int id;
    char name[50];
    float salary;
};

int main()
{

    struct Employee emp1, emp2;

    emp1.id = 2;
    strcpy(emp1.name, "John Doe");
    emp1.salary = 50000.0;

    emp2.id = 3;
    strcpy(emp2.name, "Jane Smith");
    emp2.salary = 60000.0;

    printf("Employee 1:\n");
    printf("ID: %d\n", emp1.id);
    printf("Name: %s\n", emp1.name);
    printf("Salary: %.2f\n", emp1.salary);

    printf("\nEmployee 2:\n");
    printf("ID: %d\n", emp2.id);
    printf("Name: %s\n", emp2.name);
    printf("Salary: %.2f\n", emp2.salary);
}
