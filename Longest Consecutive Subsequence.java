
//https://ide.geeksforgeeks.org/SNdwnuuC0P

import java.util.HashSet;
import java.util.Scanner;
class GFG {
    static int getElement(int a[])
    {
        int res=Integer.MIN_VALUE;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
           hs.add(a[i]);
        for(int i=0;i<a.length;i++)
        {
            if(!hs.contains(a[i]-1))
            {
                int j=a[i];
                while(hs.contains(j))
                  j++;
                  
                if(res<j-a[i])
                  res=j-a[i];
            }
        }
        return res;
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
