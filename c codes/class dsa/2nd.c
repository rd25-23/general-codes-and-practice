#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Employee
{
    int id;
    char name[50];
    float basicSalary;
    float hra;
    float da;
    float netSalary;
};

int main()
{

    struct Employee *empPtr;

    empPtr = (struct Employee *)malloc(sizeof(struct Employee));

    if (empPtr == NULL)
    {
        printf("Memory allocation failed!\n");
        return 1;
    }

    printf("--- Enter Employee Details ---\n");
    printf("Enter Employee ID: ");
    scanf("%d", &empPtr->id);

    printf("Enter Employee Name: ");
    scanf(" %[^\n]s", empPtr->name);

    printf("Enter Basic Salary: ");
    scanf("%f", &empPtr->basicSalary);

    empPtr->hra = empPtr->basicSalary * 0.20;
    empPtr->da = empPtr->basicSalary * 0.15;
    empPtr->netSalary = empPtr->basicSalary + empPtr->hra + empPtr->da;

    printf("\n--- Employee Salary Slip ---\n");
    printf("Employee ID   : %d\n", empPtr->id);
    printf("Employee Name : %s\n", empPtr->name);
    printf("Basic Salary  : %.2f\n", empPtr->basicSalary);
    printf("HRA           : %.2f\n", empPtr->hra);
    printf("DA            : %.2f\n", empPtr->da);
    printf("Net Salary    : %.2f\n", empPtr->netSalary);

    free(empPtr);
    empPtr = NULL;

    return 0;
}
