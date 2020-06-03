package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {

	public static void read() throws FileNotFoundException {
		Scanner kb=new Scanner(new File("k24cmutpn8.txt"));
		while(kb.hasNext()==true) {
			System.out.println(kb.nextLine());
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		ReadFile.read();
	}

}
