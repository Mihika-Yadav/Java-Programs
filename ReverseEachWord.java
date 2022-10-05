// Program to print reversing of each word

package stringProblems;

import java.util.Scanner;

public class ReverseEachWord {
	public static String reverseEveryWord(String str)
	{
		String ans="";
		int currentWordStart=0;
		int i=0;
		for(;i<str.length();i++)
		{
			// check the space in String 
			if(str.charAt(i)==' ')
			{
				//reverse current Word
				int currentWordEnd=i-1;
				String reversedWord="";
				for(int j=currentWordStart;j<=currentWordEnd;j++)
				{
					reversedWord=str.charAt(j) +reversedWord;
				}
				// Add it to final String
				ans+=reversedWord+" ";
				currentWordStart=i+1;
			}
		}
		// again write these condition to reverse the last string
		int currentWordEnd=i-1;
		String reversedWord="";
		for(int j=currentWordStart;j<=currentWordEnd;j++)
		{
			reversedWord=str.charAt(j) +reversedWord;
		}
		// Add it to final String
		ans+=reversedWord+" ";
		return ans;
	}
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("Input the string");
		String str=r.nextLine();
		System.out.println(reverseEveryWord(str));
		r.close();
	}

}
