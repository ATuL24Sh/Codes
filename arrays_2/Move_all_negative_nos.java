/*You are given an array 'ARR' consisting of 'N' integers. 
 * You need to rearrange the array elements such that all negative numbers appear before all positive numbers.
Follow Up:
Can you solve this in O(1) auxiliary space?
Note:
The order of elements in the resulting array is not important.
Example:
Let the array be [1, 2, -3, 4, -4, -5]. 
On rearranging the array such that all negative numbers appear before all positive numbers 
we get the resulting array [-3, -5, -4, 2, 4, 1].*/
package arrays_2;
import java.util.Scanner;
public class Move_all_negative_nos 
{
	public static int[] Move(int a[],int n)
	{
		int q,w,cp=0,cn=0,i,j,k,p=0,t=n-1;
		int b[]=new int [n];
		for(q=0;q<n;q++)
		{
			if(a[q]>=0)
				cp++;
			if(cp==n)
				return a;
		}
		for(w=0;w<n;w++)
		{
			if(a[w]<0)
				cn++;
			if(cn==n)
				return a;
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				b[p]=a[i];
				p++;
			}
			else if(a[i]>=0)
			{
				b[t]=a[i];
				t--;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
			arr=Move(arr,n);
			for(int j=0;j<n;j++)
				System.out.print(arr[j]+" ");
	}
}