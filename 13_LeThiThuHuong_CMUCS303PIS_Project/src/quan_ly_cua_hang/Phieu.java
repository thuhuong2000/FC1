package quan_ly_cua_hang;

import java.util.Scanner;
//Lớp con thừa kế các phương thức thuộc tính của cha
public class Phieu extends MatHang
{
	
	private Date date=new Date();
	private String loai;
	private String m="mua";
	private String b="ban";
	public String getLoai() {
		return loai;
	}
	public void setLoai(String l) {
		this.loai=l;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date=date;
	}
	//hàm khởi tạo không đối số
	public Phieu() {
		//hàm khởi tạo không đối số của lớp cha
		super();
	}
	//hàm khởi tạo có đối số
	public Phieu(String ma,String ten,String nv,String cc,int sl,double dg,String l,Date date) {
		//hàm khởi tạo có đối số của lớp cha
		super(ma,ten,nv,cc,sl,dg);
		//hàm khởi tạo có đối số của lớp con
		this.loai=l;
		this.date=date;
	}
	//hàm nhập
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Loai mat hang:");
		this.setLoai(kb.nextLine());
		super.input();
		if(this.loai.equals(m)) {
			System.out.println("Enter Ngay Nhap:");
			date.input();
			System.out.println("Enter Hang Dung:");
			date.input();
		}
		else if(this.loai.equals(b))
		{
			System.out.println("Enter Ngay Xuat:");
			date.input();
		}
	}
	//hàm xuất
	public void output() {
		System.out.println("Loai mat hang:"+this.loai);
		super.output();
		if(this.loai.equals(m)) {
			System.out.println("Ngay Nhap:");
			date.output();
			System.out.println("Han Dung:");
			date.output();
		}
		else if(this.loai.equals(b))
		{
			System.out.println("Ngay Xuat:");
			date.output();
		}
	}
	public double solve() {
		return this.soluong*this.dongia;
	}


	public static void main(String[] args) {
		Phieu p=new Phieu();
		p.input();
		p.output();
		System.out.println();

	}

}
