package Lab1;

import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập cạnh: ");
		double a = scanner.nextDouble();
		System.out.printf("thể tích lập phương: " + Math.pow(a, 3));

	}

}
