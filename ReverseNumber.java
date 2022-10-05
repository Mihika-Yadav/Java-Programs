// Program to print the reverse of a number

package codingNinja.com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		int n=r.nextInt(),rev=0;r.close();
		// we already initialize the value of n,so don't put in loop
		for(;n!=0;n/=10)  
		// by dividing we get starting digit except the last one number
		{
			int storeValue=n%10;
			// we use modulus to get the last number by the remainder
			rev=rev*10+storeValue;
			// then we get the values of divide & multiply by 10
			// & add the value of both variable & store in reverse
		}
		System.out.println(rev);
		
		
	}

}
