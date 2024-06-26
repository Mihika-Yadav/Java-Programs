// Program to find the Second-Largest number in an Array



public class FindLargerNo {
    public static int findSecondLargest(int [] arr)
    {
        if(arr.length <2)
        {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(num>first)
            {
                second=first;
                first=num;
            }
            else if(num > second && num != first)
            {
                second =num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int [] arr ={12,56,32,30,476,1};
        System.out.println("Second largest number is  : "+findSecondLargest(arr));
    }
}
