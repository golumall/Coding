
//https://ide.geeksforgeeks.org/bhV1nTvN4G
//Sources
//https://www.geeksforgeeks.org/path-maximum-average-value/


import java.util.Scanner;

class Path_With_Maximum_Average {
    static double getMaxAverage(int a[][],int n)
    {
        int dp[][]=new int[n+1][n+1];
        dp[0][0]=a[0][0];
        for(int i=1;i<n;i++)
        {
            dp[i][0]=dp[i-1][0]+a[i][0];
        }
        for(int j=1;j<n;j++)
          dp[0][j]=dp[0][j-1]+a[0][j];
         for(int i=1;i<n;i++)
         {
             for(int j=1;j<n;j++)
             {
                 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+a[i][j];
             }
         }
         return (double)dp[n-1][n-1]/(2*n-1);
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		System.out.println(getMaxAverage(a,n));
	}
}
