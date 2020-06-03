package string;

public class Simple4 {

	public static void main(String[] args) {
		String s1="sachin";
		String s2=new String("sachin");
		String s3="Ratan";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));

	}

}
