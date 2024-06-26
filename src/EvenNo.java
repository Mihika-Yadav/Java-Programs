import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// All possible ways to find the even no
public class EvenNo {
    public static void SingleNo(int num)
    {
        if(num%2==0)
        {
            System.out.println(num +" is even.");
        }
        else {
            System.out.println(num + " is odd");
        }
    }

    // find even in array
    public static void arrayEven(int []num)
    {
        System.out.println("Even no in an array");
        for(int n:num)
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
        }
    }

    //finding even numbers in a list
    public static void listEven()
    {
        List<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Even numbers in the list: ");
        for(int n :num)
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
        }
    }
    // check even no through recursion
    public static void recursionEven(int start,int end)
    {
        if(start>end)
        {
            return;
        }

        if(start % 2==0)
        {
            System.out.println(start);
        }
        recursionEven(start+1,end);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        SingleNo(n);
        System.out.println("Enter the array elements");
        int []num =new int[n];
        for(int i=0;i<n;i++)
        {
           num[i]=scanner.nextInt();
        }
        //Method 2
        arrayEven(num);
        // Method 3
        listEven();
        System.out.println("Check through recursion");
        int start=scanner.nextInt(),end=scanner.nextInt();
        recursionEven(start,end);
    }

}
