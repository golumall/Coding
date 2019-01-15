

//https://ide.geeksforgeeks.org/kxrfGFW6ie



import java.util.Scanner;
import java.util.HashMap;
class Maximum_Distance_Between_RepeatedEle {
    static int getMaxDist(int a[],int n)
    {
        int dist=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(a[i]))
               hm.put(a[i],i);
            else
               dist=Math.max(dist,i-hm.get(a[i]));
        }
        return dist;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.println(getMaxDist(a,n));
	}
}
