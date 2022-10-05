// Pair sum in Array   I have to correct this code

package codingNinja.com;

import java.util.Scanner;

public class PairSum {
	private static Scanner r;
	public static int[] input()
	{
		r=new Scanner(System.in);
		int n=r.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=r.nextInt();
		}
		return arr;
	}  
	// pair of sum logic in array
	public static int pairSum(int arr[],int n)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==n)
				{
					sum+=1;
				}
			}
		}
		return sum;
	}
	public static int tripletSum(int arr[],int x)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==x)
					{
						sum+=1;
					}
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Input the array elements");
		int arr[]=input();
		System.out.println("Input the n pair of sum");
		int n=r.nextInt();
		System.out.println("Sum of pair is");
		int sum=pairSum(arr,n);
		System.out.println(sum);
	}

}
