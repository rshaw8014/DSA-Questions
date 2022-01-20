package day2;

import java.util.Scanner;

public class AnyBaseMultiplication {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getProduct(b, n1, n2);
		System.out.println(d);
	}

	public static int getProduct(int b, int n1, int n2) {
		int power = 1;
		int res = 0;
		while (n1 > 0) {
			int d1 = n1 % 10;
			n1 /= 10;
			int paritalRes = getProductWithSingleDigit(b, d1, n2);
			res = getSum(b, res, paritalRes * power);
			power *= 10;
		}
		return res;
	}

	public static int getProductWithSingleDigit(int b, int d1, int n2) {
		int power = 1;
		int res = 0;
		int c = 0;
		while (n2 > 0 || c > 0) {
			int d2 = n2 % 10;
			n2 /= 10;
			int d = d1 * d2 + c;
			c = d / b;
			d = d % b;
			res += d * power;
			power *= 10;
		}
		return res;

	}

	public static int getSum(int b, int n1, int n2) {
		int power = 1;
		int result = 0;
		int c = 0;
		while (n1 > 0 || n2 > 0 || c > 0) {
			int r1 = n1 % 10;
			int r2 = n2 % 10;
			int d = r1 + r2 + c;
			c = d / b;
			d = d % b;
			result += d * power;
			power *= 10;
			n1 = n1 / 10;
			n2 = n2 / 10;
		}
		return result;
	}

}
