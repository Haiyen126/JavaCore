package lab2;

import java.util.Scanner;

public class lab2Bai04 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		switch(value) {
		case 1 :
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Nhập vào a = ");
			int a = scanner1.nextInt();
			System.out.println("Nhập vào b = ");
			int b = scanner1.nextInt();
			if (a == 0 && b == 0) {
				System.out.println("phương trình vô số nghiệm");
			} else if (a == 0 && b != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				System.out.println("Kết quả là:" + -b / a);
			}
		break;
		case 2:
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Nhap a: ");
			int a1 = scanner2.nextInt();
			
			System.out.println("Nhap b: ");
			int b1 = scanner2.nextInt();
			
			System.out.println("Nhap c: ");
			int c1 = scanner2.nextInt();
			
			if (a1 == 0) {
				if (b1 ==0 && c1 == 0) {
					System.out.println("Pt vo so nghiem");
				}else if(b1 ==0 && c1 != 0) {
					System.out.println("pt vo nghiem");
				}else {
					System.out.println("Ket qua" + -c1/b1);
				}
			}else {
				if(b1*b1 -4*a1*c1 < 0) {
					System.out.println("Phuong trinh vo nghiem");
					
				}else if(b1*b1 -4*a1*c1 == 0) {
					System.out.println("Pt co nghiem kep " + -b1/(2*a1));
				}else {
					System.out.println("Pt co 2 nghiem " + (-b1 + Math.sqrt(b1*b1 -4*a1*c1))/(2*a1) + (-b1 - Math.sqrt(b1*b1 -4*a1*c1))/(2*a1));
				}
			}
			break;
		case 3 :
			Scanner scanner3 = new Scanner(System.in);
			
			System.out.println("Nhap vao so dien: ");
			
			int monneyE = scanner3.nextInt();
			 
			if(monneyE> 0 && monneyE <= 100 ) {
				System.out.println(" so tien dien" + monneyE*1000);
			}else if(monneyE>100) {
				System.out.println("so tien dien :" +  100*1000+(monneyE-100)*1500);
			}
			break;
			default:
				System.exit(0);
		}
		
	}

}
