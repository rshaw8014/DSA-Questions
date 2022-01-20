package day1;

import java.util.Scanner;

public class BenjaminBulbs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int d=1;d*d<=n;d++) {
			System.out.println(d*d);
		}
	}
}
