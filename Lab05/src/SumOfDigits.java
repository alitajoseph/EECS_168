import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int num;
		int y = 1;
		do {
			System.out.println("Please enter a No:");
			num = myScan.nextInt();
			num = addDigits(num);
			System.out.println("The sum of the digits is: " + num);
			System.out.println("Want to try again? (y = 1/ n = 0):");
			y = myScan.nextInt();
		} while (y == 1);

		System.out.println("Thank you!");

	}

	public static int addDigits(int x) {
		int change = x;
		int sum = 0;

		while (change != 0) {
			sum = change % 10 + sum;
			change = change / 10;
		}

		return sum;
	}
}
