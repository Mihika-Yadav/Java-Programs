    // Program to remove the Duplicate letters in a String

package stringProblems;

import java.util.Scanner;

public class RemoveDuplicate {
	public static String DuplicateConsecutive(String str)
	{
		char lastChar=str.charAt(0);
		String ans=str.charAt(0)+"";
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)!=lastChar)
			{
				ans+=str.charAt(i);
				lastChar=str.charAt(i);
			}
		}
		return ans;
	}
public static void main(String[] args) {
	Scanner r=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=r.nextLine();
	System.out.println(DuplicateConsecutive(str));
	r.close();
}
}
