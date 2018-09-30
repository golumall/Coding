
//Sources..
//https://www.geeksforgeeks.org/stepping-numbers/

import java.util.Scanner;
import java.lang.*;
class SteppingNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int src=sc.nextInt();
		int dest=sc.nextInt();
		int f=0,n;

		for(int i=src;i<=dest;i++)
		{
			n=i;
		while(n!=0)
		{
			int x=n%100;
			if(x>=10)
			{
			int y=x%10;
			x=x/10;
			if(Math.abs(x-y)!=1)
			{
				f=1;
				break;
			}
		}
		n=n/10;

		}
		if(f==0)
			System.out.print(i+" ");
		else
			f=0;
			}
	
	}
}
//A number is called stepping number if absolute difference between every digit of number is 1
