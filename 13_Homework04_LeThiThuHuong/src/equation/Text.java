package equation;

public class Text {

	public static void main(String[] args) {
		//cha new cha:cha chi dung cac thuoc tinh va phuong thuc cua cha
		LinearEquation linear=new LinearEquation();
		linear.input();
		linear.f(2,3);
		linear.f1(4, 2, 1);
		linear.setB(1);
		linear.setC(2);
		System.out.println(linear.GetB());
		System.out.println(linear.GetC());
		linear.solve();
		
		//con new con
		//luon chay vao lop con
		//va con dung dc cac thuoc tinh va phuong thuc cua cha(vi thua ke) va con
		//nhung :neu method overriding thi dung method cua con
		SquareEquation s=new SquareEquation();
		s.input();
		s.f(2,3);
		s.f1(4, 2, 1);
		s.setB(1);
		s.setC(2);
		System.out.println(s.GetB());
		System.out.println(s.GetC());
		s.solve();
		//cha new con
		//luon chay vao lop cha va dung cac thuoc tinh va phuong thuc cua cha
		//nhung:neu method overriding thi nhay qua goi method cua con
		LinearEquation l=new SquareEquation();
		l.input();
		
	}

}
