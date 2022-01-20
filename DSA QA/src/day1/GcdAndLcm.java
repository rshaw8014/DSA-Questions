package day1;

import java.util.Scanner;

public class GcdAndLcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));

	}

	public static int gcd(int a, int b) {
		int r = 1;
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
