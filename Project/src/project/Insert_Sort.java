package project;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.util.*;
import java.util.Queue;

public class Insert_Sort extends JFrame {
	private JButton randomBtn;
	private JButton CreateBtn;
	private JButton SortBtn;
	private JButton searchBtn;
	private JLabel List;
	private JLabel Number[];
	private JLabel value;
	private JTextField userText, valueText;
	private Col ArrCol[];//mang col
	private JPanel ArrofCol[];//mang cua col
	private int listOfNumber[],n = 0;// ds number doc tu input
	private Queue<Integer> step = new LinkedList<Integer>();
	private Timer timer1, timer2;
	private Queue<Integer> stepBinary = new LinkedList<Integer>();
	private int posBinarySearch;//vị trí tìm kiếm của cây nhị phân
	
	public Insert_Sort()
	{
		super.setLocationRelativeTo(null);
		super.setBounds(0,0,900,700);
		super.setTitle("Insert-Sort ");
		super.setLocationRelativeTo(null);
		super.getContentPane().setBackground(Color.CYAN);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(null);
		randomBtn = new JButton("Random");
		randomBtn.setBounds(30,50,100,25);
		randomBtn.setBackground(Color.YELLOW);
		randomBtn.addActionListener(new randomBtnButton());
		
		List = new JLabel("Enter Listnumber");
        List.setBounds(30,120,100,45);
        List.setForeground(Color.RED);
        
        value = new JLabel("Enter Value");
        value.setBounds(500,40,100,45);
        value.setForeground(Color.RED);
    
        
        userText = new JTextField(20);
        userText.setBounds(150,130,200,25);
        
        valueText = new JTextField(10);
        valueText.setBounds(580,50,50,25);
//        valueText.addActionListener(new createBinarySearch());
        
        CreateBtn= new JButton("Create");
        CreateBtn.setBounds(150,50,100,25);
        CreateBtn.setBackground(Color.pink);
        CreateBtn.addActionListener(new createBtnButton());
        
        SortBtn= new JButton("Sort");
        SortBtn.setBounds(270,50,100,25);
        SortBtn.setBackground(Color.green);
        SortBtn.addActionListener(new sortBtnButton());
        
        searchBtn = new JButton("Search");
        searchBtn.setBounds(650,50,100,25);
        searchBtn.setBackground(Color.RED);
        searchBtn.addActionListener(new searchBtnButton());
        
        timer1 = new Timer(300,new AnimationListener1());
        timer2 = new Timer(500,new AnimationListener2());
        
        super.add(randomBtn);
        super.add(List);
        super.add(userText);
        super.add(CreateBtn);
        super.add(SortBtn);
        super.add(value);
        super.add(valueText);
        super.add(searchBtn);
        super.setVisible(true);
	
	}
	public void create() {
		
		//xoa cot cu
		refreshCol();
		String list[] = userText.getText().split(",");
		n = list.length;
		listOfNumber = new int[n];
		ArrofCol = new JPanel[n];//giao dien cot
		ArrCol = new Col[n];//class
		Number =new JLabel[n];
		revalidate();//ham de tao cotko can phai mo rong man hinh
        repaint();//ham de tao cotko can phai mo rong man hinh
        //luu du lieu tu input vao cot va listOfNumber
		for(int i = 0 ; i < list.length ; i++) {
			listOfNumber[i] = Integer.parseInt(list[i]);
			ArrCol[i] = new Col(listOfNumber[i]);
			ArrofCol[i] = new JPanel();
			ArrofCol[i].setBounds(100+i*20*2,600-(ArrCol[i].Tall()),20,ArrCol[i].Tall());
			super.add(ArrofCol[i]);
			
			Number[i] = new JLabel(""+listOfNumber[i]);
			
			Number[i].setBounds(100+i*20*2,600,20,20);
			super.add(Number[i]);
		}
		
		insertionSort();
	}
	public void refreshCol() {
		for(int i = 0 ; i < n ; i++)
		{
			super.remove(ArrofCol[i]);
			super.remove(Number[i]);
		}
			
	}
	private class randomBtnButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Random rand = new Random();
			String Random="";
			
