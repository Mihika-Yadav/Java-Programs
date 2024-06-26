// Program to print the merge sort.

public class MergeSort {
// time complexity is nlogn

    public static void conquer(int arr[], int si, int mid,int ei)
    {
        int merger[]=new int[ei -si+1];
        int idx1=si,idx2=mid+1;
        int x=0;

        // O(n)
        while(idx1 <=mid && idx2 <=ei)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merger[x++] =arr[idx1++];
            }
            else {
                merger[x++]=arr[idx2++];
            }
        }

        while(idx1<= mid)
        {
            merger[x++]=arr[idx1++];
        }
        while(idx2 <= ei)
        {
            merger[x++]=arr[idx2++];
        }

        for(int i=0,j=si;i<merger.length;i++,j++)
        {
            arr[j]=merger[i];
        }
    }
public static void divide(int arr[],int si,int ei)
{
    if(si >= ei)
    {
        return;
    }
   int mid=si+(ei-si)/2;
    //logn
    divide(arr,si,mid);
    divide(arr,mid+1,ei);
    conquer(arr,si,mid,ei);
}

    public static void main(String[] args) {
        int arr[] ={1,4,7,2,6};
        int n=arr.length;

        divide(arr,0,n-1);
        // print

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
