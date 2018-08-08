#include<stdio.h>
#include<string.h>
int main()
{
int row,i,j,k,f=0,l=0;
char pat[200][200];
char mat[300];
scanf("%d",&row);
for(i=0;i<row;i++)
{
	scanf("%s",&pat[i]);
}
scanf("%s",&mat);
for(k=0;mat[k]!='\0';k++)
{
for(i=0;i<row;i++)
{

	for(j=0;pat[i][j]!='\0';j++)
	{
          if(mat[k]==pat[i][j])
          {
          	f=1;
          	pat[i][j]='-';
          	break;
          }
	}
	if(f==1)
		break;
}
if(f==0)
 {
 	printf("\nNotMatched");
 	l=1;
 	break;
 }
 else
 	f=0;
}
if(l==0)
printf("\nMatched");
return 0;
}
