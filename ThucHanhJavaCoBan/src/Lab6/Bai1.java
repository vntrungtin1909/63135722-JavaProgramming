package Lab6;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        
        String ho = layHo(hoTen);
        String tenDem = layTenDem(hoTen);
        String ten = layTen(hoTen);
        System.out.println("Họ: " + ho.toUpperCase());
        System.out.println("Tên đệm: " + tenDem.toUpperCase());
        System.out.println("Tên: " + ten.toUpperCase());
	}
	
	public static String layHo(String hoTen) {
        int index = hoTen.indexOf(" ");
        if (index != -1) {
            return hoTen.substring(0, index);
        } else {
            return hoTen;
        }
    }

    public static String layTenDem(String hoTen) {
        int index1 = hoTen.indexOf(" ");
        int index2 = hoTen.lastIndexOf(" ");

        if (index1 != -1 && index2 != -1 && index1 != index2) {
            return hoTen.substring(index1 + 1, index2);
        } else {
            return "";
        }
    }

    public static String layTen(String hoTen) {
        int index = hoTen.lastIndexOf(" ");
        if (index != -1) {
            return hoTen.substring(index + 1);
        } else {
            return hoTen;
        }
    }
}