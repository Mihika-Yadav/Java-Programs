         // Print the average of three no.

package codingNinja.com;


public class Average {
	public static void main(String[] args) {
		double a = 2,b=5,c=7;
		double avg =(a+b+c)/3;
		System.out.println(avg);
		
		
		// comparison between 3 numbers
		if(a>b && a>c)
		{
			System.out.println("Print a" +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Print b " +b);
		}
		else
		{
			System.out.println("Print c "+c);
		}
		
		// another comparison
		int no =-4;
		if(no>0)
		{
			System.out.println("Print positive");
		}
		else if(no<0)
		{
			System.out.println("No is negative");
		}
		else
		{
			System.out.println("No is equal to zero");
		}
		
		// method used to show the negative or positive
		double df=-23.0;
		double result = Math.signum(df);
		System.out.println("Value of df :" +result);
		
		// program to find the valid triangle if two sides are greater than 3rd side
		int first =23,sec =2,third =45;
		if((first+sec)>third)
		{
			System.out.println("1st & 2nd is greator ");
		}
		else if((first+third)>sec)
		{
			System.out.println("1st & 3rd is greator");
		}
		else
		{
			System.out.println("2nd & 3rd is greator");
		}
		
		if(first >sec && sec>third)
		{
			System.out.println("Conditon false");
		}
		else
		{
			System.out.println("Conditon true third is highest");
		}
		
		// Print numbers from 1 to n
		int num =7;
		System.out.println("Print Numbers");
		for(int i =1;i<num;i++)
		{ 
			System.out.println(i);
		}
		
		// find factorial of a number
		int fact =1;
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("fact :" +fact);
		
		// Print even number in a series of number
		System.out.println("Even numbers");
		for(int i=0;i<=num;i+=2)
		{
			System.out.println(i);
		}
		
		// Find only given is even or odd
		if(num%2==0)
		{
			System.out.println("Print num is even");
		}
		else
		{
			System.out.println("Num is odd");
		}
		int i = 'c';
		System.out.println(i);
		  double p = 55.5;
	        int q = 55;
	        p = p % 10;
	        q = q % 10;
	        System.out.println(p + " "  + q);
		
		
	}

}
