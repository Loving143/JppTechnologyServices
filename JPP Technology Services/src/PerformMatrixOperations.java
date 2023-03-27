import java.util.*;
public class PerformMatrixOperations {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Please Enter Size of the matrix");
		
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
	//	System.out.println(sum);
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				sum+=arr[i][j];
				break;
			}
		}
		
		System.out.println("The sum of the diagonals of the matrix is :"+sum); 
		
		System.out.println("Do you want to continue ?");
		String ss=sc.next();
		if(ss.equals("yes"))
		{
			
		}
		else
		{
			System.out.println("You have been exited");
			break;
		}
	
		}
	//	System.out.println(sum);
	}

}
