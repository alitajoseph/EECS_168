/* -----------------------------------------------------------------------------
 *
 * File Name: AsciiArt.java
 * Author: Alita Joseph, a401j952@ku.edu
 * Assignment:   EECS-168/169 HW 2
 * Description:  This program will ask the user what type of pattern they want displayed based on size and then display the pattern
 * Date: 10/05/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class AsciiArt
{
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		
		int pattern = 1;
		int size = 1;
		System.out.println("Choose one of the following patterns by typing the corresponding number:");
		System.out.println("1) Stripes");
		System.out.println("2) Checker Board");
		System.out.println("3) Double Diagonal (aka the X)");
		System.out.println("4) Two Islands");
		
		pattern = myScan.nextInt();
		
		if(pattern != 1 && pattern != 2 && pattern != 3 && pattern != 4) // check if the user chose a given pattern
		{
			System.out.println("Error.");
		}
		else
		{
			System.out.println("Input a size (must be larger than 1):");
			size = myScan.nextInt();
		}
		
		if(size <= 1)
		{
			System.out.println("Error.");
			pattern = -1;
		}
		 
		if(pattern == 1)    //check if the user chose 1, if so print stripes
		{
		 for(int i = 0; i < size; i++)
		 {	
			System.out.print(i);
			for(int j = 0; j < 3; j++)
			{
			System.out.print(" * ");
			}
			System.out.println("");
		 } 
		}
		
		 else if(pattern == 2)   // check if the user chose 2, if so print checker board
		 {
			 for(int i = 0; i < size; i++)
			 {
				 System.out.print(i + " ");
				 if(i %2 != 0)
				 {
					 System.out.print("  ");
				 }
				 for(int j = 0; j < size; j++)
				 {
					 if((j+i)% 2 == 0)
					 {
						 System.out.print(" * ");
					 }
				 }
				 System.out.println("");
			 } 
		 }
		
		else if( pattern == 3) // check if user chose 3, if so, print double diagonal
		{
		for(int i = 0; i < size; i++)
		{
			System.out.print(i + " ");
			for(int j = 0; j < size; j++)
			{
				if(i == j || i + j == size - 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			
			}
			System.out.println("");
		}
		}
		
		
		else if( pattern == 4) // check if user chose 4, if so, print two islands
		{
		for(int i =0; i < size; i++)
		{	
			System.out.print( i + " ");
			for(int j =0; j < size; j++)
			{
				if(size%2 != 0)
				{
				if( i+ j == size - 1)
				{
					System.out.print("*");
				}
				else if( i < (size/2) && j < (size/2))
				{
					System.out.print("!");
				}
				else if( i > (size/2) && j > (size/2))
				{
					System.out.print("?");
				}
				else
				{
					System.out.print("~");
				}
				}
				else
				{
					if( i+ j == size - 1)
					{
						System.out.print("*");
					}
					else if( i < (size/2) && j < (size/2))
					{
						System.out.print("!");
					}
					else if( i >= (size/2) && j >= (size/2))
					{
						System.out.print("?");
					}
					else
					{
						System.out.print("~");
					}
				}
			}
			System.out.println("");
		}
	}
	}
}
