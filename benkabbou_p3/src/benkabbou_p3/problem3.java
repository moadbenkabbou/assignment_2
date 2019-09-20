package benkabbou_p3;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		
		int rate1, rate2, rate3, rate4, rate5, i = 4, x,y;
		int peopleCount;
		double avg1 = 0, avg2 = 0, avg3 = 0, avg4 = 0, avg5 = 0;
		double filled1 = 0, filled2 = 0, filled3 = 0, filled4 = 0, filled5 = 0;
		
		String iss1 = "We Should ban plastic bags.";
		String iss2 = "The US military should continue it's war in the Middle East.";
		String iss3 = "We should introduce laws to limit production of artificial sugar.";
		String iss4 = "Puerto Rico should be made 51st state of the USA.";
		String iss5 = "Marijuana should be legalized.";
		
		int[][] results = new int[5][10];
		
		// initialize 2D array to 0
		for (x = 0; x < 5; x++)
		{
			for (y = 0; y < 10; y++)
			{
				results[x][y] = 0;
			}
		}
		
		Scanner scnr = new Scanner(System.in); 
		
		
		
		
		// telling user to rate topics
		System.out.println("Welcome! Here you will rate 5 issues, each");
		System.out.println("from a scale of 1-10");
		System.out.println("");
		System.out.println("");
		
		System.out.print("How many people are taking this poll? ");
		peopleCount = scnr.nextInt();
		
		System.out.println("");
		System.out.println("");
		
		
		while (peopleCount > 0)
		{

			while (i >= 0)
			{
				// getting topic ratings from user
				if (i == 4)
				{
					// user input in loop
					System.out.print("1. ");
					System.out.println(iss1);
					System.out.print("Rate: ");
					rate1 = scnr.nextInt();
					System.out.println("");
					// i will be used to stop loop
					i--;
					// incrementing number of ratings per topic
					results[0][rate1 -1]++;
					// counting filled arrays and adding to make average
					filled1++;
					avg1 = avg1 + rate1;
				}
				if (i == 3)
				{
					System.out.print("2. ");
					System.out.println(iss2);
					System.out.print("Rate: ");
					rate2 = scnr.nextInt();
					System.out.println("");
					i--;
					results[1][rate2 -1]++;
					filled2++;
					avg2 = avg2 + rate2;
				}
				if (i == 2)
				{
					System.out.print("3. ");
					System.out.println(iss3);
					System.out.print("Rate: ");
					rate3 = scnr.nextInt();
					System.out.println("");
					i--;
					results[2][rate3 -1]++;
					filled3++;
					avg3 = avg3 + rate3;
				}
				if (i == 1)
				{
					System.out.print("4. ");
					System.out.println(iss4);
					System.out.print("Rate: ");
					rate4 = scnr.nextInt();
					System.out.println("");
					i--;
					results[3][rate4 -1]++;
					filled4++;
					avg4 = avg4 + rate4;
				}
				if (i == 0)
				{
					System.out.print("5. ");
					System.out.println(iss5);
					System.out.print("Rate: ");
					rate5 = scnr.nextInt();
					System.out.println("");
					i--;
					results[4][rate5 -1]++;
					filled5++;
					avg5 = avg5 + rate5;
				}
				
				// displaying tabular report
				System.out.println("Report: ");
				System.out.println("");
				
				// making 5x10 table
				System.out.println("                   RATES");
				System.out.println("");
				System.out.print("        1   2   3   4   5   6   7   8   9   10 ");
				// reporting per-topic average
				System.out.println("    Average");
				System.out.println("    __________________________________________");
				System.out.print("I   ");
				System.out.printf("1   %d   %d   %d   %d   %d   %d   %d   %d   %d   %d", results[0][0], results[0][1],results[0][2],results[0][3],
						results[0][4],results[0][5],results[0][6],results[0][7],results[0][8],results[0][9]);
				System.out.printf("         %.1f", avg1/filled1);
				
				System.out.println("");
				System.out.println("S   __________________________________________");
				System.out.print("S   ");
				System.out.printf("2   %d   %d   %d   %d   %d   %d   %d   %d   %d   %d", results[1][0], results[1][1],results[1][2],results[1][3],
						results[1][4],results[1][5],results[1][6],results[1][7],results[1][8],results[1][9]);
				System.out.printf("         %.1f", avg2/filled2);
				
				System.out.println("");
				System.out.println("U   __________________________________________");
				System.out.print("E   ");
				System.out.printf("3   %d   %d   %d   %d   %d   %d   %d   %d   %d   %d", results[2][0], results[2][1],results[2][2],results[2][3],
						results[2][4],results[2][5],results[2][6],results[2][7],results[2][8],results[2][9]);
				System.out.printf("         %.1f", avg3/filled3);
				
				System.out.println("");
				System.out.println("S   __________________________________________");
				System.out.print("    ");
				System.out.printf("4   %d   %d   %d   %d   %d   %d   %d   %d   %d   %d", results[3][0], results[3][1],results[3][2],results[3][3],
						results[3][4],results[3][5],results[3][6],results[3][7],results[3][8],results[3][9]);
				System.out.printf("         %.1f", avg4/filled4);
				
				System.out.println("");
				System.out.println("#   __________________________________________");
				System.out.print("    ");
				System.out.printf("5   %d   %d   %d   %d   %d   %d   %d   %d   %d   %d", results[4][0], results[4][1],results[4][2],results[4][3],
						results[4][4],results[4][5],results[4][6],results[4][7],results[4][8],results[4][9]);
				System.out.printf("         %.1f", avg5/filled5);
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
			}
			
			peopleCount--;
			
			if (peopleCount > 0)
				i = 4;		
		}
		
		// displaying issue with highest total
		
		if (avg1 > avg2 && avg1 > avg3 && avg1 > avg4 && avg1 > avg5)
		{
			System.out.println("The issue with the highest point total is:");
			System.out.println(" -" + iss1);
		}
		else if (avg2 > avg1 && avg2 > avg3 && avg2 > avg4 && avg2 > avg5)
		{
			System.out.println("The issue with the highest point total is:");
			System.out.println(" -" + iss2);
		}
		
		else if (avg3 > avg2 && avg3 > avg1 && avg3 > avg4 && avg3 > avg5)
		{
			System.out.println("The issue with the highest point total is:");
			System.out.println(" -" + iss3);
		}
		
		else if (avg4 > avg2 && avg4 > avg3 && avg4 > avg1 && avg4 > avg5)
		{
			System.out.println("The issue with the highest point total is:");
			System.out.println(" -" + iss4);
		}
		
		else if (avg5 > avg2 && avg5 > avg3 && avg5 > avg4 && avg5 > avg1)
		{
			System.out.println("The issue with the highest point total is:");
			System.out.println(" -" + iss5);
		}
		else
		{
			System.out.println("*Two or more issues have the same highest total*");
		}
		
		System.out.println("");
		
		// displaying issue with lowest total
		
		if (avg1 < avg2 && avg1 < avg3 && avg1 < avg4 && avg1 < avg5)
		{
			System.out.println("The issue with the lowest point total is: ");
			System.out.println(" -" + iss1);
		}
		else if (avg2 < avg1 && avg2 < avg3 && avg2 < avg4 && avg2 < avg5)
		{
			System.out.println("The issue with the lowest point total is: ");
			System.out.println(" -" + iss2);
		}
		else if (avg3 < avg2 && avg3 < avg1 && avg3 < avg4 && avg3 < avg5)
		{
			System.out.println("The issue with the lowest point total is: ");
			System.out.println(" -" + iss3);
		}
		else if (avg4 < avg2 && avg4 < avg3 && avg4 < avg1 && avg4 < avg5)
		{
			System.out.println("The issue with the lowest point total is: ");
			System.out.println(" -" + iss4);
		}
		else if (avg5 < avg2 && avg5 < avg3 && avg5 < avg4 && avg5 < avg1)
		{
			System.out.println("The issue with the lowest point total is: ");
			System.out.println(" -" + iss5);
		}
		else
		{
			System.out.println("*Two or more issues have the same lowest total*");
		}

		
	}

}
