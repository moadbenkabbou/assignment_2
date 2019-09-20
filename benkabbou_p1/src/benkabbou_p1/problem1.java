package benkabbou_p1;

import java.util.Scanner;

public class problem1 {
	
	public static void main(String[] args) {
		int data;
		int i = 3, sub1 = 0, sub2 = 0, sub3 = 0, sub4 = 0;
		int a = 0,b = 0,c = 0,d = 0;
		
		// prompt for number entry
		
		System.out.print("Enter a 4-digit integer: ");
		
		// data entered
		
		Scanner scnr = new Scanner(System.in);
		
		// getting number from user
		
	    data = scnr.nextInt(); 
	    
	    while (data > 0) {
	    	// split data into separate digits
	    	
	    	if (i == 3)
	    	{
	    		d = data % 10;
	    	}
	    	
	    	else if (i == 2)
	    	{
	    		c = data % 10;
	    	}

	    	else if (i == 1)
	    	{
	    		b = data % 10;
	    	}

	    	else if (i == 0)
	    	{
	    		a = data % 10;
	    	}


	        data = data / 10;
	        i--;

	    }
	    
	    // addition and modulo
	    a = (a  + 7) % 10;
	    b = (b  + 7) % 10;
	    c = (c  + 7) % 10;
	    d = (d  + 7) % 10;
	    
	    
	    
	    // swapping 1st = digit with 3rd, and 2nd with 4th
	    
	    sub1 = a;
	    sub2 = c;
	    a = sub2;
	    c = sub1;
	    sub3 = b;
	    sub4 = d;
	    b = sub4;
	    d = sub3;
	    
	    // displaying encrypted value
	    
	    System.out.printf("Encrypted Data: " + "%d%d%d%d", a,b,c,d);
	    

	}

}
