/* -----------------------------------------------------------------------------
 *
 * File Name: SquareMatrix.java
 * Author: Alita Joseph, a401j952@ku.edu
 * Assignment:   EECS-168/169 HW 2
 * Description:  This program will ask the user what type of matrix they want displayed based on size and then display the matrix and transpose
 * Date: 10/05/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class SquareMatrix
{
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		int size = 1;  // declare variables
		int x = 1;
		
		System.out.println("Enter the Size of the Square Matrix:");
		size = myScan.nextInt(); 		// get size of matrix from user
		System.out.println("Square Matrix:");
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				System.out.print(x + " ");
				x = x+1;		//stores x and keeps adding one to it
				
			}
			System.out.println("");
		}
		
		System.out.println("Transpose:");
		
		for( int i = 0; i < size; i++)
		{
			x = i+1;
			for(int j = 0; j < size; j++)
			{
				System.out.print(x + " ");
				x = (x + size); 		// one row of transpose can be computed as an addition
			}
			System.out.println(" ");
		}
		
	}

}
