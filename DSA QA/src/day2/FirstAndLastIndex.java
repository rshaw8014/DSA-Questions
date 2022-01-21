package day2;

import java.util.Scanner;

public class FirstAndLastIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int d = sc.nextInt();

		// Finding first index
		int low = 0;
		int high = a.length - 1;
		int fi = -1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (a[mid] == d) {
				fi = mid;
				high = mid - 1;
			} else if (a[mid] > d) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		// finding last index
		low = 0;
		high = a.length - 1;
		int li = -1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (a[mid] == d) {
				li = mid;
				low = mid + 1;
			} else if (a[mid] > d) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		System.out.println(fi);
		System.out.println(li);
	}
}
