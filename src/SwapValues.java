import java.util.Scanner;

public class SwapValues {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();

        System.out.println("Before Swapping : " +a +" & "+b);

        // swap without using third var,add two var and then subtract each of one value from that values get swap
        a=a+b; // a=10 ,b=20 => 30
        b=a-b; // 30-20 =10 => value of b is now 10
        a=a-b;  // a=30 and updated value of b is 10 =>30-10=20

        System.out.println("After swapping : "+a +" & "+b);
    }
}
