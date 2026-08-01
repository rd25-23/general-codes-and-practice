#include <stdio.h>
int sub(int a,int b){
    return a-b;
}
int main(){
    int x=10,y=5;
    printf("Subtraction: %d\n",sub(x,y));
    return 0;   
}