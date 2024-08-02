package javademo181;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chiều dài hình chữ nhật:");
		int cd = scanner.nextInt();

		System.out.println("Nhập chiều rộng hcn:");
		int cr = scanner.nextInt();

		System.out.println("Chu vi hcn: " + (cd + cr) * 2);
		System.out.println("Dien tich hcn: " + cd * cr);
		System.out.println("Canh nhỏ nhất của hcn :" + Math.min(cd, cr));
	}

}
