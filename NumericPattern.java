// Program to print different types of code pattern

package codingNinja.com;

import java.util.Scanner;

public class NumericPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		// print the pattern same pattern in rectangular form
		// so we use i=n & j=n for rectangle

		System.out.println(" Same no. of Rows & Columns ");
		int i =1;
		while(i<=n)
		{
			int j =1;
			while(j<=n)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("Print the same no. in cols");
		int b=1;
		while(b<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(b);
				j++;
			}
			System.out.println();
			b++;
		}
		System.out.println("Print invert no with same no of rows & cols");
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				System.out.print(n-c+1);
			}
			System.out.println();
		}
		System.out.println("Print Coding ninja");
		for(int r=1;r<=n;r++)
		{
			for(int sp=1;sp<r-n;sp++)
			{
				System.out.print(" ");
			}
			for(int c =1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}
