package javademo181;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		int a = 6;
		int b = 9;
		int c = Math.max(a, b);

		System.out.println("Max = " + c);

		Scanner scanner = new Scanner(System.in);
		System.out.println("First number: ");
		int firrstNumber = scanner.nextInt();

		System.out.println("Second number: ");

		int secondNumber = scanner.nextInt();

		System.out.println("Min is " + Math.min(firrstNumber, secondNumber));
		scanner.close();
	}
}
