package inheritance;

public class Child1  extends Parent
{
public void display1()
{
	System.out.println("from child1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 obj = new Child1();
		obj.display1();
		obj.display();
	}

}
