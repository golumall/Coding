

//https://ide.geeksforgeeks.org/BD86wl3rfi


import java.util.Scanner;
import java.util.Stack;
class Parenthesis_Balanced {
    static boolean check(String s)
    {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
               st.push(s.charAt(i));
            else 
            {
                if(st.size()!=0)
                {
                    char x=st.pop();
                    if(s.charAt(i)==')'&&x!='(')
                       return false;
                    else if(s.charAt(i)=='}'&&x!='{')
                       return false;
                    else if(s.charAt(i)==']'&&x!='[')
                     return false;
                }
                else 
                return false;
            }
        }
        if(st.size()>0)
          return false;
        return true;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}*/
		String s=sc.next();
		if(check(s))
		  System.out.println("Balanced");
		else
		System.out.println("Not Balanced");
		
	}
}
