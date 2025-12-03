package inheritance;

public class MultipleChild  implements MultipleParent1,MultipleParent2{

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.display();
		obj.print(); 
		

	}

	@Override
	public void print() {
		System.out.println("from print");
		
	}

	@Override
	public void display() {
		System.out.println("from dispaly");
		
	}

}
