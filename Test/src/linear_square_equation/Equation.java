package linear_square_equation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Equation extends JFrame implements ActionListener,KeyListener,ItemListener
{
	private int t;
	private double x1,x2,d;
	private JLabel lbA,lbB,lbC,lbT,lbResult;
	private JTextField txtA,txtB,txtC;
	JTextArea txtResult;
	private JButton btnSolve,btnReset,btnExit;
	private JPanel pA,pB,pC,pResult,pBtn,pLbResult;
	private JRadioButton rL,rS;
	public  Equation() 
	{
		
		//1. thiet lap cho Frame
		super("Equation");
		super.setSize(300,400);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(new GridLayout(9,1));
		
		lbT= new JLabel();
		lbT.setText("LinearEquation and SquareEquation");
		lbT.setForeground(Color.BLUE);
		lbT.setFont(new Font("",Font.BOLD,15));
		this.getContentPane().add(lbT);
	
		
		ButtonGroup group = new ButtonGroup();
		
		
		
		//2.tao cac panels components
		pLbResult = new JPanel();
		
		pA = new JPanel();
		//pA.setLayout(new FlowLayout()); //default layout cua JPanel la FlowLayout
		lbA= new JLabel("Enter a");
		txtA= new JTextField(10);
		pA.add(lbA);
		pA.add(txtA);
				
		pB = new JPanel();
		lbB= new JLabel("Enter b");
		txtB= new JTextField(10);
		pB.add(lbB);
		pB.add(txtB);
		
		pC= new JPanel();
		lbC= new JLabel("Enter c");
		txtC= new JTextField(10);
		pC.add(lbC);
		pC.add(txtC);
				
		pResult = new JPanel();
		lbResult= new JLabel("Result");
		txtResult= new JTextArea(10,15);
		txtResult.setEnabled(false);
		pResult.add(txtResult);
				
		pBtn= new JPanel();
		rL=new JRadioButton("LinearEquation");
		rS=new JRadioButton("SquareEquation");
		
		btnSolve= new JButton("Solve");
		btnSolve.setBackground(Color.BLUE);
		btnReset= new JButton("Reset");
		btnExit= new JButton("Exit");
		pBtn.add(btnSolve);
		pBtn.add(btnReset);
		pBtn.add(btnExit);
		group.add(rL);
		group.add(rS);
		pLbResult.add(lbResult);

		//3.them cac components vao Frame
		super.add(rL);
		super.add(rS);
		super.add(pA);
		super.add(pB);
		super.add(pC);
		super.add(pLbResult);
		super.add(pResult);
		super.add(pBtn);
		
		//4. dang ki su kien 
		rL.addItemListener(this);
		rS.addItemListener(this);
		btnSolve.addActionListener(this);
		btnSolve.addKeyListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
				
		txtA.addKeyListener(this);
		txtB.addKeyListener(this);
		txtC.addKeyListener(this);
		btnSolve.addKeyListener(this);
		btnReset.addKeyListener(this);
		btnExit.addKeyListener(this);
	
	
		super.setVisible(true);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		
		if(e.getItemSelectable()==rL) {
			t=1;
			pA.setVisible(false);
		}
		else 
		{
			t=2;
			pA.setVisible(true);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnExit) 
		{
			System.exit(0);
		}
		if(e.getSource()==btnReset) 
		{
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtResult.setText("");
		}
		if(e.getSource()==btnSolve && t==1) 
		{
			double b=Double.parseDouble(txtB.getText());
			double c=Double.parseDouble(txtC.getText());
			if(b == 0) 
				{
					txtResult.setText("Unlimited roots");
				}
			else 
			{
				double x= (-c/b);
				txtResult.setText(" x = "+ x+"");
			}
		}
		if(e.getSource()==btnSolve && t==2) 
		{
			double a=Double.parseDouble(txtA.getText());
			double b=Double.parseDouble(txtB.getText());
			double c=Double.parseDouble(txtC.getText());
			if(a==0) {
				x1=((-c)/b);
				txtResult.setText("x = "+ x1+" ");
			}
			else 
			{
				d= (b*b)-(4*a*c);
				if (d<0)
					txtResult.setText("Unlimited roots");
				else 
				{
					if(d == 0) 
					{
						x2=(-b)/2*a;
						txtResult.setText(" x = "+ x2 + " ");
					}
					else 
					{
						x1=(-b+Math.sqrt(d)/(2*a));
						x2=(-b-Math.sqrt(d)/(2*a));
						txtResult.setText("x1 = "+ x1+ " " +"\n"
										+"x2 = "+ x2+" ");
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Equation tu = new Equation();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getSource() == txtA) 
			if(e.getKeyCode()== KeyEvent.VK_ENTER) {
				txtB.requestFocus();
		}
		if(e.getSource() == txtB) 
			if(e.getKeyCode()== KeyEvent.VK_ENTER) {
				txtC.requestFocus();
		}
		if(e.getSource() == txtC) 
			if(e.getKeyCode()== KeyEvent.VK_ENTER) {
				btnSolve.requestFocus();
		}
		if(e.getSource() == btnSolve) 
			if(e.getKeyCode()== KeyEvent.VK_ENTER) 
			{
				if(e.getSource()==btnSolve && t==1) 
				{
					double b=Double.parseDouble(txtB.getText());
					double c=Double.parseDouble(txtC.getText());
					if(b == 0) 
						{
							txtResult.setText("Unlimited roots");
						}
					else {
						double x= (-c/b);
						txtResult.setText(" x = "+ x+"");
					}
				}
				if(e.getSource()==btnSolve && t==2) 
				{
					double a=Double.parseDouble(txtA.getText());
					double b=Double.parseDouble(txtB.getText());
					double c=Double.parseDouble(txtC.getText());
					if(a==0) {
						x1=((-c)/b);
						txtResult.setText("x = "+ x1+" ");
					}
					else 
					{
						d= (b*b)-(4*a*c);
						if (d<0)
							txtResult.setText("Unlimited roots");
						else 
						{
							if(d == 0) 
							{
								x2=(-b)/2*a;
								txtResult.setText(" x = "+ x2 + " ");
							}
							else 
							{
								x1=(-b+Math.sqrt(d)/(2*a));
								x2=(-b-Math.sqrt(d)/(2*a));
								txtResult.setText("x1 = "+ x1+ " " +"\n"
												+"x2 = "+ x2+" ");
							}
						}
					}
				}
			}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}


}