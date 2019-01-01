

//Sources
//https://www.geeksforgeeks.org/stock-buy-sell/

//https://ide.geeksforgeeks.org/YS6ELrNvGi


import java.util.Scanner;

class Maximum_Profit {
    static void printProfit(int a[],int n)
    {
        int i,st=0;
        for(i=1;i<=n;i++)
        {
            if(a[i]<a[i-1])
            {
                System.out.println("By On Day: "+ st+" Sell on Day: "+(i-1));
                st=i;

            }
        }
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		   
	printProfit(a,n);
		
	}
}
