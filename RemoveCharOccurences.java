 // Program to remove the occurerences of a given character in a String
/*
 * like , aabbcddde ,the remove char is d in it-so ans is :aabbce
 */

package stringProblems;

import java.util.Scanner;

public class RemoveCharOccurences {
	public static String RemoveChar(String str,char ch)
	{
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char check=str.charAt(i);
			if(ch==check)
				continue;
			else
			{
				ans=ans+check+"";
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("Input string");
		String str=r.nextLine();
		System.out.println("Input char");
		// to input a character wew should use this
		char ch=r.nextLine().charAt(0);
		System.out.println(RemoveChar(str,ch));
		r.close();
	}
}