			for(int i=0;i<10;i++)
			{	
				Random+=rand.nextInt(50)+",";
			}
			userText.setText(Random);
//			create();
		}
	}
	private class createBtnButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			create();

		}
	}
	private class AnimationListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
        	run();
        	
        }
    }
	private class sortBtnButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			timer1.start();
		}
	}
//	private class createBinarySearch implements ActionListener
//	{
//		@Override
//		public void actionPerformed(ActionEvent e)
//		{	
//			//posBinarySearch = binarySearch(0,n-1,Integer.parseInt(valueText.getText()));
//			posBinarySearch = binarySearch();
//			System.out.println(posBinarySearch);
//		}
//	}
	
	public void run() {
		if(!step.isEmpty())
    	{
    		int n = step.poll();
        	int m = step.poll();
        	revalidate();
            repaint();
        	swap(n,m);
    	} 
	}
	public void swap(int n,int m) {
		
		revalidate();
        repaint();
		
		int tmp = ArrCol[n].value();
		super.remove(ArrofCol[n]);
		super.remove(ArrofCol[m]);
		super.remove(Number[n]);
		super.remove(Number[m]);
		
		ArrCol[n] = new Col(ArrCol[m].n);
		ArrofCol[n] = new JPanel();
		ArrofCol[n].setBounds(100+n*20*2,600-(ArrCol[n].Tall()),20,ArrCol[n].Tall());
		Number[n] = new JLabel(""+ArrCol[n].value());
		Number[n].setBounds(100+n*20*2,600,20,20);
		
		ArrCol[m] = new Col(tmp);
		ArrofCol[m] = new JPanel();
		ArrofCol[m].setBounds(100+m*20*2,600-(ArrCol[m].Tall()),20,ArrCol[m].Tall());
		Number[m] = new JLabel(""+ArrCol[m].value());
		Number[m].setBounds(100+m*20*2,600,20,20);
		
		
		
		super.add(ArrofCol[n]);
		super.add(ArrofCol[m]);
		super.add(Number[n]);
		super.add(Number[m]);
		
	}
	void insertionSort()
	{
	    int i, key, j;
	    for (i = 1; i < n; i++)
	    {
	        key = listOfNumber[i];
	        j = i - 1;

	        while (j >= 0 && listOfNumber[j] > key)
	        {
	        	step.add(j);
	            step.add(j+1);
	        	listOfNumber[j + 1] = listOfNumber[j];
	            j = j - 1;
	        }
	        listOfNumber[j + 1] = key;
	    }
	}
	public void search()
	{
		if(!stepBinary.isEmpty())
		{
			int p = stepBinary.poll();
			ArrofCol[p].setBackground(Color.BLACK);
			if(p == posBinarySearch)
			{
				ArrofCol[p].setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, "Value at index: "+p);
				timer2.stop();
			}
		} 
		else if(posBinarySearch == -1)
		{
			JOptionPane.showMessageDialog(null, "Can't find");
			timer2.stop();
		}
		
		
	}
	
//	public int binarySearch(int l, int r, int x) 
//	{ 
//		if (r >= l) { 
//			int mid = (r + l) / 2 ; 
//			stepBinary.add(mid);
//			if (listOfNumber[mid] == x)
//			{	
//				return mid;
//			}
//			if (listOfNumber[mid] > x) 
//				return binarySearch(l, mid - 1, x);
//			return binarySearch(mid + 1, r, x); 
//        }
//        return -1; 
//    }
	public int binarySearch() {
		int left = 0;
		int right = n-1;
		int k = Integer.parseInt(valueText.getText());
		while(left<=right) {
			int mid = left + (right - left ) / 2;
			stepBinary.add(mid);
			if(k==listOfNumber[mid]) {
				return mid;
			}
			else if(k<listOfNumber[mid]) {
				right = mid - 1;
			}
			else if(k>listOfNumber[mid]) {
				left = mid + 1;
			}
		}
		return -1;
	}
	private class AnimationListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
			posBinarySearch = binarySearch();
        	search();
        }
    }
	private class searchBtnButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			timer1.stop();
			timer2.start();
		}
	}
	public static void main(String arg[])
	{
		new Insert_Sort();
	}
}