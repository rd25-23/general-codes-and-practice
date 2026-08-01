#include <stdio.h>
int main()
{
    int note50,note20,note10,note5,note2,note1,amount;
    scanf("%d",&amount);
    if(amount<=0||amount>=100001)printf("Invalid Input");
    else if(amount%50==0)printf("50:%d\n20:0\n10:0\n5:0\n2:0\n1:0",note50=amount/50);
    else printf("50:%d\n20:%d\n10:%d\n5:%d\n2:%d\n1:%d\n",note50=amount/50,note20=(amount-50*note50)/20,note10=(amount-50*note50-20*note20)/10,note5=(amount-50*note50-20*note20-10*note10)/5,note2=(amount-50*note50-20*note20-10*note10-5*note5)/2,note1=(amount-50*note50-20*note20-10*note10-5*note5-2*note2)/1);
	return 0;
}