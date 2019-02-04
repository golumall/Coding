
//https://ide.geeksforgeeks.org/KgvwEvDX3i


import java.util.*;

class Random_Paragraph{
    static String printWord(int n)
    {
        int l=97,h=122;
        Random rand=new Random();
        StringBuffer sb = new StringBuffer(n);
        for(int i=0;i<n;i++)
        {
            int nextChar=l+(int)(rand.nextFloat()*(h-l+1));
            sb.append((char)nextChar);
        }
        return sb.toString();
        
    }
    static String printWordCaps(int n)
    {
        int l=65,h=90;
        Random rand=new Random();
        StringBuffer sb = new StringBuffer(n);
        for(int i=0;i<n;i++)
        {
            int nextChar=l+(int)(rand.nextFloat()*(h-l+1));
            sb.append((char)nextChar);
        }
        return sb.toString();
        
    }
	public static void main (String[] args) {
		Random rand=new Random();
		int p=rand.nextInt(2)+2;
		int s=rand.nextInt(6)+6;
		
		for(int i=1;i<=p;i++)
		{
		    System.out.print(printWordCaps(1));
		    for(int j=1;j<=s;j++)
		    {
		        if(j!=s)
		        System.out.print(printWord(rand.nextInt(4)+3)+" ");
		        else
		        System.out.print(printWord(rand.nextInt(4)+3));
		    }
		    if(i!=p)
		    System.out.print(". "+printWordCaps(1));
		    
		}
	}
}
