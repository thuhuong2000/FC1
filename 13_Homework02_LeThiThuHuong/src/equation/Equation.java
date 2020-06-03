package equation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Equation extends JFrame implements ItemListener,ActionListener,KeyListener
{
	private JLabel lbA,lbB,lbC,lbResult;
	private JTextField txtA,txtB,txtC,txtResult;
	private JButton btnSolve,btnReset,btnExit;
	private JPanel pA,pB,pC,pResult,pBtn;
	private JRadioButton rdbLE,rdbSE;
	private int t;
	
	public Equation() {
		//1.Set for Frame (Thiet lap cho frame)
		super("Solve the equation");
		super.setSize(400,500);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new GridLayout(7,1));
		
		//2.Tao cac panel chua cac Components
		pA=new JPanel();
		lbA=new JLabel("Enter a");
		txtA=new JTextField(10);
		pA.add(lbA);
		pA.add(txtA);
		
		pB=new JPanel();
		lbB=new JLabel("Enter b");
		txtB=new JTextField(10);
		pB.add(lbB);
		pB.add(txtB);
		
		pC=new JPanel();
		lbC=new JLabel("Enter c");
		txtC=new JTextField(10);
		pC.add(lbC);
		pC.add(txtC);
		
		pResult=new JPanel();
		lbResult=new JLabel("Result");
		txtResult=new JTextField(20);
		txtResult.setEnabled(false);
		pResult.add(lbResult);
		pResult.add(txtResult);
		
		pBtn=new JPanel();
		rdbLE=new JRadioButton("Linear Equation");
		rdbSE=new JRadioButton("Square Equation");
		btnSolve=new JButton("Solve");
		btnReset=new JButton("Reset");
		btnExit=new JButton("Exit");
		pBtn.add(btnSolve);
		pBtn.add(btnReset);
		pBtn.add(btnExit);
		
		//3.them cac components vao JFrame
		
		super.add(rdbLE);
		super.add(rdbSE);
		super.add(pA);
		super.add(pB);
		super.add(pC);
		super.add(pResult);
		super.add(pBtn);
		
		//4.Dang ky su kien
		rdbLE.addItemListener(this); 
		rdbSE.addItemListener(this);
		btnSolve.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		btnSolve.addKeyListener(this);
		txtA.addKeyListener(this);
		txtB.addKeyListener(this);
		txtC.addKeyListener(this);
		txtResult.addKeyListener(this);
		
		super.validate();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItemSelectable()==rdbLE) {
			t=1;
			pA.setVisible(false);
		}
		else if(e.getItemSelectable()==rdbSE) {
			t=2;
			pA.setVisible(true);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSolve && t==1) {
			double b=Double.parseDouble(txtB.getText());
			double c=Double.parseDouble(txtC.getText());
			if(b == 0) 
				if(c==0) 
					txtResult.setText("Unlimited roots");
				else 
					txtResult.setText("no root");
			else {
				txtResult.setText(" x = "+ (-c/b));
			}
		}
		else if(e.getSource()==btnSolve && t==2) {
			double a=Double.parseDouble(txtA.getText());
			double b=Double.parseDouble(txtB.getText());
			double c=Double.parseDouble(txtC.getText());
			if((b*b-4*a*c) < 0)
				txtResult.setText("Unlimited roots");
				else if((b*b-4*a*c) == 0)
					txtResult.setText(" x = "+ (-b/2*a));
					else 
					{
						txtResult.setText("x1 = "+ (-b+Math.sqrt(b*b-4*a*c))/2*a 
										+"x2 = "+ (-b-Math.sqrt(b*b-4*a*c))/2*a);
					}
		}
		if(e.getSource()==btnReset) {
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtResult.setText("");
		}
		else if(e.getSource()==btnExit)
			System.exit(0);
		
	}
	public static void main(String[] args) {
		Equation equa=new Equation();

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtA)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtB.requestFocus();
			}
		if(e.getSource()==txtB)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtC.requestFocus();
			}
		if(e.getSource()==txtC)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				btnSolve.requestFocus();
			}
		if(e.getSource()==btnSolve)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				if(e.getSource()==btnSolve && t==1) {
					double b=Double.parseDouble(txtB.getText());
					double c=Double.parseDouble(txtC.getText());
					if(b == 0) 
						if(c==0) 
							txtResult.setText("Unlimited roots");
						else 
							txtResult.setText("no root");
					else {
						txtResult.setText(" x = "+ (-c/b));
					}
				}
				else if(e.getSource()==btnSolve && t==2) {
					double a=Double.parseDouble(txtA.getText());
					double b=Double.parseDouble(txtB.getText());
					double c=Double.parseDouble(txtC.getText());
					if((b*b-4*a*c) < 0)
						txtResult.setText("Unlimited roots");
						else if((b*b-4*a*c) == 0)
							txtResult.setText(" x = "+ (-b/2*a));
							else 
							{
								txtResult.setText("x1 = "+ (-b+Math.sqrt(b*b-4*a*c))/2*a +"\n"
												+"x2 = "+ (-b-Math.sqrt(b*b-4*a*c))/2*a);
							}
				}
				
			}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
}
