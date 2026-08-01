#include<stdio.h>
int sub(int a ,int b){return a-b;}
int add(int a,int b){return a+b;}
int main()
{
    int l,s;
    scanf("%d %d",&l,&s);

    int result=add(l,s);
    printf("Addition is %d",result);
    result=sub(l,s);
    printf("\n Subtraction=%d",result);
    return 0;
}