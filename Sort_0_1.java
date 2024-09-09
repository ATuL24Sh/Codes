/*
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. 
Write a function to sort this array/list. 
Think of a solution which scans the array/list only once and don't require use of an extra array/list.
Sample Input 1:
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
8
1 0 1 1 0 1 0 1
------------------
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
------------------
0 0 0 1 1 
*/
package arrays_1;
import java.util.Scanner;
public class Sort_0_1 
{
	public static void sort(int[]a)
	{
		int i=0,temp,n=a.length,j=n-1;
		while(i<j)
		{
			if(a[i]==0 && a[j]==1)
		     	{i++;j--;continue;}
			else
			{
				 if(a[i]==0 && a[j]==0)
				    {i++;continue;}
				 else if(a[i]==1 && a[j]==1)
				    {j--;continue;}
				 /*else if(a[i]==0 && a[j]==1)
				    {i++;j--;continue;}*/
				 else
				 {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i++;
					j--;
				 }	
			}
		}
		for(int k=0;k<n;k++)
			System.out.print(a[k]+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : \n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elements : \n");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sort(arr);
	}
}
