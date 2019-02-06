

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void printValue(int n)
    {
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            int r=n%26;
            if(r==0)
            {
                sb.append('Z');
                n=n/26-1;
            }
            else
            {
                sb.append((char)(r-1+'A'));
                n=n/26;
            }
        }
       System.out.println(sb.reverse());
         
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    printValue(n);
		    
		}
	}
}
