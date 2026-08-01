#include<stdio.h>
int main() {
 int a[5],i,target;
    printf("Enter 5 elements in array:\n");
    for(i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the element to search sum:");
    scanf("%d",&target);
    if(a[0]+a[1]==target)printf("Element found at index 0 and 1\n");
    else if(a[0]+a[2]==target)printf("Element found at index 0 and 2\n");
    else if(a[0]+a[3]==target)printf("Element found at index 0 and 3\n");
    else if(a[0]+a[4]==target)printf("Element found at index 0 and 4\n");
    else if(a[1]+a[2]==target)printf("Element found at index 1 and 2\n");
    else if(a[1]+a[3]==target)printf("Element found at index 1 and 3\n");
    else if(a[1]+a[4]==target)printf("Element found at index 1 and 4\n");
    else if(a[2]+a[3]==target)printf("Element found at index 2 and 3\n");
    else if(a[2]+a[4]==target)printf("Element found at index 2 and 4\n");
    else if(a[3]+a[4]==target)printf("Element found at index 3 and 4\n");
    else
    printf("Element not found\n");
    return 0;
}