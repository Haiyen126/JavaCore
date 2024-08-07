package lab2;

import java.util.Scanner;

public class lab2Bai03 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Nhap vao so dien: ");
	
	int monneyE = scanner.nextInt();
	 
	if(monneyE> 0 && monneyE <= 100 ) {
		System.out.println(" so tien dien" + monneyE*1000);
	}else if(monneyE>100) {
		System.out.println("so tien dien :" +  100*1000+(monneyE-100)*1500);
	}
}
}
