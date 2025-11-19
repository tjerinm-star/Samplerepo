package inheritance;

public class Child2 extends Parent {

	public void display2()
	{
		System.out.println("from child2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child2 obj = new Child2();
		obj.display2();
		obj.display();
	}

}
