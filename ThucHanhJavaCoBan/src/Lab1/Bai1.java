package Lab1;

import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoten = scanner.nextLine();
		System.out.print("Điểm trung bình: ");
		double dtb = scanner.nextDouble();
		System.out.printf("%s, điểm trung bình: %f", hoten, dtb);
		scanner.close();
	}

}
