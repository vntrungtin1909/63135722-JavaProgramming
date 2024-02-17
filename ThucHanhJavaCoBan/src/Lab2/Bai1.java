package Lab2;

import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a và b: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		if (a == 0) {
			if (b == 0) System.out.println("Phương trình vô số nghiệm");
			else System.out.println("Phương trình vô nghiệm");
		}
		else System.out.println("Phương trình có nghiệm: " + (-b / a));
	}

}
