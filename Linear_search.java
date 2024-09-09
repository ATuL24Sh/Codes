package arrays_1;
import java.util.Scanner;
public class Linear_search 
{
	public static int[] takeinput()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		return arr;
	}
	public static int findx(int[] arr,int x)
	{
		int index=-1,i;
		for(i=0;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				index=i;
				break;
			}
			else
				continue;
		}
		return index;
	}
	public static void main(String[] args) 
	{
		int[]arr=takeinput();
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number : ");
		x=s.nextInt();
		int i=findx(arr,x);
		System.out.print("element "+x+" is at index "+i+" in array.");
	}
}
