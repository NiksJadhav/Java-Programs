package Java_Program;

import java.util.HashMap;
import java.util.Map;


public class CharacterCount 
{

	public static void main(String[] args) 
	{
		String str="Nikita";
		Map <Character,Integer> map=new HashMap<Character,Integer>();
		char[] strarray=str.toCharArray();
		for(char c:strarray)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c,1);
		}
		System.out.println(map);
	}
}
/* Digit Counts

 	Output:

 	{a=1, t=1, i=2, k=1, N=1}

 */