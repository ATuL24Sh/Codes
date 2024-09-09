/*You have been given an integer array/list(ARR) and a number X. 
Find and return the total number of pairs in the array/list which sum to X.
Sample Input 1:
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
9
1 3 6 2 5 4 3 2 4
12
-----------------
6
2 8 10 5 -2 5
10
Sample Output 2:
0
--------------
2
*/
package arrays_1;
import java.util.Scanner;
public class Pair_Sum 
{
	public static void pairsum(int []a,int x)
	{
		int i,j,c=0,n=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==x)
					c++;
			}
		}
		System.out.print("total number of pairs in the array which sum to "+x+" are : "+c);
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
		pairsum(arr,x);
	}
}
