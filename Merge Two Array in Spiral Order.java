

//https://ide.geeksforgeeks.org/4Astok7Vxs



import java.util.Scanner;

class Merge_Two_Array{
    static int[] mergeArrays(int []firstArray,int []secondArray)
    {
        int bigArr[]=new int[firstArray.length+secondArray.length];
        boolean took=true;
        int fa=0,sa=0;
        int breakPoint=-1;
        for(int i=0;i<bigArr.length;i++)
        {
            if(took&&fa<firstArray.length)
            {
                bigArr[i]=firstArray[fa++];
                took=!took;
            }
            else if(!took&&sa<secondArray.length)
            {
                bigArr[i]=secondArray[sa++];
                took=!took;
            }
            else
            {
                breakPoint=i;
                break;
            }
        }
        if(breakPoint!=-1)
        {
            if(fa<firstArray.length)
            {
                for(int i=fa;i<firstArray.length;i++)
                   bigArr[breakPoint++]=firstArray[i];
                
            }
            else
            {
                for(int i=sa;i<secondArray.length;i++)
                  bigArr[breakPoint++]=secondArray[i];
            }
        }
        return bigArr;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		for(int i=0;i<n1;i++)
		  a[i]=sc.nextInt();
		for(int i=0;i<n2;i++)
		  b[i]=sc.nextInt();
		int c[]=mergeArrays(a,b);
		for(int i=0;i<c.length;i++)
          {
              System.out.print(c[i]+" ");
          }
	}
}
