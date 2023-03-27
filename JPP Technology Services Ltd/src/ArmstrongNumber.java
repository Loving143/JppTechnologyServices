import java.util.*;
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number ");
		while(true)
		{
		int n=sc.nextInt();
		int num=n;
		long sum=0;
		while(num>0)
		{
			int r=num%10;
			sum+=r*r*r;
			num=num/10;
		}
		
		if(sum==n)
		{
			System.out.println("It is the ArmStrong number ");
		}
		else
		{
			System.out.println("It is not the Armstrong number ");
		}
		
		System.out.println("Do you want to continue??");
		String gh=sc.next();
		if(gh.equalsIgnoreCase("yes"))
		{
			System.out.println("Please Enter the number ");
		}
		else
		{
			System.out.println("You have been exited ");
			break;
		}
		
	}
		
	}

}
