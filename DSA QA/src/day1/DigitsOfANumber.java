package day1;

import java.util.Scanner;

public class DigitsOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tempNum = n;
		// counting no of digits
		int noOfdigits = 0;
		while (tempNum > 0) {
			noOfdigits++;
			tempNum /= 10;
		}

		// printing digits of number
		while (noOfdigits > 0) {
			System.out.println(n / (int) Math.pow(10, noOfdigits - 1));
			n %= (int) Math.pow(10, noOfdigits - 1);
			noOfdigits--;
		}
	}
}
