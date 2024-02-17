package Lab1;

import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("delta: " + delta);
		System.out.println("căn bậc hai của delta: " + Math.sqrt(delta));
		

	}

}
