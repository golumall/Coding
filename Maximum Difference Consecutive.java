

//https://ide.geeksforgeeks.org/YAs43eSuOW


import java.util.Arrays;
import java.util.Scanner;

class GFG {
    static int getValue(int a[],int n)
    {
        int max=0,min=a[0];
        if(n>=2)
         max=a[1]-a[0];
         
        for(int i=1;i<n;i++)
        {
           if(a[i]-min>max)
             max=a[i]-min;
           if(a[i]<min)
              min=a[i];
        }
        return max;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		 System.out.println(getValue(a,n)); 
	}
}
