package javademo181;

import java.util.Scanner;

public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner abcv = new Scanner(System.in);

		System.out.println("Cạnh của hình lập phương là: ");
		int a = abcv.nextInt();
		System.out.println("Thể tích của hình lập phương là: " + Math.pow(a, 3));

	}
}
