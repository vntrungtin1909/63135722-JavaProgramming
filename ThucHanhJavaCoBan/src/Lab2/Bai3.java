package Lab2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng trong tháng: ");
		double num = scanner.nextDouble();
		if (num < 50) System.out.println("Số tiền điện: " + (num * 1000));
		else System.out.println("Số tiền điện: " + (50 * 1000 + (num - 50) * 1200));
	}

}
