package Lab7;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin hcn:");
		System.out.print("Chiều dài: ");
		double dai = scanner.nextDouble();
		System.out.print("Chiều rộng: ");
		double rong = scanner.nextDouble();
		ChuNhat cn = new ChuNhat(dai, rong);
		
		System.out.println("Nhập thông tin hv:");
		System.out.print("Nhập cạnh: ");
		double canh = scanner.nextDouble();
		Vuong hv = new Vuong(canh);
		
		cn.xuat();
		hv.xuat();
}

}

class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return 2 * (rong + dai);
    }

    public double getDienTich() {
        return rong * dai;
    }

    public void xuat() {
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Chiều dài: " + dai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + rong);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}