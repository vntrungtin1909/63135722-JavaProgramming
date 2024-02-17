package Lab1;

import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập 2 cạnh của hình: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double p = (a + b) * 2;
		double s = a * b;
		double canhMin = Math.min(a, b);
		System.out.printf("Chu vi: %f, diện tích: %f, cạnh nhỏ: %f", p, s, canhMin);

	}

}
