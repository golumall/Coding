

//https://ide.geeksforgeeks.org/dWLj6P9OvP

import java.util.Scanner;

class  Same_Suffix_And_Prefix{
    static boolean check(String s1,String s2)
    {
        if(s1.equals(s2))
           return true;
        return false;   
    }
    static int getValue(String s)
    {
        if(s.length()==1)
		   return 0;
		int i=0,j=s.length()-2,k=s.length()-1,l=1;
		
		while(j>=0)
		{
		    String pre=s.substring(i,j+1);
		    String suf=s.substring(l,k+1);
		    if(check(pre,suf))
		      return j+1;
		  j--;
		  l++;
		      
		}
		return 0;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(getValue(s));
	}
}
