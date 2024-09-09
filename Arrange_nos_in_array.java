package arrays_1;
import java.util.Scanner;
public class Arrange_nos_in_array 
{
	public static void arrange(int []arr)
	{
		int i,j,k=0,n=arr.length,m;
		int a[]= new int[n];
		if(n%2==0)
		{
			m=n;
			for(i=0;i<=m;i+=2)
			{
				if(i==m)
				{
					a[k]=arr[i-1];
					a[m-k-1]=arr[i-2];
					break;
				}
				a[k]=arr[i];
				a[m-k-1]=arr[i+1];
				k++;
			}
		}
		else
		{
			m=n-1;
			for(i=0;i<=m;i+=2)
			{
				if(i==m)
				{
					a[k]=arr[i];
					break;
				}
				a[k]=arr[i];
				a[m-k]=arr[i+1];
				k++;
			}
		} 
		System.out.println();
		System.out.print("re-arranged array :");
		System.out.println();
		for(j=0;j<a.length;j++)
			System.out.print(" "+a[j]);
	}
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size : \n ");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=i+1;
		System.out.print("array elements are :");
		System.out.println();
		for(int j=0;j<arr.length;j++)
			System.out.print(" "+arr[j]);
		arrange(arr);	
	}
}
