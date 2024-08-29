package Java_Program;

import java.util.ArrayList;

public class FibonnacciSeries 
{

	public static void main(String[] args) 
	{
		
		int n1 = 0, n2 = 1;
        int limit = 55;

        while (n2 <= limit) {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.print(n1 + " ");

        while (n1 > 0) {
            int temp = n1;   
            n1 = n2 - n1;     
            n2 = temp;       
            System.out.print(n1 + " ");
        }
	        
	       // Output: 55 34 21 13 8 5 3 2 1 1 

	
		/*
		int n0=0,n1=1;
		System.out.print(n0+" "+n1);
		for (int i=2;i<=10;i++)
		{
			int sum=n0+n1;
			System.out.print(" "+sum);
			
			n0=n1;
			n1=sum;
		}*/
	}

}

//	0 1 1 2 3 5 8 13 21 34	