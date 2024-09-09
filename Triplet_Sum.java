/*
 * You have been given a random integer array/list(ARR) and a number X. 
 * Find and return the number of triplets in the array/list which sum to X.
 * 
Sample Input 1:
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
7
1 2 3 4 5 6 7 
19
----------------
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
-----------------
5
 */
package arrays_1;

import java.util.Scanner;

public class Triplet_Sum 
{
	public static void tripletsum(int []a,int x)
	{
		int i,j,k,c=0,n=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1;k<n;k++)
					if(a[i]+a[j]+a[k]==x)
						c++;
			}
		}
		System.out.print("total number of triplets in the array which sum to "+x+" are : "+c);
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
		System.out.print("Enter a number : \n");
		int x=sc.nextInt();
		tripletsum(arr,x);
	}
	
}
