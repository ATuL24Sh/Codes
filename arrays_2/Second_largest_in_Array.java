/*
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
13
Sample Input 2:
5
9 3 6 2 9
Sample Output 2:
6
Sample Input 3:
2
6 6
----------------
4
90 8 90 5
Sample Output 3:
-2147483648
8
 * */
package arrays_2;
import java.util.Scanner;
public class Second_largest_in_Array 
{
	public static void second(int a[])
	{
		int i,max1=0;
		if(a.length==0)
		{
			System.out.print("Error");
			System.exit(0);
		}
		if(a.length==1)
		{
			System.out.print(a[0]);
			System.exit(0);
		}
		if(a.length==2)
		{
			if(a[0]==a[1])
			{
			  System.out.print("Error");
			  System.exit(0);
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(max1<a[i])
				max1=a[i];
		}
		int max2=a[0];
		for(i=0;i<a.length;i++)
		{
			if(max2<a[i] && a[i]!=max1)
				max2=a[i];
		}
		System.out.print(max2);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		second(arr);
	}
}