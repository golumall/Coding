


    /*package whatever //do not write package name here */

import java.util.Scanner;

class Pair {
    int a,b;
    Pair(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    static int getLongestPair(Pair a[],int n)
    {
        int max=-1;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
          b[i]=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i].a>a[j].b&&b[i]<b[j]+1)
                  b[i]=b[j]+1;
            }
        }
        for(int i=0;i<n;i++)
          {
              if(max<b[i])
              max=b[i];
          }
          return max;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pair a[]=new Pair[n];
		for(int i=0;i<n;i++)
		{
		    int aa=sc.nextInt();
		    int b=sc.nextInt();
		    a[i]=new Pair(aa,b);
		   
		}
		System.out.println(getLongestPair(a,n));
	}
}

//https://ide.geeksforgeeks.org/Y0avIgUQPm
