#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  if(a>5)
  {
    printf("Invalid");
  }
  else
  {
  switch (a)
  {
    case 1:
      printf("one");
      break;
     case 2:
      printf("Two");
      break;
    case 3:
      printf("Three");
      break;
    case 4:
      printf("Four");
      break;
    case 5:
      printf("Five");
      break;
  }
  }

  
    
    
  return 0;
}