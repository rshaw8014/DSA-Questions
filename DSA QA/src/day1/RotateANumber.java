package day1;

import java.util.Scanner;

public class RotateANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int tempNum = n;
		// counting no of digits
		int noOfdigits = 0;
		while (tempNum > 0) {
			noOfdigits++;
			tempNum /= 10;
		}

		k = k % noOfdigits;
		if (k < 0) {
			k = noOfdigits + k;
		}
		for (int i = 1; i <= k; i++) {
			int r = n % 10;
			int q = n / 10;
			n = r * (int) Math.pow(10, noOfdigits - 1) + q;
		}
		System.out.println(n);

	}
}
