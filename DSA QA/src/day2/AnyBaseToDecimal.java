package day2;

import java.util.Scanner;

public class AnyBaseToDecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int d = getValueIndecimal(n, b);
		System.out.println(d);
	}

	public static int getValueIndecimal(int n, int b) {
		int power = 0;
		int res = 0;
		while (n > 0) {
			int rem = n % 10;
			res += rem * (int) Math.pow(b, power++);
			n /= 10;
		}
		return res;
	}
}
