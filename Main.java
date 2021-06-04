import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		//get the length of the array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = sc.nextInt();
		//initialize array
		int [] a = new int[n];
		System.out.println("enter the array");
		//get array elements from user
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		boolean ans = isSorted(a,n);
		if(ans == true)
		{
			System.out.println("array is sorted");
		}
		else
		{
			System.out.println("array is not sorted");
		}

	}
	public static boolean isSorted(int[] a, int n)
	{
		//to check if array is sorted or not
		//if array is null or has only one element then it is sorted, retuen true
		if(n == 0 | n == 1)
		{
			return true;
		}
		else
		{
			for(int j=1; j<n; j++)
			{
				if(a[j] < a[j-1])
				{
					return false;
				}
			}
		}
		return true;
		
	}
}