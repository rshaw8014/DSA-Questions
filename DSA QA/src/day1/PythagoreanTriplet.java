package day1;

import java.util.Scanner;

public class PythagoreanTriplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a * a == (b * b) + (c * c) ? true : false);
		} else if (b > a && b > c) {
			System.out.println(b * b == (a * a) + (c * c) ? true : false);
		} else if (c > a && c > b) {
			System.out.println(c * c == (a * a) + (b * b) ? true : false);
		} else {
			System.out.println(false);
		}
	}
}
