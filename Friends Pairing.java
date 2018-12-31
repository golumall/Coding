

//https://ide.geeksforgeeks.org/fHfb46QdtZ


import java.util.Scanner;

class Friends_Pairing{
    static int getPaire(int n)
    {
        int a[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            if(i<=2)
            a[i]=i;
            else
            a[i]=a[i-1]+(i-1)*a[i-2];
        }
        return a[n];
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getPaire(n));
	}
}
