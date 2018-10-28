

import java.io.*;
import java.util.Scanner;
class Reverse {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		char a[]=sc.nextLine().toCharArray();
		int end=a.length-1;
		int start=0;
		while(start<end)
		{
		    a[start]^=a[end];
		    a[end]^=a[start];
		    a[start]^=a[end];
		    start++;
		    end--;
		    
		}
		System.out.println(a);
	}
}
