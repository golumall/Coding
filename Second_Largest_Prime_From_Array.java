
//https://ide.geeksforgeeks.org/QCvPnBiCfD

import java.util.Scanner;
class Large_Prime{
    static boolean check(int n)
    {
        if(n<=1)
          return false;
        for(int i=2;i<=n/2;i++)
          {
              if(n%i==0)
                return false;
          }
          return true;
    }
    static int getSecondPrime(int a[],int n)
    {
      int f,s,in1=-1,in2=-1;
      f=s=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
      {
          if(a[i]>f)
          {
              if(check(a[i]))
              {
              s=f;
              f=a[i];
              in1=in2;
              in2=i;
              }
          }
          else if(a[i]>s)
          {
              if(check(a[i]))
              {
              s=a[i];
              in1=i;
              }
          }
      }
      System.out.println(in1);
      return s;
    }
	public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
        System.out.println(getSecondPrime(a,n));           
	}
}
