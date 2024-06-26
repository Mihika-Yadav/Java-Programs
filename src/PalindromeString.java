import java.util.Scanner;

public class PalindromeString {
    public static boolean CheckPalindromeStr(String input)
    {
        boolean result=true;
        int length=input.length();
        for(int i=0;i<length/2;i++)
        {
            if(input.charAt(i)!=input.charAt(length-i-1))
            {
                result= false;
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(CheckPalindromeStr(input))
        {
            System.out.print(input + " is palindrome.");
        }
        else {
            System.out.print(input + " is not palindrome.");
        }
    }
}
