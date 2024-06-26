import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int number)
    {
        int reverseNo = 0;
        int originalNo=number;

        // palindrome logic to reverse the no
        while(number > 0)
        {
            int digit = number % 10;
            reverseNo = reverseNo * 10 + digit;
            number /=10;
        }

        //check if the originalNo is equal to reverseNo.
        return originalNo == reverseNo;
    }
//    public static boolean isPalinDrome2(int number)
//    {
//        String original=String.valueOF(number);
//        StringBuilder reverse=new StringBuilder(original);
//        return original.equals(reverse.toString());
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isPalindrome(number))
        {
            System.out.println(number+ " is palindrome");
        }
        else {
            System.out.println(number + "is not palindrome");
        }
        sc.close();
    }
}
