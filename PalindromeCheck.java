 // program to input the palindrome string and return the boolean value acc. to condition 

package stringProblems;

import java.util.Scanner;

public class PalindromeCheck {
public static boolean palinCheck(String str)
{
	int sIndex=0,lastIndex=str.length()-1;
	while(sIndex<=lastIndex)
	{
		if(str.charAt(sIndex) != str.charAt(lastIndex))
		{
			return false; // if both not equal
		}
		sIndex++;
		lastIndex--;
	}
	return true;
}
public static void main(String[] args) {
	Scanner r=new Scanner(System.in);
	String str=r.nextLine();
	System.out.println(palinCheck(str));
	r.close();
}
}
