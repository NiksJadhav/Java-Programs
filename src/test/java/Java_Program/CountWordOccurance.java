package Java_Program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountWordOccurance 
{

	public static void main(String[] args) 
	{
		String str="I am learing learing java java programing language";

		Map<String,Integer> map=new HashMap<String,Integer>();
		Integer count=1;
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if (!map.containsKey(arr[i]))
				map.put(arr[i], count);
			else
				map.put(arr[i],map.get(arr[i])+1);
		}
		for(String x: map.keySet())
			System.out.print("Count of word :"+x+" = "+map.get(x)+"\n");
	}

}	

