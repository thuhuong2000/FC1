package quan_ly_cua_hang_tap_hoa;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.*;

public class Management extends JFrame implements ActionListener, KeyListener, MouseListener {

	private JLabel lSub, lCode, lName, lM1, lM2, lM3;
	private JTextField txtCode, txtName, txtM1, txtM2, txtM3;
	private JButton bFind, bBack, bAdd, bDel, bSort, bSave;
	private JTable table;
	private JPanel p0, p, p1, p2, p3, p4, p234, p5;
	private JScrollPane scroll;
	private int n,nb=0,i = 0;
	private Object objects[][];
	private final String[] titles = new String[] { "ID", "Name Product", "ID Supplier", "ID Type", "Quanlity" };
	private Student a[] = new Student[30];
	private Student b[] = new Student[30];

	public Management() throws FileNotFoundException {
		setTitle("Mini Mark Management");
		this.setLayout(new GridLayout(6, 1));
		this.setSize(500, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//
		lSub = new JLabel("PROGRAM FOR MINI MARK MANAGEMENT");
		p0 = new JPanel(new FlowLayout());
		p0.add(lSub);
		//
		lCode = new JLabel("Product ID");
		txtCode = new JTextField(10);
		p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(lCode);
		p.add(txtCode);
		//
		lName = new JLabel("Product Name");
		txtName = new JTextField(20);
		bFind = new JButton("     Find");
		bBack = new JButton("     Back");
		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p1.add(lName);
		p1.add(txtName);
		p1.add(bFind);
		p1.add(bBack);
		//
		lM1 = new JLabel("Supplier");
		txtM1 = new JTextField(10);
		p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.add(lM1);
		p2.add(txtM1);
		//
		lM2 = new JLabel("Type");
		txtM2 = new JTextField(10);
		p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.add(lM2);
		p3.add(txtM2);
		//
		lM3 = new JLabel("Quanlity");
		txtM3 = new JTextField(10);
		p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p4.add(lM3);
		p4.add(txtM3);
		//
		p234 = new JPanel(new GridLayout(3, 1));
		p234.add(p2);
		p234.add(p3);
		p234.add(p4);
		//
		bAdd = new JButton("Add");
		bDel = new JButton("Delete");
		bSort = new JButton("Sort");
		bSave = new JButton("Save");
		p5 = new JPanel(new FlowLayout());
		p5.add(bAdd);
		p5.add(bDel);
		p5.add(bSort);
		p5.add(bSave);
		
		//
		readFile();
		objects = arrayToObject();
		table = new JTable(objects, titles);
		scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(p0);
		this.add(p);
		this.add(p1);
		this.add(p234);
		this.add(p5);
		this.add(scroll, BorderLayout.CENTER);
		this.validate();
/*
		bFind.addMouseListener(this);
		bFind.addKeyListener(this);
		txtCode.addKeyListener(this);
		txtCode.addMouseListener(this);
		txtName.addKeyListener(this);
		txtName.addMouseListener(this);
		txtM1.addMouseListener(this);
		txtM1.addKeyListener(this);
		txtM2.addMouseListener(this);
		txtM2.addKeyListener(this);
		txtM3.addMouseListener(this);
		txtM3.addKeyListener(this);
		bAdd.addMouseListener(this);
		bAdd.addKeyListener(this);
		bDel.addMouseListener(this);
		bDel.addKeyListener(this);
		bSort.addMouseListener(this);
		bSort.addKeyListener(this);
		bSave.addMouseListener(this);
		bSave.addKeyListener(this);
		bBack.addMouseListener(this);
		bBack.addKeyListener(this);
		table.addMouseListener(this);
		scroll.addMouseListener(this);*/
		
		txtCode.requestFocus();
	}

	public static void main(String[] agrs) throws FileNotFoundException {
		Management m = new Management();

	}

	public void readFile() throws FileNotFoundException {
		File f = new File("src/doan/product");
		Scanner kb = new Scanner(f);
		int i = 0;
		while (kb.hasNext()) {
			a[i] = new Student();
			a[i].setCode(kb.next());
			String s = "";
			while (!kb.hasNextDouble())
				s = s + " " + kb.next();
			a[i].setName(s.trim());
			a[i].setM1(kb.nextDouble());
			a[i].setM2(kb.nextDouble());
			a[i].setM3(kb.nextDouble());
			i++;
		}
		n = i;
		kb.close();

	}

	public Object[][] arrayToObject() {
		Object[][] objects = new Object[n][5];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				switch (j) {
				case 0:
					objects[i][j] = a[i].getCode();
					break;
				case 1:
					objects[i][j] = a[i].getName();
					break;
				case 2:
					objects[i][j] = a[i].getM1();
					break;
				case 3:
					objects[i][j] = a[i].getM2();
					break;
				default:
					objects[i][j] = a[i].getM3();
					break;
				}
			}
		}
		return objects;
	}

	public Student[] objectToArray(Object objects[][]) {

		Student[] st = new Student[30];
		int n = objects.length;
		this.n = n;
		for (int i = 0; i < n; i++) {
			st[i] = new Student();
			for (int j = 0; j < 5; j++) {
				switch (j) {
				case 0:
					st[i].setCode(objects[i][j] + "");
					break;
				case 1:
					st[i].setName(objects[i][j] + "");
					;
					break;
				case 2:
					st[i].setM1(Double.parseDouble(objects[i][j] + ""));
					break;
				case 3:
					st[i].setM2(Double.parseDouble(objects[i][j] + ""));
					break;
				default:
					st[i].setM3(Double.parseDouble(objects[i][j] + ""));
					break;
				}
			}
		}
		return st;
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		if (e.getSource() == txtName && e.getKeyCode() == KeyEvent.VK_RIGHT) {
			bFind.requestFocus();
			return;
		}
		if (bFind.hasFocus() && e.getKeyCode() == KeyEvent.VK_LEFT) {
			txtName.requestFocus();
			return;
		}
		if (bFind.hasFocus() && e.getKeyCode() == KeyEvent.VK_RIGHT) {
			bBack.requestFocus();
			return;
			
		}
		if (bBack.hasFocus() && e.getKeyCode() == KeyEvent.VK_RIGHT) {
			return;	
		}
		if (bBack.hasFocus() && e.getKeyCode() == KeyEvent.VK_DOWN) {
			txtM1.requestFocus();
			return;
		}
		if (bBack.hasFocus() && e.getKeyCode() == KeyEvent.VK_UP){
			txtCode.requestFocus();
			return;
		}
		if (bBack.hasFocus() && e.getKeyCode() == KeyEvent.VK_LEFT) {
			bFind.requestFocus();
			return;
		}
		if (e.getSource() == txtCode)
			keyCheck(e, txtCode, txtName);
		else if (e.getSource() == txtName)
			keyCheck(e);
		else if (e.getSource() == txtM1)
			keyCheck(e, txtM1, txtM2);
		else if (e.getSource() == txtM2)
			keyCheck(e, txtM2, txtM3);
		else if (e.getSource() == txtM3 && e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN
				|| e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Scanner kb = new Scanner(txtM3.getText());
			if (kb.hasNextDouble())
				bAdd.requestFocus();
			else {
				txtM3.setText("");
				JOptionPane.showMessageDialog(null, "Not Valaid");
				txtM3.requestFocus();
				kb.close();
				return;
			}
			kb.close();
		}

		upDownText(e, txtCode, txtName);
		upDownText(e, txtName, txtM1);
		upDownText(e, txtM1, txtM2);
		upDownText(e, txtM2, txtM3);

		if (e.getSource() == bAdd) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_UP) {
				txtM3.requestFocus();
			}
		}
		
		
		upDownButton(e, bAdd, bDel);
		upDownButton(e, bDel, bSort);
		upDownButton(e, bSort, bSave);

		if (e.getSource() == bAdd && e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			
				
			try {
				buttonAdd();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == bSave && e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			
			try {
				buttonSave();

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			return;
		}
		if (e.getSource() == bSort && e.getKeyCode() == KeyEvent.VK_ENTER) {
			buttonSort();
			return;
		}
		if (e.getSource() == bBack && e.getKeyCode() == KeyEvent.VK_ENTER) {
			try {
				buttonBack();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getComponent() == bFind  && e.getKeyCode() == KeyEvent.VK_ENTER) {
			try {
				buttonFind();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		}
		if (e.getComponent() == bBack  && e.getKeyCode() == KeyEvent.VK_ENTER) {
			try {
				buttonBack();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			return;
		}
		if (e.getSource() == bDel  && e.getKeyCode() == KeyEvent.VK_ENTER)  {
			try {
				buttonDelete();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				
			}
			return;
		}
	}

	public void buttonAdd() throws FileNotFoundException {
		if (i==1){
			JOptionPane.showMessageDialog(null, "can not add in this function");
			return;
		}
		/*Scanner kb = new Scanner(txtCode.getText());
		if (!kb.hasNextDouble()|| kb.nextDouble()<0){
			
		
			txtCode.setText("");
			JOptionPane.showMessageDialog(null, "Type of data isn't Valaid");
			txtCode.requestFocus();
			kb.close();
			return;
		}
		kb.close();
		*/
		for (int i=0;i<txtCode.getText().length();i++)
			if (txtCode.getText().charAt(i)==' '|| txtCode.getText().charAt(i)<'0'|| txtCode.getText().charAt(i)>'9'){
				txtCode.requestFocus();
				txtCode.setText("");
				JOptionPane.showMessageDialog(null, "Type of data isnot valid ");
				return;
			}
		for (int i = 0; i < n; i++)
			if (a[i].getCode().equals(txtCode.getText())) {
				JOptionPane.showMessageDialog(null, "Code student cann't be alike");
				txtCode.requestFocus();
				return;
			}
		for (int i=0;i<txtName.getText().length();i++)
			if ((txtName.getText().charAt(i)>='a'&& txtName.getText().charAt(i)<='z')||txtName.getText().charAt(i)==' '||(txtName.getText().charAt(i)>='A'&&txtName.getText().charAt(i)<='Z' ))
					continue;
			else {
					JOptionPane.showMessageDialog(null, "type of data is not valid");
					txtName.setText("");
					txtName.requestFocus();
					return;
				}
		a[n] = new Student();
		a[n].setCode(txtCode.getText());
		Scanner kb1= new Scanner(txtName.getText());
		
		a[n].setName(txtName.getText());
		if (Double.parseDouble(txtM1.getText()) >10||Double.parseDouble(txtM1.getText())<0){
			JOptionPane.showMessageDialog(null, "mark isn't valid");
			txtM1.setText("");
			txtM1.requestFocus();
			return;
		}
		a[n].setM1(Double.parseDouble(txtM1.getText()));
		if (Double.parseDouble(txtM2.getText()) >10||Double.parseDouble(txtM2.getText())<0){
			JOptionPane.showMessageDialog(null, "mark isn't valid");
			txtM2.setText("");
			txtM2.requestFocus();
			return;
		}
		a[n].setM2(Double.parseDouble(txtM2.getText()));
		for (int i=0;i<txtM3.getText().length();i++)
			if (txtM3.getText().charAt(i)<'0'||txtM3.getText().charAt(i)>'9'){
				JOptionPane.showMessageDialog(null, "mark is not valid");
				txtM3.setText("");
				txtM3.requestFocus();
				return;
			}
		if (Double.parseDouble(txtM3.getText()) >10||Double.parseDouble(txtM3.getText())<0){
			JOptionPane.showMessageDialog(null, "mark isn't valid");
			txtM3.setText("");
			txtM3.requestFocus();
			return;
		}
		a[n].setM3(Double.parseDouble(txtM3.getText()));
		n++;
		objects = arrayToObject();
		this.remove(scroll);
		table = new JTable(objects, titles);
		scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll, BorderLayout.CENTER);
		this.validate();
	}

	

	public void buttonSort() {
		a = objectToArray(objects);
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (a[i].name().equals(a[j].name())) {
					
					if (Double.parseDouble(a[i].getCode()) >Double.parseDouble(a[j].getCode())) {
						Student st1 = new Student();
						st1 = a[i];
						a[i] = a[j];
						a[j] = st1;
					}
				}
				if (a[i].name().compareToIgnoreCase(a[j].name()) == 1) {
					Student st = new Student();
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

	public void buttonFind() throws FileNotFoundException {
		readFile();
		if (objects.length==0 && i==1)
			return;
		i=1;
		int dem = 0;
		for (int i = 0; i < n; i++)
			if (a[i].getName().equals(txtName.getText().trim())|| a[i].name().equals(txtName.getText().trim())||a[i].ho().equals(txtName.getText().trim()))
				dem++;
		if (dem == 0){
			JOptionPane.showMessageDialog(null, "No Result");
		}
		else {
			
			objects = new Object[dem][5];
			dem = 0;
			for (int i = 0; i < n; i++)
				if (a[i].getName().equals(txtName.getText().trim())|| a[i].name().equals(txtName.getText().trim())||a[i].ho().equals(txtName.getText().trim())) {
					for (int j = 0; j < 5; j++)
						switch (j) {
						case 0:
							objects[dem][j] = a[i].getCode();
							break;
						case 1:
							objects[dem][j] = a[i].getName();
							break;
						case 2:
							objects[dem][j] = a[i].getM1();
							break;
						case 3:
							objects[dem][j] = a[i].getM2();
							break;
						default:
							objects[dem][j] = a[i].getM3();
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
		//table.enable(false);
		txtCode.setText("");
		txtM1.setText("");
		txtM2.setText("");
		txtM3.setText("");
		txtName.requestFocus();
		
	}

	public void buttonBack() throws FileNotFoundException {
		if (i==1){
			nb=0;
		}
		readFile();
		this.remove(scroll);
		objects = arrayToObject();
		table = new JTable(objects, titles);
		scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll, BorderLayout.CENTER);
		this.validate();
		txtCode.setText("");
		txtName.setText("");
		txtM1.setText("");
		txtM2.setText("");
		txtM3.setText("");
		txtCode.requestFocus();
		i = 0;
	}
	public void buttonSave() throws FileNotFoundException {
		if (i == 1) {
			JOptionPane.showMessageDialog(null, "Saved");
			readFile();	
			File f = new File("student");
			PrintStream writeFile = new PrintStream(f);
			for (int i=0;i<n;i++){
				int j;
				for (j=0;j<nb;j++)
					if (a[i].getCode().equals(b[j].getCode()))
						break;
				if (j==nb){
					writeFile.append(a[i].getCode() + " ");
					writeFile.append(a[i].getName() + " ");
					writeFile.append(a[i].getM1() + " ");
					writeFile.append(a[i].getM2() + " ");
					writeFile.append(a[i].getM3() + "");
					writeFile.append("\n");
				}
			}
			writeFile.close();
			readFile();
			buttonFind();
			nb=0;
			return;
		
		}
		JOptionPane.showMessageDialog(null, "Saved");
		File f = new File("student");
		PrintStream writeFile = new PrintStream(f);
		a = objectToArray(objects);
		for (int i = 0; i < n; i++) {
			writeFile.append(a[i].getCode() + " ");
			writeFile.append(a[i].getName() + " ");
			writeFile.append(a[i].getM1() + " ");
			writeFile.append(a[i].getM2() + " ");
			writeFile.append(a[i].getM3() + "");
			writeFile.append("\n");
		}
		writeFile.close();
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
			b[nb-1]= new Student();
			b[nb-1].setCode(a[x].getCode());
			b[nb-1].setName(a[x].getName());
			b[nb-1].setM1(a[x].getM1());
			b[nb-1].setM2(a[x].getM2());
			b[nb-1].setM3(a[x].getM3());
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
		txtCode.setText("");
		if (i==0)
			txtName.setText("");
		txtM1.setText("");
		txtM2.setText("");
		txtM3.setText("");
		txtCode.requestFocus();
		JOptionPane.showMessageDialog(null, "Deleted");
	}

	public void upDownText(KeyEvent e, JTextField t1, JTextField t2) {
		if (e.getSource() == t2)
			if (e.getKeyCode() == KeyEvent.VK_UP)
				t1.requestFocus();
	}

	public void upDownButton(KeyEvent e, JButton b1, JButton b2) {
		if (e.getSource() == b1)
			if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_DOWN)
				b2.requestFocus();
		if (e.getSource() == b2)
			if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_UP)
				b1.requestFocus();
	}

	public void keyCheck(KeyEvent e, JTextField t1, JTextField t2) {
		if (e.getSource() == t1 && e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
			Scanner kb = new Scanner(t1.getText());
			if (kb.hasNextDouble())
				t2.requestFocus();
			else {
				t1.setText("");
				JOptionPane.showMessageDialog(null, "Type of data isn't Valaid");
				t1.requestFocus();
				kb.close();
				return;
			}
			kb.close();
		}
	}

	public void keyCheck(KeyEvent e) {
		if (e.getSource() == txtName && e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN) {
			Scanner kb = new Scanner(txtName.getText());
			boolean x = true;
			while (kb.hasNext()) {
				if (kb.hasNextDouble())
					x = false;
				kb.next();
			}
			kb.close();

			Scanner kb1 = new Scanner(txtName.getText());
			if (kb1.hasNext() && x)
				txtM1.requestFocus();
			else {
				JOptionPane.showMessageDialog(null, "String fail");
				txtName.setText("");
				txtName.requestFocus();
				kb1.close();
				return;
			}
			kb1.close();
		}
	}

	public void keyReleased(KeyEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
	}

	public void mouseClicked(MouseEvent e) {

		/*try{
			txtCode.setText(a[table.getSelectedRow()].getCode());
			txtName.setText(a[table.getSelectedRow()].getName());
			txtM1.setText(a[table.getSelectedRow()].getM1() + "");
			txtM2.setText(a[table.getSelectedRow()].getM2() + "");
			txtM3.setText(a[table.getSelectedRow()].getM3() + "");
			txtCode.requestFocus();
		}
		catch(ArrayIndexOutOfBoundsException k){
		}*/
		
		if (table.hasFocus())
			return;
		if (e.getSource() == bSort) {
			buttonSort();
			bSort.requestFocus();
			return;
		}
		if (e.getComponent() == bFind) {
			try {
				buttonFind();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			bFind.requestFocus();
			return;
		}
		if (e.getComponent() == bBack) {
			try {
				buttonBack();
				//bBack.requestFocus();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			return;
		}
		if (e.getSource() == bDel) {
			if (table.getSelectedRow() == -1) {
				JOptionPane.showMessageDialog(null, "Choose a student");
				return;
			}
			try {
				buttonDelete();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				
			}
			bDel.requestFocus();
			return;
		}
		if (e.getSource() == bSave) {
			try {
				buttonSave();
				bSave.requestFocus();
				return;
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
				return;
			}
		}
		if (txtCode.hasFocus() && e.getComponent() == txtCode)
			return;
		if (txtName.hasFocus() && e.getComponent() == txtName)
			return;
		else if (txtCode.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "String empty");
			txtCode.requestFocus();
			return;
		}
		
		else if (txtName.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "String empty");
			txtName.requestFocus();
			return;
		}
		
		mouseCheck(e);
		if (txtM1.isRequestFocusEnabled() && e.getComponent() == txtM1)
			return;
		else if (txtM1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "String empty");
			txtM1.requestFocus();
			return;
		}
		mouseCheck(e, txtCode, txtName);
		
		mouseCheck(e, txtM1, txtM2);
		if (txtM2.isRequestFocusEnabled() && e.getComponent() == txtM2)
			return;
		else if (txtM2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "String empty");
			txtM2.requestFocus();
			return;
		}
		mouseCheck(e, txtM2, txtM3);
		if (txtM3.isRequestFocusEnabled() && e.getComponent() == txtM3)
			return;
		else if (txtM3.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "String empty");
			txtM3.requestFocus();
			return;
		}

		if (e.getSource() == bAdd) {
			
			try {
				buttonAdd();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseCheck(MouseEvent e, JTextField t1, JTextField t2) {
		Scanner kb= new Scanner(t1.getText());
		if (e.getComponent() == t2)
			if (kb.hasNextDouble()) {
				t2.requestFocus();
			} else {
				t1.setText("");
				JOptionPane.showMessageDialog(null, "type of data isn't valid");
				t1.requestFocus();
			}
		
		kb.close();
	}

	public void mouseCheck(MouseEvent e) {
		if (e.getSource() == txtM1) {
			Scanner kb = new Scanner(txtName.getText());
			boolean x = true;
			while (kb.hasNext()) {
				if (kb.hasNextDouble())
					x = false;
				kb.next();
			}
			kb.close();
			Scanner kb1 = new Scanner(txtName.getText());
			if (kb1.hasNext() && x)
				txtM1.requestFocus();
			else {
				JOptionPane.showMessageDialog(null, "String fail");
				txtName.setText("");
				txtName.requestFocus();
				kb1.close();
				return;
			}
			kb1.close();
		}
	}
	

}
