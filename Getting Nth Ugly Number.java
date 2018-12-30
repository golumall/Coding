


//https://ide.geeksforgeeks.org/wOBR9a4yeE


import java.util.Scanner;

class Ugly {
    static boolean check(int k)
    {
        int f=0;
        while(k!=0)
        {
            if(k%2==0)
              k=k/2;
            else if(k%3==0)
             k=k/3;
            else if(k%5==0)
             k=k/5;
            else
            {
                if(k==1)
                  f=0;
                 else
                 f=1;
                  
                k=0;
            
            }
        }
        if(f==0)
        return true;
        else
        return false;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,i=1;
		while(c!=n)
		{
		    int u=i;
		    if(check(u)==true)
		    {
		        c++;
		        i++;
		    }
		    else
		    i++;
		}
		System.out.println(i-1);
	}
}
