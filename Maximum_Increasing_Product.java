
//https://ide.geeksforgeeks.org/1QY5WPcAVX

import java.util.Scanner;

class Maximum_Product_Increasing{
    static int getMaxProduct(int a[],int n)
    {
        int pro1=1,pro2=1;
        for(int i=0;i<n;i++ )
        {
            int k=i;
              pro2=a[k];
            for(int j=i+1;j<n;j++)
            {
                if(a[k]<a[j])
                {
                    pro2=pro2*a[j];
                    k=j;
                }
            }
            pro1=Math.max(pro1,pro2);
        }
    return pro1;
    }
	public static void main (String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		  System.out.println(getMaxProduct(a,n));
		 
	}
}
