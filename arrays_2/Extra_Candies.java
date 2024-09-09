/*
Extra Candies
Send Feedback
There are ‘N’ houses. Two persons ‘P1’ and ‘P2’ distribute some candies to all these houses.
You are given an integer, ‘X’. If the total number of candies received by any house is more than ‘X’, 
it will pass the rest of the candies to the next house to the right. The rightmost house will just throw the extra candies.
You must return an array of ‘N’ integers denoting the final number of candies for all the houses.
For example:
Input :
‘N’ = 3, ‘P1’ = [2, 6, 1], ‘P2’ = [1, 2, 1], ‘X’ = 6

Output :
3 6 4

Explanation: Total candies at first house 2 + 1 = 3.
Total candies at the second house 6 + 2 = 8, extra = 8 - 6 = 2.
Total candies at the third house 1 + 1 + 2 ( extra from house 2) = 4.
 Sample Input 1 :

4 7
2 3 4 7
6 2 6 1
-----------
2 4
1 1
1 1
Sample Output 1 :
7 6 7 7
2 2
Explanation Of Sample Input 1 :
For test case one:

Input :
‘N’ = 4, ‘P1’ = [2, 3, 4, 7], ‘P2’ = [6, 2, 6, 1], ‘X’ = 7

Output :
7 6 7 7

Explanation: Total candies at first house 2 + 6 = 8, extra = 8 - 7 =  1.
Total candies at the second house 3 + 2 + 1 ( from the first house ) = 6.
Total candies at the third house 4 + 6 = 10, extra = 10 - 7 = 3.
Total candies at the fourth house 7 + 1 + 3 ( from the second house ) = 11, Extra = 11 - 7= 4.

For test case two:

Input :
‘N’ = 2, ‘P1’ = [1, 1], ‘P2’ = [1, 1], ‘X’ = 4

Output :
2 2

Explanation: Total candies at first house 1+1 =  2.
Total candies at the second house 1+1 = 2.
Sample Input 2 :

6 17
22 8 4 7 5 10
9 3 1 6 0 9
-----------------
1 1
1
1
Sample Output 2 :
17 17 13 13 5 17 
1 
 * */
package arrays_2;
import java.util.Scanner;
public class Extra_Candies
{
	public static void Candies(int a[],int b[],int x)
	{
		int i,j,k,n=a.length,extra=0,candy;
		int c[]=new int[n];
		for(i=0;i<n;i++)
		{
			candy=a[i]+b[i]+extra;
			if(candy<x)
			{
				c[i]=candy;
				extra=0;
			}
			else
			{
			extra=candy-x;
			c[i]=candy-extra;
			}
		}
		for(j=0;j<n;j++)
			System.out.print(c[j]+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		Candies(arr1,arr2,x);
	}
}