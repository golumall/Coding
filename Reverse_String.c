#include<stdio.h>
#include<string.h>
int main()
{
char a[200],temp;
int i,j,n;
//Enter String
gets(a);
j=strlen(a)-1;
for(i=0;i<j;j--,i++)
{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
//Reverse String
puts(a);
	return 0;
}
