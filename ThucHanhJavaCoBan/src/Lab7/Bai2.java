package Lab7;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class SinhVienPoly {
	protected String hoten;
	protected String nganh;
	
	public SinhVienPoly(String hoten, String nganh) {
		this.hoten = hoten;
		this.nganh = nganh;
	}
	abstract double getDiem();
	String getHocLuc() {
		if (getDiem() < 5) return "yếu";
		else if (getDiem() >= 5 && getDiem() < 6.5) return "trung bình";
		else if (getDiem() >= 6.5 && getDiem() < 7.5) return "khá";
		else if (getDiem() >= 7.5 && getDiem() < 9) return "giỏi";
		return "xuất sắc";
	}
	void xuat() {
		System.out.println("Họ tên sinh viên: " + hoten);
		System.out.println("Ngành: " + nganh);
		System.out.println("Điểm: " + getDiem());
		System.out.println("Học lực: " + getHocLuc());
	}
	
}
