#include<stdio.h>
int main()
{
	long long int n;
  //Number
	scanf("%lld",&n);
	long long int k;
  //bit which you want to check
	scanf("%lld",&k);
	if(n&(1<<(k-1)))
		printf("Set\n");
	else
		printf("Not Set\n");
	return 0;
}
