package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    String ten;
    double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return ten + " giá: " + gia;
    }
}

public class Bai3 {
    private static ArrayList<SanPham> dssanpham = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhập");
            System.out.println("2. Sắp xếp giảm dần theo giá");
            System.out.println("3. Tìm và xóa");
            System.out.println("4. Xuất giá trung bình");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                	if (dssanpham.isEmpty()) {
    					System.out.println("Danh sách trống, hãy nhập");
    					break;
    				}
                    sapxep();
                    break;
                case 3:
                	if (dssanpham.isEmpty()) {
    					System.out.println("Danh sách trống, hãy nhập");
    					break;
    				}
                    xoa();
                    break;
                case 4:
                	if (dssanpham.isEmpty()) {
    					System.out.println("Danh sách trống, hãy nhập");
    					break;
    				}
                    tinhTB();
                    break;
                case 5:
                    System.out.println("Thoát");
                    System.exit(0);
                default:
                    System.out.println("Chọn lại");
            }

    }
    }

    public static void nhap() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm (N để thoát): ");
        int i = 0;
        while (true) {
        	System.out.println("Nhập thông tin sản phẩm " + (i++ + 1) + ":");
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            if (ten.equals("N")) break;
            System.out.print("Giá: ");
            double gia = scanner.nextDouble();
            scanner.nextLine();
            if (ten.equals("N")) break;

            SanPham sanpham = new SanPham(ten, gia);
            dssanpham.add(sanpham);
        }
            
        
    }

    public static void sapxep() {
    	Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(dssanpham, comp);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp:");
        for (SanPham sanpham : dssanpham) {
            System.out.println(sanpham);
        }
    }

    public static void xoa() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String ten = scanner.nextLine();

        boolean check = false;
        for (SanPham sanpham : dssanpham) {
            if (sanpham.getTen().equals(ten)) {
                dssanpham.remove(sanpham);
                check = true;
                break;
            }
        }

        if (check) System.out.println("Đã xóa " + ten);
        else System.out.println("Không tìm thấy " + ten);
        
    }

    public static void tinhTB() {
            double sum = 0;
            for (SanPham sanpham : dssanpham) {
                sum += sanpham.getGia();
            }
            double avg = sum / dssanpham.size();
            System.out.println("Giá trung bình: " + avg);
    }
}
