package Lab4;

import java.util.Scanner;

public class Bai4 {
	public static class SanPham {
		String tenSp;
		double donGia;
		double giamGia;

		public SanPham(String tenSp, double donGia, double giamGia) {
			this.tenSp = tenSp;
			this.donGia = donGia;
			this.giamGia = giamGia;
		}

		public SanPham(String tenSp, double donGia) {
			this(tenSp, donGia, 0);
		}

		public String getTenSp() {
			return tenSp;
		}

		public void setTenSp(String tenSp) {
			this.tenSp = tenSp;
		}

		public double getDonGia() {
			return donGia;
		}

		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}

		public double getGiamGia() {
			return giamGia;
		}

		public void setGiamGia(double giamGia) {
			this.giamGia = giamGia;
		}

		private double getThueNhapKhau() {
			return getDonGia() * 0.1;
		}

		void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhập tên sản phẩm: ");
			tenSp = scanner.nextLine();
			System.out.print("Nhập đơn giá: ");
			donGia = scanner.nextDouble();
			System.out.print("Nhập giảm giá: ");
			giamGia = scanner.nextDouble();
		}

		void xuat() {
			System.out.println("Tên sản phẩm: " + tenSp + ", giá: " + donGia + ", giảm giá: " + giamGia
					+ "%, thuế nhập khẩu: " + getThueNhapKhau());
		}
	}

	public static void main(String[] args) {


	}

}
