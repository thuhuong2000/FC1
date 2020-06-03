 package quan_ly_cua_hang;

import java.util.Scanner;
//Lớp cha
public class MatHang
{
	//Khai báo thuộc tính
	protected int soluong;
	protected double dongia;
	protected String maSP,tenSP,nhanVien,nhaCC;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String ma) {
		this.maSP=ma;
	}
	public String getTenSP() {
		return maSP;
	}
	public void setTenSP(String ten) {
		this.tenSP=ten;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int sl) {
		if(sl<0) this.soluong=0;
		else this.soluong=sl;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dg) {
		if(dg<0) this.dongia=0;
		else this.dongia=dg;
	}
	public String getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(String nv) {
		this.nhanVien=nv;
	}
	public String getNhaCC() {
		return nhaCC;
	}
	public void setNhaCC(String cc) {
		this.nhaCC=cc;
	}
	//Hàm khởi tạo không đối số
	public MatHang() {
		this.maSP="";
		this.tenSP="";
		this.nhanVien="";
		this.nhaCC="";
	}
	//Hàm khởi tạo có đối số
	public MatHang(String ma,String ten,String nv,String cc,int sl,double dg) {
		this.soluong=sl;
		this.dongia=dg;
		this.maSP=ma;
		this.tenSP=ten;
		this.nhanVien=nv;
		this.nhaCC=cc;
	}
	//Cài đặt phương thức
	//hàm nhập
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Ma SP:");
		this.setMaSP(kb.nextLine());
		System.out.println("Enter Ten SP:");
		this.setTenSP(kb.nextLine());
		System.out.println("Enter Ten Nha CC:");
		this.setNhaCC(kb.nextLine());
		System.out.println("Enter Ten Nhan Vien:");
		this.setNhanVien(kb.nextLine());
		System.out.println("Enter so luong mat hang:");
		this.setSoluong(kb.nextInt());
		System.out.println("Enter don gia:");
		this.setDongia(kb.nextDouble());
		
	}
	//hàm xuất
	public void output() {
		System.out.println("Ma SP:"+this.maSP);
		System.out.println("Ten SP:"+this.tenSP);
		System.out.println("Nha Cung Cap:"+this.nhaCC);
		System.out.println("So Luong:"+this.soluong);
		System.out.println("Don gia:"+this.dongia);
		System.out.println("Nhan Vien:"+this.nhanVien);
		
	}

	public static void main(String[] args) {
		//Tạo các đối tượng có giá trị cụ thể riêng biệt
		MatHang h=new MatHang();
		h.input();
		h.output();
	}

}
