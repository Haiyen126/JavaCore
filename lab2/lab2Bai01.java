package lab2;

import java.util.Scanner;

public class lab2Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào a = ");
		int a = scanner.nextInt();
		System.out.println("Nhập vào b = ");
		int b = scanner.nextInt();
//		if (a == 0 && b == 0) {
//			System.out.println("phương trình vô số nghiệm");
//		} else if (a == 0 && b != 0) {
//			System.out.println("Phương trình vô nghiệm");
//		} else {
//			System.out.println("Kết quả là:" + -b / a);
//		}

		switch (a) {
		case 0:
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm ");
			}
			break;
		default:
			System.out.println("Kết quả của phương trình là:" + -b / a);
		}

	}

}
