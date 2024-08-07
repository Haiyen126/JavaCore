package lab2;

import java.util.Scanner;

public class lab2Bai02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		
		System.out.println("Nhap c: ");
		int c = scanner.nextInt();
		
		if (a == 0) {
			if (b==0 && c == 0) {
				System.out.println("Pt vo so nghiem");
			}else if(b==0 && c!= 0) {
				System.out.println("pt vo nghiem");
			}else {
				System.out.println("Ket qua" + -c/b);
			}
		}else {
			if(b*b -4*a*c < 0) {
				System.out.println("Phuong trinh vo nghiem");
				
			}else if(b*b -4*a*c == 0) {
				System.out.println("Pt co nghiem kep " + -b/(2*a));
			}else {
				System.out.println("Pt co 2 nghiem " + (-b + Math.sqrt(b*b -4*a*c))/(2*a) + (-b - Math.sqrt(b*b -4*a*c))/(2*a));
			}
		}
	}

}
