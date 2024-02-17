package Lab3;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số bảng cửu chương: ");
		int x = scanner.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println("Bảng cửu chương " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

}
