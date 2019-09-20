package benkabbou_p1;

import java.util.Scanner;

public class problem1_decrypt {

	public static void main(String[] args) {
		int data1, i = 3;
		int a = 0,b = 0,c = 0,d = 0;
		int sub1 = 0, sub2 = 0, sub3 = 0, sub4 = 0;
		System.out.print("Enter the encrypted data: ");
		
		Scanner scnr = new Scanner(System.in); 
		//takes data input
		data1 = scnr.nextInt(); 
		
		while (data1 > 0) {
	    	//separate the integer into separate digits
	    	
	    	if (i == 3)
	    	{
	    		d = data1 % 10;
	    	}
	    	
	    	else if (i == 2)
	    	{
	    		c = data1 % 10;
	    	}

	    	else if (i == 1)
	    	{
	    		b = data1 % 10;
	    	}

	    	else if (i == 0)
	    	{
	    		a = data1 % 10;
	    	}


	        data1 = data1 / 10;
	        i--;
	        

	    }
	    // integer separated into digits
	    
		
		// swapping positions to decrypt (1st and 3rd, 2nd and 4th)
	    sub1 = a;
	    sub2 = c;
	    a = sub2;
	    c = sub1;
	    sub3 = b;
	    sub4 = d;
	    b = sub4;
	    d = sub3;
	    
	    // digit positions swapped
	    
	    a = ((a - 7) + 10) % 10;
	    b = ((b - 7) + 10) % 10;
	    c = ((c - 7) + 10) % 10;
	    d = ((d - 7) + 10) % 10;
	    
	    // displaying decrypted value
	    System.out.print("Decrypted: ");
	    System.out.print(a);
	    System.out.print(b);
	    System.out.print(c);
	    System.out.print(d);

	}

}
