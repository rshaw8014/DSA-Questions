package day2;

import java.util.Scanner;

public class SpanOfArray {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(max - min);
	}
}
