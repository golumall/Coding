
//https://ide.geeksforgeeks.org/45QHv77GfM


import java.util.Scanner;
import java.util.Stack;
class Parenthesis_Balanced {
    
    static int count(String s)
    {
        Stack<Character> st=new Stack<Character>();
        int y=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
               st.push(s.charAt(i));
            else 
            {
                if(st.size()!=0)
                {
                    char x=st.pop();
                    if(s.charAt(i)==')'&&x=='(')
                       y++;
                    else if(s.charAt(i)=='}'&&x=='{')
                      y++;
                    else if(s.charAt(i)==']'&&x=='[')
                     y++;
                    else
                      return y;
                }
                else 
                return y;
            }
        }
        return y;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(count(s));
		
	}
}
