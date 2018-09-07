import java.util.*;
class Lis
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		n=sc.nextInt();
		int []a=new int[n];
		for(i=0;i<n;i++)
		{
          a[i]=sc.nextInt();
		}
		System.out.println(li_s(a,n));
	}
	static int li_s(int []a,int n)
	{
		int i,j,max=1,x=1,y;
    for(i=0;i<n-1;i++)
    {
    	y=i;
    	for(j=i+1;j<n;j++)
    	{
    		if(a[y]<=a[j])
    		{
    			x++;
    			y=j;
    		}
    	}
    	if(max<x)
    		max=x;
    	x=1;
    }
    return max;
	}
}
