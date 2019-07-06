#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a=n/100;
  int b=n%10;
  int c=a+b;
  printf("%d",c);
  return 0;
}