/* -----------------------------------------------------------------------------
 *
 * File Name: MethodPractice.java
 * Author: Alita Joseph, a401j952@ku.edu
 * Assignment:   EECS-168/169 HW 2
 * Description:  In this file there will be the main method and three other methods
 * Date: 10/06/15
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class MethodPractice 
{
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Input two numbers:");
		a = myScan.nextInt();
		b = myScan.nextInt();
		System.out.println("The max of " + a + " and  " + b + " is: " + max( a, b) );
		
		double radius;
		System.out.println("Input a radius:");
		radius = myScan.nextDouble();
		if(radius > 0)
		{
		System.out.println("The area of a sphere with this radius is: " + sphereArea(radius)  );
		}
		else
		{
			System.out.println("The area of a sphere with this radius is: 0.00");
		}
		
		String word;
		int timesToPrint;
		System.out.println("Input a string:");
		word = myScan.next();
		System.out.println("How many times do you want to print it?");
		timesToPrint = myScan.nextInt();
		printWord(word, timesToPrint);
	}
	
	public static int max(int a, int b)
	{
		if( a > b)
		{
			return(a);
		}
		else
		{
			return(b);
		}
	}
	
	public static double sphereArea(double radius)
	{
		double area = 4.0*3.14159*radius*radius;
		return(area);
	}
	
	public static void printWord(String word, int timesToPrint)
	{
		for(int i = 0; i < timesToPrint; i++)
		{
			System.out.println(word);
		} 
	}
}
