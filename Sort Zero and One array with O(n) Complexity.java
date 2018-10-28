
import java.io.*;
import java.util.Scanner;
class SortZeroOne {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c0=0,c1=0;
		for(int i=0;i<n;i++)
		{
		   a[i]=sc.nextInt();
		   if(a[i]==0)
		     c0++;
		   else
		     c1++;
		   
		}
		for(int i=0;i<n;i++)
		{
		    if(i<c0)
		    a[i]=0;
		    else
		    a[i]=1;
		}
		for(int i=0;i<n;i++)
		  System.out.print(a[i]+" ");
		
		
	}
}
