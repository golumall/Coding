/*package whatever //do not write package name here */

import java.util.*;

class Knapsack {
    static int max(int a,int b)
    {
        return a>b?a:b;
    }
    static int maxProfit(int wt[],int val[],int w,int n)
    {
        if(n==0||w==0)
          return 0;
        if(wt[n-1]>w)
          return maxProfit(wt,val,w,n-1);
        else
          return max(maxProfit(wt,val,w,n-1),val[n-1]+maxProfit(wt,val,w-wt[n-1],n-1));
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int wt[]=new int[n];
		int val[]=new int[n];
		int w=sc.nextInt();
		for(int i=0;i<n;i++)
		  wt[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		  val[i]=sc.nextInt();
		System.out.println(maxProfit(wt,val,w,n));  
	}
}
