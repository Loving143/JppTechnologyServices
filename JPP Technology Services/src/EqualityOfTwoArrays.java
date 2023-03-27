import java.util.*;
public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(true)
		{
		System.out.println("Please enter the length of first array ");
		int n1=sc.nextInt();
		System.out.println("Please enter the length of second array ");
		int n2=sc.nextInt();
		int arr1[]=new int [n1];
		int arr2[]=new int[n2];
		System.out.println("Please enter numbers of first array");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Please enter the numbers of the second array");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		boolean cv=Arrays.equals(arr1, arr2);
		if(cv)
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal ");
		}
		//Aproach 2
		if(arr1.equals(arr2))
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}

		System.out.println("Do you want to continue ?");
		String ss=sc.next();
		if(ss.equalsIgnoreCase("yes"))
		{
			
		}
		else
		{
			System.out.println("You have been exited");
			break;
		}
		}
	}

}
