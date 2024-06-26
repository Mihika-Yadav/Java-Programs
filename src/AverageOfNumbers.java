import java.util.Scanner;

public class AverageOfNumbers {
    static Scanner scanner=new Scanner(System.in);
    public static void findAverage(int count)
    {
        double sum=0.0;
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter number " +(i+1)+ " : ");
            double number=scanner.nextDouble();
            sum+=number;
        }
        double avg=sum/count;
        System.out.println("The average is: " +avg);
    }

    public static void main(String[] args) {
        System.out.println("Enter to be enter.");
        int count=scanner.nextInt();
        findAverage(count);

    }
}
