package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
	
	
	String s ="balck";
	public void display()
	{
		System.out.println(s);
		System.out.println(super.s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj = new SuperVariableChild();
		obj.display();
 
	}

}
