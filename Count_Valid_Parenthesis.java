import java.util.Stack;
import java.util.Scanner;
class ValidParanthesis
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
    //Create a Empty Stack
		Stack<Integer> st=new Stack<Integer>();
    //push -1 in to stack
		st.push(-1);
		int res=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				st.push(i);
			else
			{
				st.pop();
				if(!st.isEmpty())
        res=Math.max(res,i-st.peek());
        else
         st.push(i);
			}
		}
		System.out.println(res);
	}
}

/*Ex.:-  Input:-  ((()
         Output:- 2
         Input:-  ((()))))
         Output:- 6
         Input:-((((((((((((((((
         Output:- 0
         */
