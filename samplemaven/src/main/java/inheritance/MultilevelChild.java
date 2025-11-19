package inheritance;

public class MultilevelChild  extends MultilevelParent
{
	
	public void print1()
	{
		 System.out.println("this is from child class");
	}

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		MultilevelChild obj = new MultilevelChild();
		obj.display();
		obj.display1();
		obj.print1();
		

	}

}
