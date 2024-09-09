package arrays_1;
import java.util.Scanner;
public class Return_array_sum 
{
	public static int[] takeinput()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		return arr;
	}
	public static int returnsum(int []ar)
	{
		int sum=0,i;
		for(i=0;i<ar.length;i++)
			sum=sum+ar[i];
		return sum;
	}
	public static void main(String[] args) 
	{
		int arr[]=takeinput();
		System.out.print(returnsum(arr));
	}

}
