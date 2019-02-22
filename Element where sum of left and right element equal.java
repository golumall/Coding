



import java.util.Scanner;

class GFG {
    static int getElement(int a[])
    {
        int left=0,right=0;
        if(a.length<=2)
         return -1;
        for(int i=1;i<a.length;i++)
          right+=a[i];
        for(int i=0,j=1;i<a.length-1;i++,j++)
        {
            left+=a[i];
            right-=a[j];
            if(left==right)
              return a[i+1];
        }
        return -1;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		 System.out.println(getElement(a)); 
	}
}
