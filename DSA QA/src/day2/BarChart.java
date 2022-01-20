package day2;

import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max)
				max = arr[i];
		}
		for (int i = max; i >= 1; i--) {
			for (int b : arr) {
				if (b >= i) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
