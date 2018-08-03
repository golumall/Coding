#include<stdio.h>
#include<string.h>
int main()
{
char a[100],s[100];
int n,m,i,j,f=0;
//Enter string
gets(a);
//Enter Substring
gets(s);

n=strlen(a);

m=strlen(s);
j=0;
for(i=0;i<n;)
{
   if(a[i]==s[j])
   {
   	
   		j++;
   		i++;
   
   	
   }
   else
   {
   	if(j<m)
   	{
   	i=i-j+1;
   	j=0;
    }
   else
   	{
   		f=1;
   		break;
   	}
   }

}
if(f==0)
printf("%s is not sub string of %s",s,a);
else
printf("%s is sub string of %s",s,a);
return 0;
}

