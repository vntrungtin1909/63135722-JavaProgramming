package Lab2;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("+---------------------------------------------------+");
	            System.out.println("1. Giải phương trình bậc nhất");
	            System.out.println("2. Giải phương trình bậc 2");
	            System.out.println("3. Tính tiền điện");
	            System.out.println("4. Kết thúc");
	            System.out.println("+---------------------------------------------------+");
	            System.out.print("Chọn chức năng: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    giaiPTB1();
	                    break;
	                case 2:
	                    giaiPTB2();
	                    break;
	                case 3:
	                    tinhTienDien();
	                    break;
	                case 4:
	                    System.out.println("Kết thúc chương trình.");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
	            }
	        }
	    }

	    public static void giaiPTB1() {
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

	    public static void giaiPTB2() {
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
				else System.out.printf("Phương trình có 2 nghiệm phân biệt: %f và %f\n", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta) / (2 * a)));
			}
	    }

	    public static void tinhTienDien() {
	    	Scanner scanner = new Scanner(System.in);
			System.out.print("Nhập số điện sử dụng trong tháng: ");
			double num = scanner.nextDouble();
			if (num < 50) System.out.println("Số tiền điện: " + (num * 1000));
			else System.out.println("Số tiền điện: " + (50 * 1000 + (num - 50) * 1200));
	    }
	}


