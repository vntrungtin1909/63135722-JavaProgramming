package Lab2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		if (a == 0) {
			if (b == 0) {
				if (c == 0) System.out.println("Phương trình vô số nghiệm");
				else System.out.println("Phương trình vô nghiệm");
			}
			else System.out.println("Phương trình có nghiệm: " + (-b / c));
		}
		else {
			double delta = (Math.pow(b, 2) - 4 * a * c);
			if (delta < 0) System.out.println("Phương trình vô nghiệm");
			else if (delta == 0) System.out.println("Phương trình có nghiệm kép: " + (-b / (2 * a)));
			else System.out.printf("Phương trình có 2 nghiệm phân biệt: %f và %f", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta) / (2 * a)));
		}
	}
	
	

}
