// Pattern of mirror image

package codingNinja.com;

import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Palidromic Number");
		int n=s.nextInt();
		int i;
		for( i=1;i<=n;i++)            // for rows
		{
			for(int j=1;j<=n-i;j++)       // for spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)        //for columns
			{
				System.out.print(k);
			}
			for(int dec=i-1;dec>=1;dec--)     // for decreasing number in tree form or 
			{
				System.out.print(dec);
			}s.close();


			System.out.println();
		}
		

	}

}
