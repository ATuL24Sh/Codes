/*
Sample Input 1:
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
3
8 5 2
2
1 3
---------------------
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0 
 * */
package arrays_2;
import java.util.Scanner;
public class Sum_of_2_arrays 
{
	public static void Sum(int a[],int b[],int out[])
	{
		int i=a.length-1,j=b.length-1,k=out.length-1,carry=0,sum;
		while(i>=0 && j>=0)
		{
			sum=a[i]+b[j]+carry;
			out[k]=sum%10;
			carry=sum/10;
			i--;j--;k--;
		}
		while(i>=0)
		{
			sum=a[i]+carry;
			out[k]=sum%10;
			carry=sum/10;
			i--;k--;
		}
		while(j>=0)
		{
			sum=b[j]+carry;
			out[k]=sum%10;
			carry=sum/10;
			j--;k--;
		}
		while(k>=0)
		{
			out[k]=carry;
			k--;
		}
		for(int q=0;q<out.length;q++)
			System.out.print(out[q]+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		int m=sc.nextInt();
		int arr2[]=new int[m];
		for(int j=0;j<m;j++)
			arr2[j]=sc.nextInt();
		int output[]=new int[1+Math.max(n, m)];
		Sum(arr1,arr2,output);
	}
}