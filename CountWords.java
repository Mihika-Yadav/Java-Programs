 // Program to print the total number of words in a String not letters

package stringProblems;

import java.util.Scanner;

public class CountWords {
	public static int CountW(String str)
	{
		if(str.length()==0)
			return 0;
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' '))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		String str=r.nextLine();
		System.out.println(CountW(str));
		r.close();
	}
}
