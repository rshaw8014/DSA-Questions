package day2;

import java.util.Scanner;

public class DifferenceOfTwoArrays {

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

		int res[] = new int[b];
		int i = a - 1;
		int j = b - 1;
		int k = b - 1;
		int carry = 0;
		while (k >= 0) {
			if (j >= 0) {
				res[k] = n2[j--];
			}
			if (i >= 0) {
				res[k] = res[k] - n1[i--];
			}
			res[k] += carry;
			if (res[k] < 0) {
				res[k] += 10;
				carry = -1;
			} else {
				carry = 0;
			}
			k--;
		}
		int idx = 0;
		while (idx < res.length && res[idx] == 0) {
			idx++;
		}

		while (idx < res.length) {
			System.out.println(res[idx++]);
		}
	}

}
