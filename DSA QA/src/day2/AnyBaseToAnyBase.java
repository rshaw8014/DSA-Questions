package day2;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();
		if (sourceBase != 10) {
			int nInDecimal = getValueIndecimal(n, sourceBase);
			System.out.println(getValueInBase(nInDecimal, destBase));
		} else {
			System.out.println(getValueInBase(n, destBase));
		}
	}

	// any base to decimal
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

	// decimal to any base
	public static int getValueInBase(int n, int b) {
		int ans = 0;
		int itr = 0;
		while (n > 0) {
			int rem = n % b;
			n /= b;
			ans += rem * (int) Math.pow(10, itr++);
		}
		return ans;
	}
}
