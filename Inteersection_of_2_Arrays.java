/*
Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7 
------------
2
10 10
1
10
------------
Sample Output 1 :
2 4 3
10
Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. 
The first '2' of first array matches with the first '2' of the second array. Similarly, 
the second '2' of the first array matches with the second '2' if the second array.
*/
package arrays_1;
import java.util.Scanner;
public class Inteersection_of_2_Arrays 
{
	public static void intersect(int[]n,int[]m)
	{
		int i,j,a=n.length,b=m.length;
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				if(n[i]==m[j])
				{
					System.out.print(n[i]+" ");
					m[j]=Integer.MIN_VALUE;
					break;
				}
				else
					continue;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int j=0;j<m;j++)
			b[j]=sc.nextInt();
		intersect(a,b);		
	}
}
