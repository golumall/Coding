import java.util.Scanner;
class XorSUm {
    static int getXorSum(int a[],int n)
    {
        int b=0;
        for(int i=0;i<n;i++)
          b|=a[i];
        return (b*(int)Math.pow(2,n-1));  
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		System.out.println(getXorSum(a,n));  
	}
}
