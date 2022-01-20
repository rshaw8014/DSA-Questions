package day1;

import java.util.Scanner;

public class PrintZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			if (i == 1 || i == 5) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j < 6 - i; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}
