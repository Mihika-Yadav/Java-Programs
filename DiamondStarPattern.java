package codingNinja.com;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		System.out.println("*");
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("*");
		}
		for(int i=n-1;i>=1;i--)
		{
			System.out.print("*");
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("*");
		}
		System.out.println("*");
	}

}
