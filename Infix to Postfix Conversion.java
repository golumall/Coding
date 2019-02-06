


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static String getPostfix(String s)
    {
        Stack<String> s1=new Stack<String>();
        Stack<Character> s2=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
              s1.push(Character.toString(ch));
             else if(ch=='(')
              s2.push(ch);
             else if(ch==')')
             {
                 while(!s2.isEmpty()&&s2.peek()!='(')
                 {
                     String v2=s1.pop();
                     String v1=s1.pop();
                     String val=v1+v2+s2.pop();
                     s1.push(val);
                 }
                 s2.pop();
             }
             else
             {
                 while(!s2.isEmpty()&&s2.peek()!='('&&precedence(s2.peek())>=precedence(ch))
                 {
                     String v2=s1.pop();
                     String v1=s1.pop();
                     String val=v1+v2+s2.pop();
                     s1.push(val);
                 }
                 s2.push(ch);
             }
        }
        while(!s2.isEmpty())
        {
            String v2=s1.pop();
                     String v1=s1.pop();
                     String val=v1+v2+s2.pop();
                     s1.push(val);
        }
        return s1.pop();
    }
    static int precedence(char ch)
    {
        if(ch=='+'||ch=='-')
          return 1;
        else if(ch=='*'||ch=='/')
          return 2;
        else if(ch=='^')
          return 3;
         return 0; 
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    System.out.println(getPostfix(s));
		}
	}
}
