package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			 System.out.println("+---------------------------------------------------+");
	            System.out.println("1. Nhập");
	            System.out.println("2. Xuất");
	            System.out.println("3. Xuất ngẫu nhiên");
	            System.out.println("4. Sắp xếp");
	            System.out.println("5. Xóa tên");
	            System.out.println("6. Thoát");
	            System.out.println("+---------------------------------------------------+");
	            System.out.print("Chọn chức năng: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				nhap(list);
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("Danh sách trống, hãy nhập");
					break;
				}
				System.out.println("Danh sách họ tên vừa nhập: ");
				xuat(list);
				break;
			case 3:
				if (list.isEmpty()) {
					System.out.println("Danh sách trống, hãy nhập");
					break;
				}
				tron(list);
				break;
			case 4:
				if (list.isEmpty()) {
					System.out.println("Danh sách trống, hãy nhập");
					break;
				}
				sapxep(list);
				break;
			case 5:
				if (list.isEmpty()) {
					System.out.println("Danh sách trống, hãy nhập");
					break;
				}
				xoa(list);
				break;
			case 6: 
				System.out.println("Chương trình đã thoát");
				System.exit(0);
			}
			
		}
			
				
	}
	
	public static void xoa(ArrayList<String> list) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên muốn xóa: ");
		boolean check = false;
		String ten = scanner.nextLine();
		for (String i : list) {
			if (ten.equals(i)) {
				list.remove(i);
				check = true;
				break;
			}
		}
		if (check) System.out.println("Đã xóa");
		else System.out.println("Không có tên vừa nhập");
	}
	
	public static void sapxep(ArrayList<String> list) {
		Collections.sort(list);
//		Collections.reverse(list);
		System.out.println("Danh sách sau khi sắp xếp: ");
		xuat(list);
	}
	
	public static void tron(ArrayList<String> list) {
		Collections.shuffle(list);
		System.out.println("Danh sách ngẫu nhiên: ");
		xuat(list);
	}
	
	public static void nhap(ArrayList<String> list) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên (N để thoát): ");
		while (true) {
			String hoten = scanner.nextLine();
			if (hoten.equals("N")) break;
			else		list.add(hoten);
			
		}
	}
	
	public static void xuat(ArrayList<String> list) {
		for (String i : list) {
			System.out.println(i);
		}
	}

}







