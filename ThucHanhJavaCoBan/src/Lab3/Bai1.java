package Lab3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = scanner.nextInt();
		boolean check = true;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(n + " không là số nguyên tố");
				check = false;
				break;
			}
		}
		if (check) System.out.println(n + " là số nguyên tố");
	}

}
