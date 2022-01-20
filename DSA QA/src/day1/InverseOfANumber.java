package day1;

import java.util.Scanner;

public class InverseOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nod = (int) Math.log10(n) + 1;
		int res = 0;
		int i = 1;
		for (int p = nod; p >= 0; p--) {
			int pos = n / 10;
			res += i * (int) Math.pow(10, pos - 1);
			n = n / 10;
		}
		System.out.println(res);

	}

}
