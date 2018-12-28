

//https://ide.geeksforgeeks.org/11KeGj2JaK


import java.util.Scanner;

class Gcd_Of_N_Number {
    static int gcd(int a,int b)
    {
        if(b==0)
          return a;
        return gcd(b,a%b);
    }
    static int getGcd(int a[],int n)
    {
        int x=a[0];
        for(int i=1;i<n;i++)
        {
            x=gcd(x,a[i]);
        }
        return x;
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	System.out.println(getGcd(a,n));
	}
}
