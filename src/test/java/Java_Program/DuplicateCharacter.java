package Java_Program;

public class DuplicateCharacter 
{

	public static void main(String[] args) 
	{
		String str="Nikita Jadhav";
		/*char[] c=str.toCharArray();

		for (int i=0;i<c.length;i++)
		{
			int count=1;
			for (int j=i+1;j<c.length;j++)
			{
				if (c[i]==(c[j]))
				{
					count++;
					c[j]='0';
				}
				
			}
		
		if(count>1 && c[i]!='0')
		System.out.println(c[i]);
	
		}
	}
}
		
	String:Nikita Jadhav
	Duplicate Character
	i
	a
		
	*/
		
		// Duplicate word from String
	        str=str.toLowerCase();
			String[] t=str.split(" ");
			for (int i=0;i<t.length;i++)
			{
				int count=1;
				for (int j=i+1;j<t.length;j++)
				{
					if (t[i].equals(t[j]))
					{
						count++;
						t[j]="0";
					}
					
				}
			
			if(count>1 && t[i]!="0")
			System.out.println(t[i]);
			
			}
		}
	}
/*
	String:Nikita  Nikita Jadhav
	Duplicate String
	Nikita

*/


