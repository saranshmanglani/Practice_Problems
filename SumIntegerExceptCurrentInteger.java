import java.util.*;
class SumIntegerExceptCurrentInteger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter Values in Array");
		int sum=0;
		for(int x=0;x<n;x++)
		{
			ar[x]=sc.nextInt();
			sum+=ar[x];
		}
		System.out.println("Result");
		for(int x=0;x<n;x++)
			System.out.print(sum-ar[x]+"\t");
	}
}