package hocthoi;
import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;




public class Gui extends JFrame implements ActionListener,KeyListener
{
	private int n, nb = 0, i = 0;
	private JLabel ltieude,lma,lten,lncc,lsl,ldongia;
	private JTextField txtma, txtten, txtncc, txtsl, txtdongia;
	private JButton bFind, bagain, bAdd, bDel, bSort, bSave,bexit;
	private JTable table;
	private JPanel p0, p, p1, p2, p3, p4, p234, p5,p6;
	private JScrollPane talbles;
	private JScrollPane scroll;	
	private Object objects[][];
	private final String[] titles = new String[] { "Mã ", "tên sản phẩm", "nhà cung cấp", "so lượng", "đơn giá" };
	private QuanLiHangHoa a[] = new QuanLiHangHoa[30];
	private QuanLiHangHoa b[] = new QuanLiHangHoa[30];
	
public Gui() throws FileNotFoundException {
		
	// khung
		super();
		super.setTitle("Mini Mark Management");
		super.setSize(500, 700);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLayout(new GridLayout(6, 1));
		super.setVisible(true);
		
	
		// cac thung chua
		// tieu de
				p0=new JPanel(new FlowLayout(FlowLayout.CENTER));
				ltieude=new JLabel(" Quản Lí cửa hàng tạp hóa ");
				ltieude.setForeground(Color.GREEN);
				ltieude.setFont(new Font("",Font.BOLD,20));
				p0.add(ltieude);
				
		// 
				
				
				lma = new JLabel(" nhập mã :        ");
				txtma= new JTextField(10);
				p=new JPanel(new FlowLayout(FlowLayout.LEFT));
				p.add(lma);
				p.add(txtma);
		// ten
				
					lten=new JLabel("nhập tên :         ");
					txtten=new JTextField(15);
					bFind = new JButton("     Find");
					bagain = new JButton("     Back");
					p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
					p1.add(lten);
					p1.add(txtten);
					p1.add(bFind);
					p1.add(bagain);
					
		
		
					//so lượng
					p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
					lncc=new JLabel("nhập ncc :");
					txtncc=new JTextField(10);
					p2.add(lncc);
					p2.add(txtncc);
					
					
					//so lượng
								p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
								lsl=new JLabel("nhập số lượng:");
								txtsl=new JTextField(10);
								p3.add(lsl);
								p3.add(txtsl);
					//so lượng
					p4=new JPanel(new FlowLayout(FlowLayout.LEFT));
					ldongia=new JLabel("nhập dongia:");
					txtdongia=new JTextField(10);
					p4.add(ldongia);
					p4.add(txtdongia);
		// gọp 3 cái		
					p234 = new JPanel(new GridLayout(3, 1));
					p234.add(p2);
					p234.add(p3);
					p234.add(p4);
	
			// cac nut lenh
					p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));

					bAdd = new JButton("Add");
					bDel = new JButton("Delete");
					bSort = new JButton("Sort");
					bSave = new JButton("Save");
					bexit=new JButton("exit");
					p5.add(bAdd);
					p5.add(bDel);
					p5.add(bSort);
					p5.add(bSave);	
					p5.add(bexit);
				
					readFile();
					objects = arrayToObject();
					table = new JTable(objects, titles);
					scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					
					super.add(p0);
					super.add(p);
					super.add(p1);
				
					
					super.add(p234);
					super.add(p5);
					super.add(scroll,BorderLayout.CENTER);
					super.setVisible(true);
					
	
					txtma.requestFocus();
					
	 
					bAdd.addActionListener(this);
					bDel.addActionListener(this); 
					bSort.addActionListener(this);
					bSave.addActionListener(this);
					bagain.addActionListener(this);
					bFind.addActionListener(this);
					bexit.addActionListener(this);
	}
	
	
	
	
	public void readFile() throws FileNotFoundException {
		File f = new File("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\NguyenQuangHieu\\\\src\\\\hocthoi\\\\input.txt");
		Scanner kb = new Scanner(f);
		int i = 0;
		while (kb.hasNext()) {
			a[i] = new QuanLiHangHoa();
			a[i].setMahang(kb.next());
			String s = "", s1 = "";
			while (!kb.hasNextDouble()) //!kb.hasNextDouble() có nghĩa là nếu không 
												//phải số thì nó  tiếp tục làm ||còn là số thì nó dừng lại
				s = s + " " + kb.next();
			kb.next();
			while (!kb.hasNextDouble())
				s1 = s1 + " " + kb.next();
			a[i].setTenhang(s.trim());
			a[i].setNhacc(s1.trim());
			a[i].setSoluong(kb.nextDouble());
			a[i].setDongia(kb.nextDouble());
			i++;
		}
		n = i;
		kb.close();

	}
	
	/// mang 2 chieu
	////tạo ra 1 Object gồm 5 trường dùng để định nghĩa và lưu trư thông tin
	public Object[][] arrayToObject() {
		Object[][] objects = new Object[n][5];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				switch (j) {
				case 0:
					objects[i][j] = a[i].getMahang();
					break;
				case 1:
					objects[i][j] = a[i].getTenhang();
					break;
				case 2:
					objects[i][j] = a[i].getNhacc();
					break;
				case 3:
					objects[i][j] = a[i].getSoluong();
					break;
				default:
					objects[i][j] = a[i].getDongia();
					break;
				}
			}
		}
		return objects;
	}
	
	public QuanLiHangHoa[] objectToArray(Object objects[][]) {

		QuanLiHangHoa[] st = new QuanLiHangHoa[30];// khởi tạo class QuanLiHangHoa n=29
		int n = objects.length;
		this.n = n;
		for (int i = 0; i < n; i++) {
			st[i] = new QuanLiHangHoa();// khởi tạo từng phần tử class mới
			for (int j = 0; j < 5; j++) {
				switch (j) {
				case 0:
					st[i].setMahang(objects[i][j] + "");// truyền tham số vào cho class QuanLiHangHoa
					break;
				case 1:
					st[i].setTenhang(objects[i][j] + "");
					;
					break;
				case 2:
					st[i].setNhacc(objects[i][j] + "");
					break;
				case 3:
					st[i].setSoluong(Double.parseDouble(objects[i][j] + ""));
					break;
				default:
					st[i].setDongia(Double.parseDouble(objects[i][j] + ""));
					break;
				}
			}
		}
		return st;
	}
	
	public void ghivaofile(String s) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			File file = new File("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\NguyenQuangHieu\\\\src\\\\hocthoi\\\\input.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public void buttonDelete() throws FileNotFoundException {
		if (table.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Choose a student");
			return;
		}
		int x = table.getSelectedRow(), y = 0;
		if (i == 1) {
			a=objectToArray(objects);
			nb++;
			b[nb-1]= new QuanLiHangHoa();
			b[nb-1].setMahang(a[x].getMahang());
			b[nb-1].setTenhang(a[x].getTenhang());
			b[nb-1].setNhacc(a[x].getNhacc());
			b[nb-1].setSoluong(a[x].getSoluong());
			b[nb-1].setDongia(a[x].getDongia());
		}
		
		
		Object del[][] = new Object[n - 1][5];
		for (int i = 0; i < n; i++) {
			if (i == x) 
				continue;
			for (int j = 0; j < 5; j++)
				switch (j) {
				case 0:
					del[y][j] = objects[i][j];
					break;
				case 1:
					del[y][j] = objects[i][j];
					break;
				case 2:
					del[y][j] = objects[i][j];
					break;
				case 3:
					del[y][j] = objects[i][j];
					break;
				default:
					del[y][j] = objects[i][j];
					break;
				}
			y++;
		}
		this.remove(scroll);
		objects = del;
		a = objectToArray(del);
		table = new JTable(objects, titles);
		scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll, BorderLayout.CENTER);
		this.validate();
		txtma.setText("");
		if (i==0)
			txtten.setText("");
		txtncc.setText("");
		txtsl.setText("");
		txtdongia.setText("");
		txtma.requestFocus();
		JOptionPane.showMessageDialog(null, "Deleted");
	}
	
	public void buttonFind() throws FileNotFoundException {
		readFile();
		if (objects.length == 0 && i == 1)
			return;
		i = 1;
		int dem = 0;
		for (int i = 0; i < n; i++)
			if (a[i].getTenhang().equals(txtten.getText().trim()) || a[i].getTenhang().equals(txtten.getText().trim())
					)
				dem++;
		if (dem == 0) {
			JOptionPane.showMessageDialog(null, "No Result");
		} else {

			objects = new Object[dem][5];
			dem = 0;
			for (int i = 0; i < n; i++)
				if (a[i].getTenhang().equals(txtten.getText().trim()) || a[i].getTenhang().equals(txtten.getText().trim())
						) {
					for (int j = 0; j < 5; j++)
						switch (j) {
						case 0:
							objects[dem][j] = a[i].getMahang();
							break;
						case 1:
							objects[dem][j] = a[i].getTenhang();
							break;
						case 2:
							objects[dem][j] = a[i].getNhacc();
							break;
						case 3:
							objects[dem][j] = a[i].getSoluong();
							break;
						default:
							objects[dem][j] = a[i].getDongia();
							break;
						}
					dem++;
				}
		}
		this.remove(scroll);
		a = objectToArray(objects);
		table = new JTable(objects, titles);
		scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll, BorderLayout.CENTER);
		this.validate();
		// table.enable(false);
		txtma.setText("");
		txtncc.setText("");
		txtsl.setText("");
		txtdongia.setText("");
		txtten.requestFocus();

	}

	
	public void buttonSort() {
		a = objectToArray(objects);
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (a[i].getTenhang().equals(a[j].getTenhang())) {
					
					if (Double.parseDouble(a[i].getMahang()) >Double.parseDouble(a[j].getMahang())) {
						QuanLiHangHoa st1 = new QuanLiHangHoa();
						st1 = a[i];
						a[i] = a[j];
						a[j] = st1;
					}
				}
				if (a[i].getTenhang().compareToIgnoreCase(a[j].getTenhang()) == 1) {
					QuanLiHangHoa st = new QuanLiHangHoa();
					st = a[i];
					a[i] = a[j];
					a[j] = st;
				}
				
			}
		}

		objects = arrayToObject();
		this.remove(scroll);
		table = new JTable(objects, titles);
		scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll, BorderLayout.CENTER);
		this.validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bexit) 
		{
			System.exit(0);
		}
		else
			if(e.getSource()==bagain) 
		{
			////txtMa,txtTen,txtNhan,txtNhacc,txtSoLuong,txtDonGia,txtNgayNhap,txtNgayXuat,txtHanDung
			txtma.setText("");
			txtten.setText("");
			txtncc.setText("");
			txtsl.setText("");
			txtdongia.setText("");
		}
		if(e.getSource() == bDel){
			try {
				buttonDelete();
			} catch (Exception e2) {}
				
			
			
				if(e.getSource()== bSort) {
				try {
					buttonSort();
				}catch (Exception e3) {}//
			}
			
			if(e.getSource()== bFind) {
				try {
					buttonFind();
				}catch (Exception e4) {}
			}
	
		}
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		Gui h=new Gui();
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}