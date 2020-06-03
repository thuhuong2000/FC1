package quan_ly_cua_hang_tap_hoa;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ex extends JFrame implements ActionListener,KeyListener,ItemListener
{
	private JLabel lbMa,lbTen,lbNhan,lbNhacc,lbSoLuong,lbDonGia,lbNgayNhap,lbNgayXuat,lbHanDung,lbTien,lbTieuDe;
	private JTextField txtMa,txtTen,txtNhan,txtNhacc,txtSoLuong,txtDonGia,txtNgayNhap,txtNgayXuat,txtHanDung,txtTien,txtTieuDe;
	private JButton btnSort,btnSearch,btnAdd,btnDelete,btnFix,btnTien,btnReset,btnExit;
	private JPanel pMa,pTen,pNhan,pNhacc,pSoLuong,pDonGia,pNgayNhap,pNgayXuat,pHanDung,pTien,pTieuDe,pBtn;
	private JRadioButton m, b;
	private JTable table;
	private JScrollPane scrollPane = new JScrollPane();
//	private Vector tableTitle = new Vector();
//	private Vector tableRecords = new Vector();
	
	public Ex() {
		//1.thiet lap choJFrame
		super("Sum of two interger");
		super.setSize(700,700);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new GridLayout(15,1));
		
		//2.Tao cac panel chua cac components
		
		lbTieuDe= new JLabel();
		lbTieuDe.setText("Quan Ly cua hang tap hoa");
		lbTieuDe.setForeground(Color.GREEN);
		lbTieuDe.setFont(new Font("",Font.BOLD,15));
		this.getContentPane().add(lbTieuDe);
		
		pMa=new JPanel();
		pMa.setLayout(new FlowLayout());//default layout cua JPanel la FlowLayout co hay k cung dc
		lbMa=new JLabel("Enter Ma San Pham");
		txtMa=new JTextField(10);
		pMa = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pMa.add(lbMa);
		pMa.add(txtMa);
		
		pTen=new JPanel();
		lbTen=new JLabel("Enter Ten San Pham");
		txtTen=new JTextField(10);
		pTen = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pTen.add(lbTen);
		pTen.add(txtTen);
		
		pNhan=new JPanel();
		lbNhan=new JLabel("Enter Ten Nhan Vien");
		txtNhan=new JTextField(10);
		//txtNhan.setEnabled(false);
		pNhan = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pNhan.add(lbNhan);
		pNhan.add(txtNhan);
		
		pNhacc=new JPanel();
		lbNhacc=new JLabel("Enter Ten Nha Cung Cap");
		txtNhacc=new JTextField(10);
		pNhacc = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pNhacc.add(lbNhacc);
		pNhacc.add(txtNhacc);
		
		pSoLuong=new JPanel();
		lbSoLuong=new JLabel("Enter So Luong");
		txtSoLuong=new JTextField(10);
		pSoLuong = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pSoLuong.add(lbSoLuong);
		pSoLuong.add(txtSoLuong);
		
		pDonGia=new JPanel();
		lbDonGia=new JLabel("Enter Don Gia");
		txtDonGia=new JTextField(10);
		pDonGia = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pDonGia.add(lbDonGia);
		pDonGia.add(txtDonGia);
		
		pNgayNhap=new JPanel();
		lbNgayNhap=new JLabel("Enter Ngay Nhap");
		txtNgayNhap=new JTextField(10);
		pNgayNhap = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pNgayNhap.add(lbNgayNhap);
		pNgayNhap.add(txtNgayNhap);
		
		pNgayXuat=new JPanel();
		lbNgayXuat=new JLabel("Enter Ngay Xuat");
		txtNgayXuat=new JTextField(10);
		pNgayXuat = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pNgayXuat.add(lbNgayXuat);
		pNgayXuat.add(txtNgayXuat);
		
		pHanDung=new JPanel();
		lbHanDung=new JLabel("Enter Han Dung");
		txtHanDung=new JTextField(10);
		pHanDung = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pHanDung.add(lbHanDung);
		pHanDung.add(txtHanDung);
		
		pTien=new JPanel();
		lbTien=new JLabel("Tong tien");
		txtTien=new JTextField(10);
		pTien = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pTien.add(lbTien);
		pTien.add(txtTien);
		
		pBtn=new JPanel();
		m=new JRadioButton("Mua Hang");
		b=new JRadioButton("Ban Hang");
		ButtonGroup h=new ButtonGroup();
		h.add(m);
		h.add(b);
		
		//btnSort,btnSearch,btnAdd,btnDelete,btnFix,btnTien,btnReset,btnExit;
		
		pBtn=new JPanel();
		btnSort=new JButton("Sort");
		btnSearch=new JButton("Search");
		btnAdd=new JButton("Add");
		btnDelete=new JButton("Delete");
		btnFix=new JButton("Fix");
		btnTien=new JButton("Tien");
		btnReset=new JButton("Reset");
		btnExit=new JButton("Exit");
		pBtn.add(btnSort);
		pBtn.add(btnSearch);
		pBtn.add(btnAdd);
		pBtn.add(btnDelete);
		pBtn.add(btnFix);
		pBtn.add(btnTien);
		pBtn.add(btnReset);
		pBtn.add(btnExit);

		
		//3.them cac components vao JFrame
		super.add(m);
		super.add(b);	
		super.add(pMa);
		super.add(pTen);
		super.add(pNhacc);
		super.add(pNhan);
		super.add(pSoLuong);
		super.add(pDonGia);
		super.add(pNgayNhap);
		super.add(pNgayXuat);
		super.add(pHanDung);
		super.add(pTien);
		super.add(pBtn);
		
		//Tao bang
		table = new JTable();
		scrollPane.setViewportView(table);
		scrollPane.setBounds(60, 500, 850, 150);
		tableTitle.add("Ma San Pham");
		tableTitle.add("Ten San Pham");
		tableTitle.add("Ten Nhan Vien");
		tableTitle.add("Ten Nha Cung Cap");
		tableTitle.add("So Luong");
		tableTitle.add("Don Gia");
		tableTitle.add("Ngay Nhap");
		tableTitle.add("Ngay Xuat");
		tableTitle.add("Han Dung");
		tableTitle.add("Tien");
		table.setModel(new DefaultTableModel(tableRecords, tableTitle));
		add(scrollPane);
		
		//4.dang ky su kien
		m.addItemListener(this);
		b.addItemListener(this);
		btnTien.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		
		//txtMa,txtTen,txtNhan,txtNhacc,txtSoLuong,txtDonGia,txtNgayNhap,txtNgayXuat,txtHanDung
		txtMa.addKeyListener(this);
		txtTen.addKeyListener(this);
		txtNhan.addKeyListener(this);
		txtNhacc.addKeyListener(this);
		txtSoLuong.addKeyListener(this);
		txtDonGia.addKeyListener(this);
		txtNgayNhap.addKeyListener(this);
		txtNgayXuat.addKeyListener(this);
		txtHanDung.addKeyListener(this);
		txtTien.addKeyListener(this);
		
		super.validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnExit) 
		{
			System.exit(0);
		}
		if(e.getSource()==btnReset) 
		{
			////txtMa,txtTen,txtNhan,txtNhacc,txtSoLuong,txtDonGia,txtNgayNhap,txtNgayXuat,txtHanDung
			txtMa.setText("");
			txtTen.setText("");
			txtNhan.setText("");
			txtNhacc.setText("");
			txtSoLuong.setText("");
			txtDonGia.setText("");
			txtNgayNhap.setText("");
			txtNgayXuat.setText("");
			txtHanDung.setText("");
			txtTien.setText("");
		}
		if(e.getSource()==btnTien) 
		{
			double b=Double.parseDouble(txtSoLuong.getText());
			double c=Double.parseDouble(txtDonGia.getText());
			double a=b*c;
			txtTien.setText(""+a);
		}

	}
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtMa)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtTen.requestFocus();
			}
		if(e.getSource()==txtTen)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				btnTien.requestFocus();
			}
		//txtMa,txtTen,txtNhan,txtNhacc,txtSoLuong,txtDonGia,txtNgayNhap,txtNgayXuat,txtHanDung
		if(e.getSource()==txtTen)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtNhan.requestFocus();
			}
		if(e.getSource()==txtNhan)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtNhacc.requestFocus();
			}
		if(e.getSource()==txtNhacc)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtSoLuong.requestFocus();
			}
		if(e.getSource()==txtSoLuong)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtDonGia.requestFocus();
			}
		if(e.getSource()==txtDonGia)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtNgayNhap.requestFocus();
			}
		if(e.getSource()==txtNgayNhap)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtNgayXuat.requestFocus();
			}
		if(e.getSource()==txtNgayXuat)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				txtHanDung.requestFocus();
			}
		if(e.getSource()==txtHanDung)
			if(e.getKeyCode() == KeyEvent.VK_ENTER ||e.getKeyCode() == KeyEvent.VK_DOWN||e.getKeyCode() == KeyEvent.VK_RIGHT) {
				btnTien.requestFocus();
			}
		if(e.getSource()==btnTien)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				
			}
		
		if(e.getSource()==txtTen)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtMa.requestFocus();
			}
		if(e.getSource()==txtNhan)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtTen.requestFocus();
			}
		if(e.getSource()==txtNhacc)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtNhan.requestFocus();
			}
		if(e.getSource()==txtSoLuong)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtNhacc.requestFocus();
			}
		if(e.getSource()==txtDonGia)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtSoLuong.requestFocus();
			}
		if(e.getSource()==txtNgayNhap)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtDonGia.requestFocus();
			}
		if(e.getSource()==txtNgayXuat)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtNgayNhap.requestFocus();
			}
		if(e.getSource()==txtHanDung)
			if(e.getKeyCode() == KeyEvent.VK_UP||e.getKeyCode() == KeyEvent.VK_LEFT) {
				txtNgayXuat.requestFocus();
			}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	public static void main(String[] args) {
		Ex huong=new Ex();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItemSelectable()==m) {
			pNgayXuat.setVisible(false);
			
		}
		else 
		{
			pNgayNhap.setVisible(false);
			pHanDung.setVisible(false);
			pNgayXuat.setVisible(true);
		}
		
	}

}
