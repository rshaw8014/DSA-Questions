package day2;

import java.util.Scanner;

public class SumOfTwoArrays {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n1[] = new int[a];
		for (int i = 0; i < a; i++) {
			n1[i] = sc.nextInt();
		}

		int b = sc.nextInt();
		int n2[] = new int[b];
		for (int i = 0; i < b; i++) {
			n2[i] = sc.nextInt();
		}

		int res[] = new int[a > b ? a : b];
		int i = a - 1;
		int j = b - 1;
		int k = res.length - 1;
		int carry = 0;
		while (k >= 0) {
			if (i >= 0) {
				res[k] += n1[i--];
			}
			if (j >= 0) {
				res[k] += n2[j--];
			}
			res[k] += carry;
			carry = res[k] / 10;
			res[k] %= 10;
			k--;
		}
		if (carry > 0) {
			System.out.println(carry);
		}
		for (int n : res) {
			System.out.println(n);
		}

	}

}
