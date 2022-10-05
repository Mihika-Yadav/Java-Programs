package codingNinja.com;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		// conversion by defined method of binary to decimal
		String n=s.nextLine();
		System.out.println(Integer.parseInt(n,2));

		//code by defining the logic 
		int num=s.nextInt();
		int decimal=0,p=0;       
		while(num!=0)
		{
			decimal+=((num%10)*Math.pow(2,p));
			num=num/10;
			p++;
		}
		System.out.println(decimal);

		// code by using method to convert decimal into binary

		int dec=s.nextInt();
		s.close();
		// convert into binary & represent in String
		String str=Integer.toBinaryString(dec);
		System.out.println(str);
	}

}
