#include <stdio.h>

int main() {
    int n, i;
    float marks[100], total = 0, average;

    printf("Enter number of subjects: ");
    scanf("%d", &n);

    // Input marks for each subject
    for (i = 0; i < n; i++) {
        printf("Enter marks of subject %d: ", i + 1);
        scanf("%f", &marks[i]);
        total += marks[i];
    }

    // Calculate average
    average = total / n;

    printf("\nTotal Marks = %.2f\n", total);
    printf("Average = %.2f\n", average);

    // Determine grade
    if (average >= 90)
        printf("Grade: A+\n");
    else if (average >= 80)
        printf("Grade: A\n");
    else if (average >= 70)
        printf("Grade: B\n");
    else if (average >= 60)
        printf("Grade: C\n");
    else if (average >= 50)
        printf("Grade: D\n");
    else
        printf("Grade: F (Fail)\n");

    return 0;
}
