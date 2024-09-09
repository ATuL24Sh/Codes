/*
Reverse Array Between 2 Index : 
Given an array ‘ARR’ of size ‘N’. You are also given two indices ‘L’ and ‘R’.
Your task is to reverse the ‘ARR’ from index ‘L’ to ‘R’ inclusive.
Example:
Input:
‘N’ = 3 ‘L’ = 0 ‘R’ = 1 ‘ARR’ = [1, 2, 3]
Output: 
2 1 3
Explanation:
When we reverse the elements between indices 0 and 1 we get the array as 2 1 3.
Sample Input 1:
3
0 1
1 2 3
---------
2
0 1 
1 2
Sample Output 1:
2 1 3
2 1
Explanation Of Sample Input 1 :
Test 1:
When we reverse the elements between indices 0 and 1 we get the array as 2 1 3.
Test 2:
When we reverse the elements between indices 0 and 1 we get the array as 2 1.
Sample Input 2 :
5
0 3
21 6 46 36 10 
-----------------------------
10
9 9
21 2 17 39 48 41 44 23 22 7 
Sample Output 2 :
36 46 6 21 10 
21 2 17 39 48 41 44 23 22 7
 * */
package arrays_2;
import java.util.Scanner;
public class Reverse_Array_Between_2_index
{
	public static void Reverse(int a[],int l,int r)
	{
		int k,n=r,t;
		while(l<r)
		{
			
			t=a[r];
			a[r]=a[l];
			a[l]=t;
			r--;
			l++;
		}
		for(k=0;k<a.length;k++)
			System.out.print(a[k]+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Reverse(arr,l,r);
	}
}