package day2;

import java.util.Scanner;

public class SubsetsOfArray {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < (int) Math.pow(2, n); i++) {
			int temp = i;
			String ans = "";
			for (int j = n - 1; j >= 0; j--) {
				int dec = temp % 2;
				ans = dec == 0 ? "-\t" + ans : arr[j] + "\t" + ans;
				temp /= 2;
			}
			System.out.println(ans);
		}
	}

}
