import java.util.Scanner;

public class BinarySearch {
    // iterative binary search method

    public static int binarySearchIterative(int [] arr,int target)
    {
        int left =0;
        int right=arr.length-1;

        while(left <= right)
        {
            int mid = left + (right -left) /2;

            // check if target is present at mid

            if(arr[mid]== target)
            {
                return mid;
            }
            // if target is greater, ignore left half
            if(arr[mid] < target)
            {
                left =mid+1;
            }
            else {
                // if target is smaller, ignore right half
                right = mid-1;
            }
        }
        // target was not found in the array

        return -1;
    }

    public static int binarySearchRecursive(int arr[],int left,int right,int target)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;


            //check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[mid]>target)
            {
                return binarySearchRecursive(arr,left,mid-1,target);
            }
            return  binarySearchRecursive(arr,mid+1,right,target);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr =new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        // target value to be search
        System.out.println("Target value to be searched: ");
        int target=sc.nextInt();

        int result=binarySearchIterative(arr,target);
        if(result == -1)
        {
            System.out.println("Element not present at arr. ");
        }
        else {
            System.out.println("Element found at index : " +result);
        }
        System.out.println("Recursive binary search");
        int recur=binarySearchRecursive(arr,0, arr.length-1,target);
        if(result == -1)
        {
            System.out.println("Element not present at arr. ");
        }
        else {
            System.out.println("Element found at index : " +recur);
        }
    }
}

