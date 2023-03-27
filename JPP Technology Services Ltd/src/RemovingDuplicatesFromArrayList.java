import java.util.*;

public class RemovingDuplicatesFromArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		{

			l.add(sc.nextInt());
			
		}
		
		//Approach 1
		Collections.sort(l);
		for(int i=0;i<l.size()-1;i++)
		{
			if(l.get(i)==l.get(i+1))
			{
				l.remove(i);
			}
			
		}
		System.out.println(l);
		
		//Apporach 2
		LinkedHashSet<Integer>h=new LinkedHashSet<Integer>(l);
		ArrayList<Integer>ll=new ArrayList<Integer>(h);
		System.out.println(ll);
		
		
		
		
		
		
		

	}

}
