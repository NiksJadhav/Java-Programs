package Java_Program;

public class Array2D 
{

	public static void main(String[] args) 
	{
		int[][] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
	    for (int[] row : array) 
	    {
            // Iterate over each element in the row
            for (int element : row) 
            {
                // Print each element followed by a space
                System.out.print(element + " ");
            }
            
            // Move to the next line after each row is printed
            System.out.println();
	    } 
            /*
             for (int i = 0; i < array.length; i++) 
             {
            	for (int j = 0; j < array[i].length; j++) 
            	{
					System.out.print(array[i][j] + " ");
            	}
            	System.out.println();
        	}
             */
        
	}

}
