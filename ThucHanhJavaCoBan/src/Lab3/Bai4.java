package Lab3;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số học sinh: ");
		int n = scanner.nextInt();
		String[] hoten = new String[n];
		double[] diem = new double[n];
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.println("Nhập học sinh thứ " + (i + 1) + ": ");
			System.out.print("Họ và tên: ");
			hoten[i] = scanner.nextLine();
			System.out.print("Điểm: ");
			diem[i] = scanner.nextDouble();
		}
		for (int i = 0; i < n; i ++) {
			System.out.println("Thông tin học sinh thứ " + (i + 1));
			System.out.println("Họ và tên: " + hoten[i]);
			System.out.println("Điểm: " + diem[i]);
			if (diem[i] < 5) System.out.println("Học lực: Yếu");
			else if (diem[i] >= 5 && diem[i] < 6.5) System.out.println("Học lực: Trung bình");
			else if (diem[i] >= 6.5 && diem[i] < 7.5) System.out.println("Học lực: Khá");
			else if (diem[i] >= 7.5 && diem[i] < 9) System.out.println("Học lực: Giỏi");
			else if (diem[i] >= 9) System.out.println("Học lực: Xuất sắc");
		}
		for (int i = 0; i < n - 1; i ++) {
			for (int j = i + 1; i < n; j++) {
				if (diem[i] > diem[j]) {
					double t = diem[i];
					diem[i] = diem[j];
					diem[j] = t;
					
					String k = hoten[i];
					hoten[i] = hoten[j];
					hoten[j] = k;
				}
			}
		}
		System.out.println("Danh sách học sinh sắp xếp theo điểm tăng dần: ");
		for (int i = 0; i < n; i++) {
			System.out.println(hoten[i]);
		}
	}
}
