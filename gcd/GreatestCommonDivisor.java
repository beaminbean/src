package gcd;

import java.util.Scanner;

// Write a code that calculates the Greatest Common Divisor (GCD) of two positive integers (user-defined inputs).
public class GreatestCommonDivisor {

	private Scanner scanner = new Scanner(System.in);

	public void getInput() {

		int gcd = 0;

		try {
			System.out.println("Greatest Common Divisor (GCD) - try");

			// get first integer
			scanner = new Scanner(System.in);
			System.out.println("Enter first Integer");
			int firstNumber = scanner.nextInt();

			// get second integer
			scanner = new Scanner(System.in);
			System.out.println("Enter second Integer");
			int secondNumber = scanner.nextInt();

			// get gcd value from two integers
			gcd = getGCD(firstNumber, secondNumber);
			System.out.println("Greatest Common Divisor (GCD) for values: " + firstNumber + " and " + secondNumber
					+ " is: " + gcd);

			// if gcd equals 1, force division by zero, which calls the exception
			if (gcd == 1) {
				System.out.println(gcd / 0);
			}

		} catch (Exception exception) {
			// Include an exception such that if their greatest common divisor equals to 1,
			// it prints out the message, saying its GCD is 1.
			System.out.println("Greatest Common Divisor (GCD) - catch: " + exception.getMessage());
			System.out.println("Greatest Common Divisor (GCD) is 1");

		} finally {
			System.out.println("Greatest Common Divisor (GCD) - finally");
		}

		System.out.println("Greatest Common Divisor (GCD) - Program End");
	}

	/**
	 * return GCD - uses recursion, keeps calling method until second number equals
	 * 0
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	private int getGCD(int firstNumber, int secondNumber) {
		return (secondNumber == 0) ? firstNumber : getGCD(secondNumber, firstNumber % secondNumber);
	}

	public static void main(String args[]) {
		GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
		greatestCommonDivisor.getInput();
	}
}
