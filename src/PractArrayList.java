import java.util.ArrayList;
import java.util.Scanner;

public class PractArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=scanner.nextInt();
        System.out.println("Enter the values of arraylist");
        for(int i=0;i<=n;i++)
        {
         // int addElement=scanner.nextInt();
          arraylist.add(scanner.nextInt());
        }
        //print the no of arraylist
        // we don't use--> get method of arraylist to print the elements, bcoz we use for each loop to iterate each element
        System.out.println("Printing elements of arraylist");
        for(int i: arraylist)
        {
            System.out.println(i);
        }
        // to get the size of array --> index is always in arrays start from 0
        System.out.println("Size of ArrayList : "+arraylist.size());
    }
}
