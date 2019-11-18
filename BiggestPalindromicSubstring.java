/* Program to find Biggest Palindromic Substring in a String.
   Eg.
	Input : BANANA
	Output: ANANA
*/

import java.io.*;
class BiggestPalindromicSubstring
{
	public boolean checkPalindrome(String str,int len)
	{
		for(int x=0;x<len;x++)
			if(str.charAt(x) != str.charAt(len-x-1))
				return false;
			return true;
	}
	public String stringCheck(String str,int len)
	{
		String result="";
		int min_index=0,max_index=0;
		int difference=max_index-min_index;
		for(int x=0;x<len-1;x++)
		{
			result=Character.toString(str.charAt(x));
			for(int y=x+1;y<len;y++)
			{
				result+=str.charAt(y);
				if(str.charAt(x)==str.charAt(y))
				{
					if(checkPalindrome(result,result.length()))
					{
						if(y-x > difference)
						{
							min_index = x;
							max_index = y;
							difference=y-x;
						}
					}
				}
			}
		}
		return difference>1?str.substring(min_index,max_index+1):"NO Such Substring Found";
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BiggestPalindromicSubstring obj=new BiggestPalindromicSubstring();
		System.out.println("Enter a String");
		String str=br.readLine();
		str=str.toUpperCase();
		System.out.println("Biggest Palindromic SubString: "+obj.stringCheck(str,str.length()));
	}
}