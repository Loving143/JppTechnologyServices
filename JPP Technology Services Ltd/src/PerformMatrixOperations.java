import java.util.*;
public class PerformMatrixOperations {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=count;
				count++;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				sum+=arr[i][j];
				break;
			}
		}
		System.out.println(sum);
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				sum+=arr[i][j];
				break;
			}
		}
		
		System.out.println(sum); 
		
	
		
	//	System.out.println(sum);
	}

}
