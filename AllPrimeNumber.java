package codingNinja.com;

import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// printing the odd prime numbers
		Scanner s=new Scanner (System.in);
        int n=s.nextInt();
       int check;
        for(int i=2;i<=n;i++)
        {
            check=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    check++;
                    break;
                }
            }
                if(check==0)
                System.out.println(i);

            }
     
     s.close();
       
        }
}
	


