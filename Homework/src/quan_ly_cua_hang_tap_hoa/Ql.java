package quan_ly_cua_hang_tap_hoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ql {
	public static void readFile() throws FileNotFoundException {
		Scanner kb=new Scanner(new File("src/quan_ly_cua_hang/input.txt"));
		while(kb.hasNext()==true) {
			System.out.println(kb.nextLine());
			}
		}


	public static void main(String[] args) throws FileNotFoundException {
		Ql n=new Ql();
	}
}