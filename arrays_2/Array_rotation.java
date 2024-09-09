/*
There is an array ‘A’ of size ‘N’.
You are also given an integer ‘X’ and direction ‘DIR’. 
You must rotate the array in the direction of ‘DIR’ by ‘X’ positions.
You must return the rotated array.
For example:
Input :
A = [6, 2, 6, 1], X = 1, DIR = ‘LEFT’
Output :
2 6 1 6
Explanation: Rotate array ‘A’ to the left one time.
[6, 2, 6, 1] => [2, 6, 1, 6]
Sample Input 1 :
4 1 LEFT
1 2 3 4
-------------
6 2 RIGHT
1 2 4 3 5 6 
Sample Output 1 :
2 3 4 1
5 6 1 2 4 3
Explanation Of Sample Input 1 :
For test case one:

Input :
A = [1, 2, 3, 4], X = 1, DIR = ‘LEFT’

Output :
2 3 4 1

Explanation: Rotate array ‘A’ to the left one time.
[1, 2, 3, 4] => [2, 3, 4, 1]

For test case two:

Input :
A = [1, 2, 4, 3, 5, 6], X = 2, DIR = ‘RIGHT’

Output :
5 6 1 2 4 3

Explanation: Rotate array ‘A’ to the right one time.
[1, 2, 4, 3, 5, 6] => [6, 1, 2, 4, 3, 5]
Sample Input 2 :
6 3 LEFT
22 8 4 7 5 10
-----------------
6 2 RIGHT
9 3 1 6 3 9
Sample Output 2 :
7 5 10 22 8 4 
3 9 9 3 1 6 
 * */
package arrays_2;
import java.util.Scanner;
public class Array_rotation
{
	public static void rotate(int n,int x,String d,int a[])
	{
		int i,j,t;
		if(d.equals("LEFT"))
		{  
			for(i=0;i<x;i++)
		    {
				t=a[0];
				for(j=0;j<n-1;j++)
					a[j]=a[j+1];
				a[n-1]=t;
			}
		}
		if(d.equals("RIGHT"))
		{  
			for(i=0;i<x;i++)
		    {
				t=a[n-1];
				for(j=n-1;j>0;j--)
					a[j]=a[j-1];
				a[0]=t;
			}
		}
		for(int q=0;q<n;q++)
			System.out.print(a[q]+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		String DIR = sc.next();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		rotate(n,x,DIR,arr);
	}
}