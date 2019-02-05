

//

import java.util.Arrays;
import java.util.Scanner;

class GFG {
    static int getValue(int a[],int n)
    {
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]>a[k])
                     count++;
                     else
                     break;
                }
            }
        }
        return count;
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
