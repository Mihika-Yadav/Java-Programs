 // Print all characters of String one by one by using String function

package stringProblems;

import java.util.Scanner;

public class PrintAllChars {
	public static void chars(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		String str=r.nextLine();
		chars(str);
		r.close();
	}

}
