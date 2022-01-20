package day1;

import java.util.Scanner;

public class AllPrimesTillN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		for (int i = low; i <= high; i++) {
			boolean isPrime = true;
			for (int d = 2; d * d <= i; d++) {
				if (i % d == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i);
		}
	}
}
