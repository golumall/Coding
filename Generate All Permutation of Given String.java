import java.util.Scanner;
class Permutation
{
	 void printPermute(String a,int l,int r)
	{
		
		if(l==r)
			System.out.print(a+" ");
		else
		{
			for(int i=l;i<=r;i++)
			{
				a=swap(a,l,i);
				printPermute(a,l+1,r);
				a=swap(a,l,i);
			}
		}
	}
	 String swap(String str,int x,int y)
	{
		char b[]=str.toCharArray();
		char temp;
		temp=b[x];
		b[x]=b[y];
		b[y]=temp;

		return String.valueOf(b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		Permutation p=new Permutation();
		p.printPermute(a,0,a.length()-1);
	}
}
