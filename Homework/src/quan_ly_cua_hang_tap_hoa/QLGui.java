package quan_ly_cua_hang_tap_hoa;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class QLGui extends JFrame
{
	private JLabel lbMa,lbTen,lbNhacc,lbSoLuong,lbDonGia,lbNgayNhap,lbNgayXuat,lbHanDung,lbTien,lbNhanVien,lbTieuDe;
	private JTextField txtMa,txtTen,txtNhacc,txtSoLuong,txtDonGia,txtNgayNhap,txtNgayXuat,txtHanDung,txtNhanVien,txtTien;
	private JButton btnSort,btnSearch,btnAdd,btnDelete,btnFix,btnTien;
	private JPanel pMa,pTen,pNhacc,pSoLuong,pDonGia,pNgayNhap,pNgayXuat,pHanDung,pNhanVien,pTien,pTieuDe,pBtn;
	private JRadioButton rdbM,rdbB;
	private JTable table;

	public QLGui() {
		//1.Thiet Lap cho Frame
		super("Nhom Hieu Tu Huong");
		super.setSize(500,600);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLayout(new GridLayout(15,1));
		
		lbTieuDe= new JLabel();
		lbTieuDe.setText("Quan Ly cua hang tap hoa");
		lbTieuDe.setForeground(Color.GREEN);
		lbTieuDe.setFont(new Font("",Font.BOLD,15));
		this.getContentPane().add(lbTieuDe);
		
		//2.tao cac panels components
		pMa = new JPanel();
		lbMa= new JLabel("Enter Ma sp");
		txtMa= new JTextField(10);
		pMa.add(lbMa);
		pMa.add(txtMa);
		
		pTen = new JPanel();
		lbTen= new JLabel("Enter Ten sp");
		txtTen= new JTextField(10);
		pTen.add(lbTen);
		pTen.add(txtTen);
		
		pNhacc = new JPanel();
		lbNhacc= new JLabel("Enter Ten Nha cung cap");
		txtNhacc= new JTextField(10);
		pNhacc.add(lbNhacc);
		pNhacc.add(txtNhacc);
		
		pNhanVien = new JPanel();
		lbNhanVien= new JLabel("Enter Ten nhan vien");
		txtTen= new JTextField(10);
		pNhanVien.add(lbNhanVien);
		pNhanVien.add(txtNhanVien);
		
		pSoLuong = new JPanel();
		lbSoLuong= new JLabel("Enter So Luong");
		txtSoLuong= new JTextField(10);
		pSoLuong.add(lbSoLuong);
		pSoLuong.add(txtSoLuong);
		
		pDonGia = new JPanel();
		lbDonGia= new JLabel("Enter Don Gia");
		txtDonGia= new JTextField(10);
		pDonGia.add(lbDonGia);
		pDonGia.add(txtDonGia);
		
		pNgayNhap = new JPanel();
		lbNgayNhap= new JLabel("Enter Ngay Nhap");
		txtNgayNhap= new JTextField(10);
		pNgayNhap.add(lbNgayNhap);
		pNgayNhap.add(txtNgayNhap);
		
		pNgayXuat = new JPanel();
		lbNgayXuat= new JLabel("Enter Ngay Xuat");
		txtNgayXuat= new JTextField(10);
		pNgayXuat.add(lbNgayXuat);
		pNgayXuat.add(txtNgayXuat);
		
		pHanDung = new JPanel();
		lbHanDung= new JLabel("Enter Han Dung");
		txtHanDung= new JTextField(10);
		pHanDung.add(lbHanDung);
		pHanDung.add(txtHanDung);
		
		pTien = new JPanel();
		lbTien= new JLabel("Tong Tien");
		txtTien= new JTextField(10);
		pTien.add(lbTien);
		pTien.add(txtTien);
		
		pBtn=new JPanel();
		rdbM=new JRadioButton("Mua Hang");
		rdbB=new JRadioButton("Ban Hang");
		btnSort=new JButton("Sort");
		btnSearch=new JButton("Search");
		btnAdd=new JButton("Add");
		btnDelete=new JButton("Delete");
		btnFix=new JButton("Fix");
		btnTien=new JButton("Tien");
		
		pBtn.add(btnAdd);
		pBtn.add(btnSort);
		pBtn.add(btnSearch);
		pBtn.add(btnDelete);
		pBtn.add(btnFix);
		pBtn.add(btnTien);
		
		
		txtMa = new JTextField();
		txtMa.setColumns(10);
		
		
		
		//3.them cac components vao Frame
		super.add(rdbM);
		super.add(rdbB);				
		super.add(pMa);
		super.add(pTen);
		super.add(pNhacc);
		super.add(pNhanVien);
		super.add(pSoLuong);
		super.add(pDonGia);
		super.add(pNgayNhap);
		super.add(pNgayXuat);
		super.add(pHanDung);
		super.add(pTien);
		super.add(pBtn);

		super.setVisible(true);
		
	}
	public static void main(String[] args) {
		QLGui qlg=new QLGui();

	}

}
