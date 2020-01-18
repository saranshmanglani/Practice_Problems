import java.util.*;
class ReverseArrayInGroupsOfGivenSize
{
	public static void reverseGroups(int ar[],int n,int k)
	{
		int start,end;
		for(int x=0;x<n;x+=k)
		{
			start=x;
			end=x+k-1<n ? x+k-1 : n-1;
			while(start<end)
			{
				ar[start]=ar[start]+ar[end];
				ar[end]=ar[start]-ar[end];
				ar[start]=ar[start++]-ar[end--];
			}
		}
		for(int x=0;x<n;x++)
			System.out.print(ar[x]+"\t");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter size of partition");
		int k=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter Values in Array");
		for(int x=0;x<n;x++)
			ar[x]=sc.nextInt();
		System.out.println("Resultant Array");
		reverseGroups(ar,n,k);
	}
}