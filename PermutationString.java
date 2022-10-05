// check string is permutation or not
/*
 * Permutation in String means checking that the given string and another String is both containing 
 * the same aphabets or not like ABCDE in (String 1) and CDEBA(String 2), they both have same elements
 * and ABDS (String 1) & CHDG (String 2), then they r not permuate, this is the program we do
 */

package stringProblems;

import java.util.Scanner;

public class PermutationString {
	public static boolean CheckPermuate(String str,String str1) 
	{
		// frequency array to get all ASCII values
		int freqArr[]=new int[256];
		int count=0;
		// 1st string loop to pass value in array
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			freqArr[ch]=freqArr[ch]+1;
		}
		// 2nd string loop to pass value in array 
		for(int i=0;i<str1.length();i++)
		{
			int ch=str1.charAt(i);
			freqArr[ch]=freqArr[ch]-1;
		}
		for(int i=0;i<256;i++)
		{
			if(freqArr[i]==0)
				count++;
		}
		if(count==256)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		String str=r.nextLine(),str1=r.nextLine();
		boolean ans=CheckPermuate(str,str1);
		System.out.println(ans);
		r.close();
	}

}
