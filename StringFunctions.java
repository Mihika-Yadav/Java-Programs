// To print or use the functions that is used in String of Java

package stringProblems;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String a="Mihika",b="Yadav";
		System.out.println(a.concat(b));
		// equals return boolean value
		System.out.println(a.equals(b));
		String c="Yadav";
		// compare return a ASCII gap if there is mismatch in Strings
		System.out.println(c.compareTo(a));
		// return boolean value, if it is contain the same value or not
		System.out.println(c.contains(b));		
		System.out.println(a.substring(2));
		String str=b.substring(3);
		System.out.println(str.length());
		Scanner r=new Scanner(System.in);
		String d=r.nextLine();
		System.out.println("string  " +d+ "  "+d.length());
		String str2=r.next();
		System.out.println("str2: "+str2+ " "+str2.length());



		r.close();
	}

}
