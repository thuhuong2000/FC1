package arraylist;

import java.util.ArrayList;

public class Test {
	private ArrayList<Integer>arr=new ArrayList<Integer>();
	public void input() {
		arr.add(5);
		arr.add(2);
		arr.add(9);
		arr.add(11);
		arr.add(7);
		arr.add(9);
		arr.add(-6);
	}
	@Override
	public String toString() {
		return arr.toString();
	}
	//tinh tong cac so nguyen trong doi tuong mang MyArrayList
	public int sum() {
		int s=0;
		for(int i=0;i<arr.size();i++)
			s=s+arr.get(i);
		return s;
		
	}
	//dem gia tri chan
	public  int countEvenNumber()
	   {
	       int k=0;
	       for(int i=0; i<arr.size(); i++)
	           if(arr.get(i).intValue()%2==0) 	//intValue() => tra ve kieu gia tri int
	        	   k++;
	       return k;
	   }
	// thiet lap lai ca phan tu o vi tru chan bang 10
	public void set() {
		for(int i=0;i<arr.size();i=i+2)	
			arr.set(i,10);
	}
	//viet ham kiem tra x co phai la so nguyen to
	public boolean isPrime(int x) {
		if(x<2)
			return false;
		for(int i=2;i<=Math.sqrt(x);i++)
			if(x%i==0) return false;
		return true;
	}
	//in ra cac gia tri chia het cho 2 va 5 trong doi tuong mang arr
	public void printDivisibleFor2or5() {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)%2==0 || arr.get(i)%5==0)
				System.out.print(arr.get(i) +"	");
		}
	}
	//tinh trung binh cong cac so nguyen to trong doi tuong mang arr
	public double averagePrime() {
		double s=0; int d=0;
		for(int i=0;i<arr.size();i++)
			if(isPrime(arr.get(i))) {
				s=s+arr.get(i);
				d++;
			}
			return (s/d);		
	}
	//xoa cac gia tri am trong doi tuong ArrayList
	public void removeNegative() {
		for(int i=0;i<arr.size();i++)
			if(arr.get(i)<0)
				arr.remove(i);
		
	}
	//xoa cac phan tu trung nhau, giu lại duy nhat 1 phan tu trong doi tuong ArrayList
	public void removeDuplicate() {
		for(int i=0;i<arr.size();i++)
			for(int j=i+1;j<arr.size();j++)
				if(arr.get(i).equals(arr.get(j)))	//equals() => so sanh bang
					arr.remove(i);	
	}
	//sap xep doi tuong ArrayList tang dan
	public void sortIncrease () {
		for(int i=0;i<arr.size()-1;i++)
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i)>(arr.get(j))) {
					int t=arr.get(i);
					arr.set(i,arr.get(j)); 	//gan get(j) vao vi tri i <=> get(i)=get(j)
					arr.set(j, t); 			//gán t vao vi trí j
				}
			}
	}
	//sap xep doi tuong giam dan
	public void sortReduction () {
		for(int i=0;i<arr.size()-1;i++)
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i)<(arr.get(j))) {
					int t=arr.get(i);
					arr.set(i,arr.get(j)); 	//gan get(j) vao vi tri i <=> get(i)=get(j)
					arr.set(j, t);			 //gán t vao vi trí j
				}
			}
	}
	// chen elment vao mang sao cho mang van tang dan
	public void insertElement(int element) {
		for (int i = 0; i < arr.size(); i++)
			if (arr.get(i) > element) {
				arr.add(i, element);
				return;
			}
		if (arr.get(arr.size() - 1) < element )
			arr.add(element);
	}
	//dua so chan ve truoc va so le ve sau trong doi tuong arraylist
	public void evenOod() {
		int c=0, l=0;
		for(int i=0;i<arr.size();i++)
	        for (int j=i;j<arr.size();j++){
	            if (arr.get(j)%2==0){
	                int t = arr.get(i);
	                arr.set(i,arr.get(j));
	                arr.set(j, t);
	            }
	        }
	}
	//tim day con tang dan dai nhat trong doi tuong arraylist
	
	//tinh tong lon nhat cua 2 phan tu lien tiep cuoi cung trong doi tuong arraylist
	
	//tinh tong lon nhat cua 2 phan tu lien tiep dau tien trong doi tuong arrayList
	
	//tim tong lon nhat cua 2 phan tu trong doi tuong arraylist
	public int sumN() {
		int max=arr.get(0);
		for(int i=0;i<arr.get(i);i++) {
			if(max<(arr.get(i)+ arr.get(i+1)))
					max=(arr.get(i)+arr.get(i+1));
		}
		return max;
	}
	//kiem tra xem mang co tang dan khong
	public boolean IsGrow() {
	    int dem = 0;
	    for (int i = 0; i <arr.size()-1; i++)
	    {
	        if (arr.get(i+1) >=arr.get(i)) 
	        	dem++;
	    }
	    if (dem == arr.size()-1) 
	    	return true;
	    else 
	    	return false;
	}
	// dao nguoc cac phan tu trong doi tuong araylist
	public void reverse() {
		for(int i=0;i<arr.size();i++){ 
            for(int j=i+1;j<arr.size();j++) 
            { 
                int t=arr.get(i); 
                arr.set(i,arr.get(j)); 
                arr.set(j, t); 
            }
		}
	}
	
	public static void main(String[] args) {
		Test test= new Test();
		test.input();
		System.out.println(test.toString());
/*		System.out.println(test.sum());
  
		System.out.println("Even Number in array: " +test.evenNumber());
		System.out.println(test.countEvenNumber());
		
		//test.set();
		 * 
		System.out.print("Print divisible numbers for 2 or 5: ");
		test.printDivisibleFor2or5();
		
		System.out.println("Average of Prime: "+test.averagePrime());
		
		test.removeNegative();
		System.out.println(test.toString());
		
		test.removeDuplicate();
		System.out.println(test.toString());
		
		test.sortIncrease();
		System.out.println(test.toString());
		
		test.sortReduction();
		System.out.println(test.toString());
		
		test.insertElement(7);
		System.out.println(test.toString());
		
		test.reverse();
		System.out.println(test.toString());
		
		System.out.println(test.IsGrow());
		
		System.out.println(test.sumMax());
		
		test.lineMax();
  		System.out.println(test.toString());*/
		
		test.evenOod();
		System.out.println(test.toString());
	}

}