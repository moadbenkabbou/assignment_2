package benkabbou_p2;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		
		char userChoice;
		double weightInPounds, weightInKilograms, heightInInches, heightInMeters, bmiCalc;
		double squaredInches, squaredMeters;
		
		// printing two separate formulas for user to choose from
		// prompt for calculation mode
		System.out.println("");
		
		System.out.println("703 x weightInPounds");

		System.out.println("_____________________      (press a)");
		
		System.out.println("  heightInInches^2");
		
		System.out.println("");
		
		System.out.println("");
		
		System.out.println("  weightInKilograms");

		System.out.println("_____________________      (press b)");
		
		System.out.println("  heightInMeters^2");
		
		System.out.println("");
		
		System.out.print("Choose a BMI calculator to use: ");
		
		// take user's choice: a or b
		Scanner scnr = new Scanner(System.in); 
		
		userChoice = scnr.next().charAt(0);
		
		if (userChoice == 'a')
		{
			
			// if user chooses "a" (standard measuring system)
			bmiCalc = 0;
			
			// takes weight and height of user
			
			System.out.print("Enter your weight in pounds: ");
			
			weightInPounds = scnr.nextDouble();
			
			System.out.print("Enter your height in inches: ");
			
			heightInInches = scnr.nextDouble();
			
			// BMI calculation
			
			squaredInches = heightInInches * heightInInches;
			
			bmiCalc = 703 * weightInPounds;
			bmiCalc = bmiCalc / squaredInches;
			
			
			System.out.println("");
			
			System.out.printf("Your BMI is %.1f", bmiCalc);
			
			
		}
		
		else if (userChoice == 'b')
		{
			// if user chooses "b" (metric measuring system)
			bmiCalc = 0;
			
			// takes weight and height of user
			
			System.out.print("Enter your weight in kilograms: ");
			
			weightInKilograms = scnr.nextDouble();
			
			System.out.print("Enter your height in meters: ");
			
			heightInMeters = scnr.nextDouble();
			
			// BMI calculation
			
			squaredMeters = heightInMeters * heightInMeters;
			
			bmiCalc = weightInKilograms / squaredMeters;
			
			System.out.println("");
			
			// BMI calculation display
			
			System.out.printf("Your BMI is %.1f", bmiCalc);
			
			
		}
		
		// BMI categories
		System.out.println("");
		System.out.println("");
		System.out.println("BMI Categories: ");
		System.out.println("  Underweight = <18.5");
		System.out.println("  Normal weight = 18.5–24.9");
		System.out.println("  Overweight = 25–29.9");
		System.out.println("  Obesity = BMI of 30 or greater");
	}

}
