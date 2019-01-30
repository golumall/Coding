/*package whatever //do not write package name here */

import java.util.Scanner;

class GFG {
    static int getMaxCount(int a[])
    {
        int c=0,max=0;
        for(int i=0;i<a.length;i++)
         {
             if(a[i]==0)
               c=0;
             else
             {
                 c++;
                 max=Math.max(max,c);
             }
         }
         return max;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	      a[i]=sc.nextInt();
	      System.out.println(getMaxCount(a));
	}
}
