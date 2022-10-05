// Print the SubString of a given String 
/*
 * It is a program related to perform or print the non- repeatable string until to its last conition
 */

package stringProblems;

import java.util.Scanner;

public class PrintSubString {
	// 1st approach
	public static void printAllSubstr(String str)
	{
		System.out.println("1st approach");
		// to print all the string with length
		for(int len=1;len<str.length();len++)	
		{
			for(int s=0;s<=str.length()-len;s++)
			{
				int end=s+len-1;
				System.out.println(str.substring(s, end+1));
			}
		}
	}
	// 2nd approach
	public static void Substr(String str)
	{
		int s=str.length();
		System.out.println("2nd approach");
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<=s;j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		String str=r.nextLine();
		printAllSubstr(str);
		Substr(str);
		r.close();

	}

}
