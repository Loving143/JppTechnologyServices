import java.util.*;

public class RemovingDuplicatesFromArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Please Enter the length of the list");
		int n = sc.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
		System.out.println("Please Enter the numbers ");
		for (int i = 0; i < n; i++)
		{

			l.add(sc.nextInt());
			
		}
		
		System.out.println(l);
		//Approach 1
		Collections.sort(l);
		System.out.println(l);
		System.out.println("List without duplicates ");
		for(int i=0;i<l.size()-1;i++)
		{
			if(l.get(i)==l.get(i+1))
			{
				l.remove(i);
				i--;
			}
			
		}
		System.out.println(l);
		
		//Apporach 2
		LinkedHashSet<Integer>h=new LinkedHashSet<Integer>(l);
		ArrayList<Integer>ll=new ArrayList<Integer>(h);
		System.out.println(ll);
		
		
		
		
		
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
		

	}

}
