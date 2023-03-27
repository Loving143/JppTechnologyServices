import java.util.*;
public class CountOccurancesOfCharacter {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String gh=sc.next();
		
		//1st approach 
		char ch[]=gh.toCharArray();
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue()); 
		}
		

	}

}
