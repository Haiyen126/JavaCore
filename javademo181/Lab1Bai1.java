package javademo181;

import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên:");
		String nameSV = scanner.nextLine();
		System.out.println("Nhập điêm trung bình:");
		int pointAVG = scanner.nextInt();

		System.out.println(nameSV + " có điểm = " + pointAVG);
	}

}
