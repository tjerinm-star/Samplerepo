package abstraction;

public class Child extends Parent
{

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.display();
		obj.print();
	

	}

	@Override
	public void print() {
	
		System.out.println("from print abstract");
	}

	@Override
	public void display() {
		
		System.out.println("from display abstract");
	}

}
