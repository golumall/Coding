import java.util.Scanner;
class TotalDecoding
{
	static int total(char []a,int n)
	{
		if(n==0||n==1)
			return 1;
		int count=0;
		if(a[n-1]>'0')
			count+=total(a,n-1);
		if(a[n-2]=='1'||(a[n-2]=='2'&&a[n-1]<'7'))
			count+=total(a,n-2);
		return count;
	}
   public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);
   		String s=sc.next();
   		System.out.println(total(s.toCharArray(),s.length()));
   	}	
}

/* Input:-  "121"
   Output:-  2
   Input:-   "1234"
   Output:-  3
   */
