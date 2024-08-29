package Java_Program;

public class SpecificLetterOccurence 
{

	public static void main(String[] args) 
	{
		String str="Nikita Jadhav";
		int count=0;

		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
				count++;
		}
		System.out.print("COunt of a letter="+ count);

	}

}

/*
 	Count of i letter=3

 */
