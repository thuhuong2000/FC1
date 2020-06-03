package swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
public class MyGrildLayout extends JFrame
{
	private JButton b1,b2,b3,b4,b5;
	public MyGrildLayout() {
		//doan lenh 1:cai dat cho container
		super();
		super.setTitle("Welcome to Java");
		super.setSize(400,200);
		super.setLocationRelativeTo(null);//JFrame nam giua mang hinh
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close program
		super.setVisible(true);
		//thiet lap Layout cho Frame
		super.setLayout(new GridLayout(2,3));
		
		//doan lenh 2:thiet lap cac components
		b1=new JButton("I'm a button 1");
		b2=new JButton("Click me 2");
		b3=new JButton("Hi! button 3 it's me");
		b4=new JButton("button 4");
		b5=new JButton("5");
		
		//doan lenh 3:dua cac components vao container
		super.add(b1);
		super.add(b2);
		super.add(b3);
		super.add(b4);
		super.add(b5);
		
	}

	public static void main(String[] args) {
		MyGrildLayout huong=new MyGrildLayout();

	}

}
