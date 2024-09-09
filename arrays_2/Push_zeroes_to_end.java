package arrays_2;
import java.util.Scanner;
public class Push_zeroes_to_end 
{
	public static void zeroes_to_end(int a[],int n)
	{
		int i,j,t;
		for(i=0;i<n;i++)
		{
			if(a[i]!=0)
				continue;
			else
			{
				for(j=i;j<n;j++)
				{
					if(a[j]!=0)
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
						break;
					}
				}
			}
		}
		for(int k=0;k<n;k++)
			System.out.print(a[k]+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		zeroes_to_end(arr,n);
	}
}