import java.util.Scanner;
class BinaryDigit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1,x,j;
		for(int i=1;;i++)
		{
			x=n*i;
			while(x!=0)
			{
				j=x%10;
				if(j!=0&&j!=1)
				{
					f=0;
					break;
				}
				x=x/10;
			}
			if(f==1)
			{
				System.out.println(n*i);
				break;
			}
			else
				f=1;
		}
	}
}
