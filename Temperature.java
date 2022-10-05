         // Program to convert the F int c

package codingNinja.com;

import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s=new Scanner(System.in);
		    int S=s.nextInt();   // start value
		    int E=s.nextInt();   // end value
		    int W=s.nextInt();   // step size
			int fah;
		        
		        while(S<=E)
		        {
		         
		            fah=((5*(S-32))/9);
		             System.out.println(S+" "+fah);
		            S=S+W;
		        }
		        
		        // checking number is prime or not
		        int n=s.nextInt();
		        boolean isprime=true;
		        if(n%2==0)
		            isprime=false;
		        int i=3;
		        while(isprime&&i<n)
		        {
		            isprime=!(n%i==0);
		            i+=2;
		        }
		        if(isprime)
		        {
		            System.out.println("Prime");
		        }
		        else
		        {
		            System.out.println("Composite");
		        }
		        s.close();
		        // another program
		        int j=10;
		        while((j=j-1)>0)
		        {
		            System.out.print(j);
		            if(j%5==0)
		                return;
		        }
		       
			}

		
	}


