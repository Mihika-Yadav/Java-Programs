import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // defining arrays
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] num=new int[size];

        //getting values
        for(int i=0;i<size;i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("x value is : ");
        int x=sc.nextInt();

        for(int i=0;i<num.length;i++)
        {
            if(num[i]==x)
            {
                System.out.println(" x is found at index " +i );
            }
        }

        // print values
        for(int i=0;i<size;i++)
        {
            System.out.println(num[i]);
        }

    }
}
