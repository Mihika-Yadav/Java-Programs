// Program to print a single character with condition

package codingNinja.com;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str =s.next();
		char ch=str.charAt(0);
		System.out.println("Print Condition");
		if(ch>='A'  && ch <='Z')
		{
			System.out.println(1);
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-1);
		}
		// print alphabet
		System.out.println("Print Alphabet");
		while(ch<='z')
		{
			System.out.println(ch);
			ch++;
		}
		// print the odd numbers
		System.out.println("Print the odd number");
		int i=0;
		while(i<20)
		{
			i+=1;
			System.out.println(i);
			i=i+1;
		}	
		s.close();
		System.out.println("Print the even number");
		int d =1;
		while(d<=20)
		{
			d+=1;
			System.out.println(d);
			d++;
		}



		int j=10;
		while(j>0)
		{
			if(j%2==0)
			{
				System.out.print(10-j);
			}
			j--;
		}
		System.out.println("New");
		int k=1;
		while(k<5)
		{
			System.out.print(2*k);
			k=k+1;
		}
		int m=2;
		while(m<10)
		{
			System.out.print(m);
			m*=2;
		}
		
		
		  
		
	}
}


