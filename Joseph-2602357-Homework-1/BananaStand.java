/*
 * File Name: BananaStand.java
 * Author: Alita Joseph
 * KUID: 2602357
 * Email Address: a401j952@ku.edu
 * Homework Assignment Number: 1
 * Description: Find out how many bananas the user wants, what kind, and their color
 * Last Changed: 09/25/15 
*/

import java.util.Scanner; //allow for user input

public class BananaStand {

	public static void main(String[] args) 
	{
		Scanner myScan= new Scanner(System.in); 		//declare Scanner and constants
		final double COST_PER_BANANA = .03;
		final double ORGANIC_MARKUP_PERCENTAGE = .20;
		final double GAMMA_RAY_MARKUP_PERCENTAGE = .50;
		final double GREEN_DISCOUNT_PERCENTAGE = .10;
		final double MIXED_DISCOUNT_PERCENTAGE = .05;
		
		String typeOfBanana = "";						// declare variables
		String choice = "";
		int numberOfBananas = 0;
		double totalCost = 0.0;
		final double OUT_OF_STATE_SHIPPING = 35.50;
		String streetAddress = "";
		String city = "";
		String state = "";
		int zipCode = 0;
		
		System.out.println("Welcome to the Banana Stand!");			// Ask the user what type of banana they want
		System.out.println("--------------------");
		System.out.println("Select type of banana:");
		System.out.println("Regular (r/R) (no markup)");
		System.out.println("Organic (o/O) (20% markup)");
		System.out.println("Saturated with Gamma Rays (g/G) (50% markup)");
		System.out.println("Input your choice:");
		
		typeOfBanana = myScan.nextLine();		
		char userType = '\0';						// Read the string for the type of banana as a character 
		userType = typeOfBanana.charAt(0);
		System.out.println("--------------------");
		
		System.out.println("Select color of banana:"); 		//ask the user for the color of banana
		System.out.println("(y/Y) (no discount)");
		System.out.println("(g/G) (10% discount)");
		System.out.println("(m/M) (5% discount)");
		System.out.println("Input your choice:");
		
		choice = myScan.nextLine();
		char color = '\0';
		color = choice.charAt(0);			//read the string for the color of banana as a character
		System.out.println("");
		System.out.println("--------------------");
		
		System.out.println("How many bananas do you want?");
		numberOfBananas = myScan.nextInt();
		
		System.out.println("Input your street address: ");	//address information from user
		myScan.nextLine();    //placed here to get user input (was skipping over the street address without this step)
		streetAddress = myScan.nextLine();
		System.out.println("Input your city: ");		
		city = myScan.nextLine();
		System.out.println("Input your state: ");
		state = myScan.nextLine();
		System.out.println("Input your zip code:");
		zipCode = myScan.nextInt();
		
		totalCost = numberOfBananas*COST_PER_BANANA;
		System.out.printf("Total cost for " + numberOfBananas + " banana(s) before markups or discounts: $%.2f \n" , totalCost); //calculates total cost of banana, puts it in dollar format
		
		if(state.toLowerCase() != "kansas")		//user toLowerCase method to read the state 
		{
			totalCost = totalCost + OUT_OF_STATE_SHIPPING;
		}
		if(userType == 'r' || userType == 'R')			// calculate markups based on what the user chooses for their type of banana
		{
			System.out.println("Total markups: $0.00");		
		}
		else if(userType == 'o' || userType == 'O')
		{
			System.out.printf("Total markups: $%.2f \n" , ORGANIC_MARKUP_PERCENTAGE*numberOfBananas*COST_PER_BANANA);
			totalCost = totalCost + ORGANIC_MARKUP_PERCENTAGE*numberOfBananas*COST_PER_BANANA;
		}
		else
		{
			System.out.printf("Total markups: $%.2f \n" , GAMMA_RAY_MARKUP_PERCENTAGE*numberOfBananas*COST_PER_BANANA);
			totalCost = totalCost + GAMMA_RAY_MARKUP_PERCENTAGE*numberOfBananas*COST_PER_BANANA;
		}
		
		if(color == 'y' || color == 'Y')		//calculates discounts based on what user chooses for color of banana
		{
			System.out.println("Total discount: $0.00");
		}
		else if(color == 'g' || color == 'G')
		{
			System.out.printf("Total discount: $%.2f \n" , GREEN_DISCOUNT_PERCENTAGE*numberOfBananas*COST_PER_BANANA);
			totalCost = totalCost + GREEN_DISCOUNT_PERCENTAGE*numberOfBananas*COST_PER_BANANA;
		}
		else
		{
			System.out.printf("Total discount: $%.2f \n" , MIXED_DISCOUNT_PERCENTAGE*numberOfBananas*COST_PER_BANANA);
			totalCost = totalCost + MIXED_DISCOUNT_PERCENTAGE*numberOfBananas*COST_PER_BANANA;
		}
		
		System.out.printf("Total cost: $%.2f \n" , totalCost);		// prints total cost and shipping information
		System.out.println("Shipping to: ");
		System.out.println("\t" + streetAddress);
		System.out.println("\t" + city);
		System.out.println("\t"+ state);
		System.out.println("\t"+ zipCode);
		
	}

}
