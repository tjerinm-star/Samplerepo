package accessmodifier;

public class Access1 {
	
	public void display1()
	    {
		System.out.println("public");
		}
		
		private void dispaly2()
		{
			System.out.println("private");
		}
		protected void display3()
		{
			System.out.println("protected");
		}
		void display4()
		{
			System.out.println("defualt");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access1 obj = new Access1();
		obj.display1();
		obj.dispaly2();
		obj.display3();
		obj.display4();
	}

}
