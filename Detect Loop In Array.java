
//Source
//https://www.youtube.com/watch?v=VX2oZkDJeGA

import java.util.Scanner;
class Detect_Loop_In_Array
{
	static boolean checkLoop(int []a,int n)
	{
		int p=0,q=0;
		while(true)
		{
          if(p<0||q<0||p>=n||q>=n)
          	return false;
          p=a[p];
          if(p==q)
          	return true;
          if(p<0||p>=n)
          	return false;
          p=a[p];
          if(p==q)
          	return true;
          q=a[q];
          if(p==q)
            return true;
    }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(checkLoop(a,n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
}
