package Lab7;
import Lab7.Bai2;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SinhVienIT extends SinhVienPoly {
	double diemJava;
	double diemCss;
	double diemHtml;
	
	public SinhVienIT(String hoten, String nganh, double diemJava, double diemCss, double diemHtml) {
		super(hoten, nganh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
		
	}
	
	@Override
	double getDiem() {
		return (2 * diemJava + diemHtml + diemCss) / 4;
	}
}

class SinhVienBiz extends SinhVienPoly {
	double diemMarketing;
	double diemSales;
	
	public SinhVienBiz(String hoten, String nganh, double diemMarketing, double diemSales) {
		super(hoten, nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
		
	}
	
	@Override
	double getDiem() {
		return (2 * diemMarketing + diemSales) / 3;
	}
}