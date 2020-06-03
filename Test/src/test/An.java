package manage_library;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import manage_library.Person;


public class guiManageLibrary extends JFrame implements ActionListener,KeyListener {
	private ArrayList<Person> list;
    DefaultTableModel model;

    public guiManageLibrary() {
        initguiManageLibrary();
        this.setLocationRelativeTo(null);
        list = new ArrayList<>();
        model = (DefaultTableModel) jTable1.getModel();
    }
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbName,lbID, lbDate, lbGender, lbTypeBook,lbNameBook,lbAuthorBook,lbNumberBook;
	private JComboBox cbbBook;
	private JTextField txtName,txtID, txtdob,txtNameBook,txtAuthorBook,txtNumberBook;
	private JButton btnUpdate,btnNew,btnExit;
	private JRadioButton Male, FeMale;
	private JPanel pName,pID,pDate,pGender,pBook, pButton,pTable;
	private JTable jTable1;
	private JScrollPane JScrollPane;
	Font font = new Font("Tahoma", Font.BOLD,20);
	@SuppressWarnings("unchecked")
	public void initguiManageLibrary() {
		//setting for Frame
		super.setSize(800,900);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new GridLayout(8,4));
		
		//created components
		pName = new JPanel();
		lbName = new JLabel("Name : ");
		txtName = new JTextField(10);
		pName.add(lbName);
		pName.add(txtName);
		
		pID = new JPanel();
		lbID = new JLabel("ID : ");
		txtID = new JTextField(10);
		pID.add(lbID);
		pID.add(txtID);
		
		pDate = new JPanel();
		lbDate = new JLabel("Date Lend : ");
		txtdob = new JTextField(10);
		pDate.add(lbDate);
		pDate.add(txtdob);
		
		pGender = new JPanel();
		lbGender = new JLabel("Gender :" );
		Male = new JRadioButton("Male");
		FeMale = new JRadioButton("Female");

		pGender.add(lbGender);
		pGender.add(Male);
		pGender.add(FeMale);
		

		
		pBook = new JPanel();
		lbTypeBook = new JLabel("Type Book : ");
		String book [] = {"Book Science", "Book Math", "Book Knowlege"};
		cbbBook = new JComboBox(book);
		lbNameBook = new JLabel("Name Book : ");
		txtNameBook = new JTextField(10);
		lbNumberBook = new JLabel("Number Book");
		txtNumberBook = new JTextField(10);
		lbAuthorBook = new JLabel("Author");
		txtAuthorBook = new JTextField(10);
		pBook.add(lbTypeBook);
		pBook.add(cbbBook);
		pBook.add(lbNameBook);
		pBook.add(txtNameBook);
		pBook.add(lbNumberBook);
		pBook.add(txtNumberBook);
		pBook.add(lbAuthorBook);
		pBook.add(txtAuthorBook);
		
		pButton = new JPanel();
		btnUpdate = new JButton();
		btnUpdate.setOpaque(true);
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
		btnNew = new JButton("New");
		btnNew.setOpaque(true);
		btnExit = new JButton("Exit");
		btnExit.setOpaque(true);
		pButton.add(btnUpdate);
		pButton.add(btnNew);
		pButton.add(btnExit);
		
		pTable = new JPanel();
        jTable1 =new JTable();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "STT", "Name", "ID", "Date Lend Book", "Address","Type Book", "Number Book", "Name Book", "Author"
                }
            ));
//		pTable jTable1=new pTable(data,column); 
        JScrollPane= new JScrollPane(jTable1);
        pTable.add(jTable1);
        pTable.add(JScrollPane);
        
	
		
		//ADD COMPONENTS IN FRAME
		super.add(pName);
		super.add(pID);
		super.add(pDate);
		super.add(pGender);
		super.add(pBook);
		super.add(pButton);
		super.add(pTable);
		
		//Event
		btnUpdate.addActionListener(this);
		btnNew.addActionListener(this);
		btnExit.addActionListener(this);
		txtName.addKeyListener(this);
		txtID.addKeyListener(this);
		txtdob.addKeyListener(this);
		Male.addKeyListener(this);
		FeMale.addKeyListener(this);
		
		
		super.validate();
		
	}
	public static void main(String[] args) {
		guiManageLibrary gML = new guiManageLibrary();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	 private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	        Person s = new Person();
	        s.setID(txtID.getText());
	        s.setFullName(txtName.getText());
	        s.setTypeBook(cbbBook.getSelectedItem());
	        s.setNumberBook(txtNumberBook.getText());
	        s.setNameBook(txtNameBook.getText());
	        s.setAuthorBook(txtAuthorBook.getText());
	        try {
	            s.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(txtdob.getText()));
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	        }
	        list.add(s); // them vao danh sach
	        showResult();
	    }
	 int i = 1;
	    public void showResult(){
	        Person s = list.get(list.size()-1);
	        model.addRow(new Object[]{
	            i++,  s.getFullName(),s.getID(), s.getDob(),s.getGender(),s.getTypeBook(),s.getNumberBook(),s.getNameBook(),s.getAuthorBook()
	        });
	    }

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtName)
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				txtID.requestFocus();
			}
		if(e.getSource()==txtID)
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				txtdob.requestFocus();
			}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNew) {
				txtName.setText("");
				txtID.setText("");
				txtdob.setText("");
				txtNameBook.setText("");
				txtAuthorBook.setText("");
				txtNumberBook.setText("");
		}
		else
			if(e.getSource()==btnExit)
				System.exit(0);
	}
}