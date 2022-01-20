package day1;

import java.util.Scanner;

public class MaxMin2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int min1, min2, max1, max2;
		if (arr[0] < arr[1]) {
			min1 = max2 = arr[0];
			min2 = max1 = arr[1];
		} else if (arr[0] > arr[1]) {
			min1 = max2 = arr[1];
			min2 = max1 = arr[0];
		} else {
			min1 = min2 = max1 = max2 = arr[0];
		}

		for (int i = 2; i < n; i++) {
			if (arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			} else if (arr[i] < min2) {
				min2 = arr[i];
			}
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println(max2 + " " + min2);

	}
}
