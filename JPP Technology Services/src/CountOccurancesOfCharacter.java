import java.util.*;
public class CountOccurancesOfCharacter {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Please enter the String ");
		String gh=sc.next();
		
		//1st approach 
		char ch[]=gh.toCharArray();
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		System.out.println("The count of occurances of each character :");
		System.out.println("Key\t value");
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"\t "+entry.getValue()); 
		}
		
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
