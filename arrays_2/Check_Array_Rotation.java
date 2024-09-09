/*
Check Array Rotation :
You have been given an integer array/list(ARR) of size N.
It has been sorted(in increasing order) and then rotated by some number 'K' (K is greater than 0)
in the right hand direction.
Your task is to write a function that returns the value of 'K', that means,
the index from which the array/list has been rotated.
Sample Input 1:
6
5 6 1 2 3 4
Sample Output 1:
2
Sample Input 2:
5
3 6 8 9 10
--------------
4
10 20 30 1
Sample Output 2:
0
3
*/
package arrays_2;
import java.util.Scanner;
public class Check_Array_Rotation 
{
	public static void check(int a[])
	{
		int i,j,t,n=a.length,c=1;
		for(int q=0;q<n-1;q++)
		{
			if(a[q]>a[q+1])
				break;
			else
				c++;
		}
		if(c==n)
			System.out.print("0");
		else
			System.out.print(c);	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		check(arr);
	}
}