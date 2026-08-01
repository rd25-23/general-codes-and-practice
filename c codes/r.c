#include <stdio.h>
int main(){
    int num1,num2,num3;
    scanf("%d%d%d",&num1,&num2,&num3);
    char operators;
    scanf(" %c",&operators);
    switch(operators){
        case('+'):printf("addition operator chosen.....");
        printf("The result is:%d",num1+num2+num3);
        break;
        case('-'):printf("subtraction is chosen");
        printf("The result is:%d",num1-num2-num3);
        break;
        case('/'):printf("divission is chosen");
        if(num2==0 || num3==0)printf("Error:Division not possible");
        else {
            (num2>num3)?printf("The result is %.2f", (float)num1/num2):printf("the result is %.2f",(float)num1/num3);
        }
        break;
    }
   return 0;
}