package day1;

import java.util.Scanner;

public class PrimeFact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tempNum = n;
		int div = 2;
		while (n > 1) {
			if (n % div == 0) {
				System.out.print(div + " ");
				n /= div;
			} else if (div * div > n) {
				break;
			} else {
				div++;
			}
		}
		if (n != 1) {
			System.out.println(tempNum);
		}

	}
}
