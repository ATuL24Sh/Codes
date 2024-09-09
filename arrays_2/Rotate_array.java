/*
You have been given a random integer array/list(ARR) of size N.
Write a function that rotates the given array/list by D elements(towards the left).
Sample Input 1:
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
7
1 2 3 4 5 6 7
0
---------------------
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
 * */
package arrays_2;
import java.util.Scanner;
public class Rotate_array 
{
	public static void R(int a[],int x)
	{
		int i,j,k,n=a.length,t;
		for(i=0;i<x;i++)
	    {
			t=a[0];
			for(j=0;j<n-1;j++)
				a[j]=a[j+1];
			a[n-1]=t;
		}
		for(k=0;k<n;k++)
			System.out.print(a[k]+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int x=sc.nextInt();
		R(arr,x);
	}
}