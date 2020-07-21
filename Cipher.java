import java.util.Scanner;
import java.util.Random;


public class Cipher {
	public static void main(String[] args) {
		int sum = 0, number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Sebastian Rodriguez");
		System.out.println("Welcome to the Cipher program!");
		System.out.println("Please enter 5 numbers between 0 and 19");

		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.print("1st number: ");
			} else if (i == 1) {
				System.out.print("2nd number: ");
			} else if (i == 2) {
				System.out.print("3rd number: ");
			} else if (i == 3) {
				System.out.print("4th number: ");
			} else {
				System.out.print("5th number: ");
			}

			number = scan.nextInt();

			if (number >= 0 && number <= 19) {
				sum += number;
			} else {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
		}
		System.out.println("Total = " + sum);

		Random rand = new Random();

		int key = rand.nextInt(10);
		System.out.println("Your random key is " + key);
		int ones, tens;
		tens = sum / 10;
		ones = sum % 10;

		int encodedOnes, encodedTens;

		encodedOnes = (ones + key) % 10;
		encodedTens = (tens + key) % 10;

		int encodedNum = encodedTens * 10 + encodedOnes;

		if (encodedNum > 9) {
			System.out.println("Your encoded number is " + encodedNum);
		}

		else {
			String encoded = String.format("%02d", encodedNum);
			System.out.println("Your encoded number is " + encoded);
		}
	}
}