

//https://ide.geeksforgeeks.org/lmQODONZZD


import java.util.Scanner;
class Conflicts_Appointments {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
		    a[i][0]=sc.nextInt();
		    a[i][1]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
		    for(int j=0;j<i;j++)
		    {
		        if(a[i][0]<a[j][1])
		        {
		         System.out.print("("+a[i][0]+","+a[i][1]+") Conflicts with ");
		         System.out.println("("+a[j][0]+","+a[j][1]+")");
		         break;
		        }
		    }
		}
	}
}
