package Java_Program;

public class StringReverse 
{   
	public static void main(String[] args) 
	{
	/* String str = "Nikita Pundlik Jadhav";
        
        System.out.println("String:"+str);
        // Split the input string into words
        String[] words = str.split(" ");
        
        // StringBuilder to store the result
        StringBuilder sb = new StringBuilder();
        
        // Reverse each word and append to the result
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        
        // Print the final result
        System.out.println("Reverse:"+sb.toString().trim());
        
        
        Output:
	Str: Nikita Pundlik Jadhav
	Reverse: atikiN kildnuP vahdaJ

	public static void main(String[] args) 
	{

        
    */
     
     	String str="Nikita Jadhav";
     	String rev="";
     	for (int i=str.length()-1;i>=0;i--)
     	{
     	rev=rev+str.charAt(i);
     	}
     	System.out.println(rev);
     	
    
    // Output: 
     //	str:Nikita Jadhav 
     //	reverse: vahdaJ atikiN
    }


}

/*
	
	
	
	
	
	

 */