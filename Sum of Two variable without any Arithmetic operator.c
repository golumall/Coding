


#include <stdio.h>
int sum(int a,int b)
{
    if(b==0)
      return a;
    int p=a^b;
    int q=(a&b)<<1;
    return sum(p,q);
}
int main() {
	//code
	printf("%d",sum(5,6));
	return 0;
}
