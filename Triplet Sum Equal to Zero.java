
//Time Complexity O(n^2)

//https://ide.geeksforgeeks.org/Cai4VGvDZx

import java.util.Scanner;
import java.util.Arrays;
class TripletSum {
    static boolean getTriplet(int a[],int n)
    {
        boolean f=false;
        int i,j;
        Arrays.sort(a);
        for(i=0;i<n-2;i++)
        {
            int l=1+i;
            int r=n-1;
            while(l<r)
            {
                if(a[i]+a[l]+a[r]==0)
                {
                    System.out.println(a[i]+" "+a[l]+" "+a[r]);
                    f=true;
                    l++;
                    r--;
                }
                else if(a[i]+a[l]+a[r]<0)
                  l++;
                 else
                 r--;
            }
        }
        if(f==true)
        return true;
        else
        return false;
    }
	public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
  a[i]=sc.nextInt();
  if(getTriplet(a,n))
   System.out.println("Found");
  else
   System.out.println("Not Found");
	}
}
