#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b;
  b=a%4;
  if(b==0)
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
  return 0;
}