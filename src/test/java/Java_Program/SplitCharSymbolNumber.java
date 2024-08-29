package Java_Program;

public class SplitCharSymbolNumber 
{

	public static void main(String[] args) 
	{
		String str="Nikita@2205";
		StringBuffer num=new StringBuffer(), symbol=new StringBuffer(), ch=new StringBuffer();
		for (int i=0;i<str.length();i++)
		{
			if (Character.isAlphabetic(str.charAt(i)))
				ch.append(str.charAt(i));

			else if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));

			else
				symbol.append(str.charAt(i));
		}
		System.out.print("Character:"+ch+"\n"+"Number:"+num+"\n"+"Symbol:"+symbol);
	}

}
