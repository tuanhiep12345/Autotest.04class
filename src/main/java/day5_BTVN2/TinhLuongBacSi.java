package day5_BTVN2;

public class TinhLuongBacSi {

	private String ten;
	private double luongCoBan = 19000000;
	private double heSoLuong;
	private double soNamKinhNghiem;
	private double loai;

	public TinhLuongBacSi(String ten, double heSoLuong, double soNamKinhNghiem, double loai) {
		this.ten = ten;
		this.heSoLuong = heSoLuong;
		this.soNamKinhNghiem = soNamKinhNghiem;
		this.loai = loai;
	}

	public TinhLuongBacSi(String ten, double heSoLuong, double soNamKinhNghiem) {
		this.ten = ten;
		this.heSoLuong = heSoLuong;
		this.soNamKinhNghiem = soNamKinhNghiem;
	}

	public TinhLuongBacSi(String ten, double heSoLuong) {

		this.ten = ten;
		this.heSoLuong = heSoLuong;
	}

	public double tinhLuong(double luongCoBan, double heSoLuong) {
		return luongCoBan * heSoLuong;
	}

	public double tinhLuong(double luongCoBan, double heSoLuong, double soNamKinhNghiem) {
		return luongCoBan * heSoLuong * soNamKinhNghiem;
	}

	public double tinhLuong(double luongCoBan, double heSoLuong, double soNamKinhNghiem, double loai) {
		return luongCoBan * heSoLuong * soNamKinhNghiem * loai;
	}

	public static void main(String[] args) {
		TinhLuongBacSi doctor1 = new TinhLuongBacSi("Nguyen Thi A", 0.8);
		System.out.println("Luong cua bac si " + doctor1.ten + " la : "
				+ doctor1.tinhLuong(doctor1.luongCoBan, doctor1.heSoLuong));

		TinhLuongBacSi doctor2 = new TinhLuongBacSi("Nguyen Thi B", 1.1, 2);
		System.out.println("Luong cua bac si " + doctor2.ten + " la : "
				+ doctor2.tinhLuong(doctor2.luongCoBan, doctor2.heSoLuong, doctor2.soNamKinhNghiem));

		TinhLuongBacSi doctor3 = new TinhLuongBacSi("Nguyen Thi C", 2, 2, 0.45);
		System.out.println("Luong cua bac si " + doctor3.ten + " la : "
				+ doctor3.tinhLuong(doctor3.luongCoBan, doctor3.heSoLuong, doctor3.soNamKinhNghiem, doctor3.loai));
	}
}