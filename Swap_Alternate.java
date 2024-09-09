package arrays_1;
import java.util.Scanner;
public class Swap_Alternate 
{
	public static int[] swap(int []input)
	{
		int i,temp,n=input.length;
		for(i=0;i<n-1;i+=2)
		{
			temp=input[i];
			input[i]=input[i+1];
			input[i+1]=temp;
		}
		return input;
	}
	public static void printarray(int output[])
	{
		int i,n=output.length;
		System.out.print("\nRe-arranged elements :\n");
		for(i=0;i<n;i++)
			System.out.print(" "+output[i]);
	}		
	
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : \n");
		n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array elements : \n");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		arr=swap(arr);
		printarray(arr);
	}
}
