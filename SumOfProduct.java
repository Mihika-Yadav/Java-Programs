package codingNinja.com;

import java.util.Scanner;

public class SumOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		// print the sum & product of the given number by choice
		int a=s.nextInt();    // input number
		int c=s.nextInt();     // input choice

		if(c==1)       // condition to satisfy the choice execute 
		{
			int sum=0;
			for(int i=1;i<=a;i++)
			{
				sum+=i;
			}
			System.out.println(sum);
		}
		else if(c==2)
		{
			int prod=1;
			for(int i=1;i<=a;i++)
			{
				prod*=i;
			}
			System.out.println(prod);
		}
		else
		{
			System.out.println(-1);
		}
		s.close();
	}

}
