

//https://ide.geeksforgeeks.org/4GMtpsG1Bd

import java.util.Scanner;

class GFG {
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
    static void printAlternatePrime(int n)
    {
        int i=1,j=2;
        while(i<=2*n)
        {
            if(check(j))
            {
                if(i%2!=0)
                  System.out.print(j+" ");
                 i++; 
            }
            j++;
        }
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	printAlternatePrime(n);
	}
}
