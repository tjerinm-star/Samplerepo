package polymorphism;

public class PolyChild extends Polyparent
{

	public void print(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		super.print(4, 9);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyChild obj = new PolyChild();
		obj.print(10, 5);

	}

}
