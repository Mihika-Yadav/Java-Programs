 // Pattern of Numeric Pyramid

package codingNinja.com;

import java.util.Scanner;

public class NumericPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int i=1;
	        for( i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n-i;j++)
	            {
	                System.out.print(" ");
	            }s.close();
	            for(int j=1;j<=i;j++)
	            {
	                // System.out.print(j);
	                System.out.print(i-1+j);
	            }
	            for(int dec=i-1;dec>=1;dec--)
	            {
	                // System.out.print(dec);
	                System.out.print(dec+i-1);
	            }
	            System.out.println();
	        }
	        
	}

}
