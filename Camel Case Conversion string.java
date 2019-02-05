//https://ide.geeksforgeeks.org/bmdnbgHpWM

import java.util.Scanner;

class GFG {
    static String printString(String s)
    {
       String x="";
       for(int i=0;i<s.length();)
       {
           if(s.charAt(i)!=' ')
           {
             x+=Character.toString(s.charAt(i));
             i++;
           }
           else
           {
               x+=Character.toString(Character.toUpperCase(s.charAt(i+1)));
               i+=2;
           }
             
       }
       return x;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(printString(s));
	}
}
