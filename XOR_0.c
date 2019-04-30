//XOR_0.c


#include<stdio.h>
#include<string.h>
void main()
{
 char str[11]="HELLOWORLD";
 char str1[11];
 int i,len;
 len=strlen(str);
 for(i=0;i<len;i++)
 {
  str1[i]=str[i]^0;
  printf("%c",str1[i]);
 }
}
/*
OUTPUT:
HELLOWORLD
*/