package day2;

import java.util.Scanner;

public class BrokenEconomy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int low = 0;
		int high = n - 1;
		int ceil = arr[high];
		int floor = arr[low];
		while (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] == d) {
				ceil = floor = d;
				break;
			} else if (arr[mid] > d) {
				ceil = arr[mid];
				high--;
			} else {
				floor = arr[mid];
				low++;
			}
		}
		System.out.println(ceil);
		System.out.println(floor);
	}
}
