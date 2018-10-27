

import java.io.*;
import java.util.Scanner;

class JumpingNumber {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		    if(i<10)
		    System.out.print(i+" ");
		    else
		    {
		        int j=i;
		        int x,y,f=0;
		        while(j>10)
		        {
		            x=j%10;
		            j=j/10;
		            y=j%10;
		            if(Math.abs(x-y)!=1)
		            {
		                f=1;
		                break;
		            }
		            
		        }
		        if(f==0)
		          System.out.print(i+" ");
		    }
		}
	}
}
