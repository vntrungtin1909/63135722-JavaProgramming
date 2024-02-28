package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai4 {

    static ArrayList<SinhVienPoly> ds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Xuất danh sách học lực giỏi");
            System.out.println("4. Sắp xếp theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    nhapds(scanner);
                    break;
                case 2:
                    xuatds();
                    break;
                case 3:
                    xuatSinhVienGioi();
                    break;
                case 4:
                    sapXepTheoDiem();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("chọn lại");
            }
        } 
        
    }

    static void nhapds(Scanner scanner) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoten = scanner.nextLine();
            System.out.print("Ngành (IT/Biz): ");
            String nganh = scanner.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Điểm Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Điểm CSS: ");
                double diemCss = scanner.nextDouble();
                System.out.print("Điểm HTML: ");
                double diemHtml = scanner.nextDouble();
                ds.add(new SinhVienIT(hoten, nganh, diemJava, diemCss, diemHtml));
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Điểm Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Điểm Sales: ");
                double diemSales = scanner.nextDouble();
                ds.add(new SinhVienBiz(hoten, nganh, diemMarketing, diemSales));
            } else {
                System.out.println("nhập lại");
                i--; 
            }
            scanner.nextLine(); 
        }
    }

    static void xuatds() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("Danh sách");
        for (SinhVienPoly sv : ds) {
            sv.xuat();
            System.out.println();
        }
    }

    static void xuatSinhVienGioi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("Sinh viên giỏi");
        for (SinhVienPoly sv : ds) {
            if (sv.getHocLuc().equals("giỏi")) {
                sv.xuat();
                System.out.println();
            }
        }
    }

    static void sapXepTheoDiem() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        Collections.sort(ds, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
                if (sv1.getDiem() < sv2.getDiem()) {
                    return 1;
                } else if (sv1.getDiem() > sv2.getDiem()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("Danh sách sắp xếp");
        for (SinhVienPoly sv : ds) {
            sv.xuat();
            System.out.println();
        }
    }
}
