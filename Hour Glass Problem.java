

//https://ide.geeksforgeeks.org/rbRc5GgfMk
//Sources
//https://www.geeksforgeeks.org/maximum-sum-hour-glass-matrix/

import java.util.Scanner;
class Hour_Glass {
    static int getMaxGlass(int a[][],int r,int c)
    {
        int max=0,sum=0;
        if(r<=2||c<=2)
          return max;
         for(int i=0;i<r-2;i++)
         {
             for(int j=0;j<c-2;j++)
             {
                 sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                 max=Math.max(max,sum);
             }
             
         }
         return max;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		    a[i][j]=sc.nextInt();
		    }
		}
		System.out.println(getMaxGlass(a,r,c));
	}
}
