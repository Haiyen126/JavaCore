package lab2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		System.out.println("Nhập vào số tiền:");

		Scanner scanner = new Scanner(System.in);

		int tien = scanner.nextInt();

		if (tien < 10) {
			System.out.println("khong phai dong thue");
		} else if (10 <= tien && tien <= 15) {
			System.out.println("Thuế 10%");
		} else if (15 <= tien && tien <= 30) {
			System.out.println("Thuế 20%");
		} else if (30 < tien) {
			System.out.println("Thuế 50%");
		}

	}

}
