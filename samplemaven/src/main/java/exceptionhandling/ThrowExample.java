package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age =16;
		if(age>=18)
		{
			System.out.println("eligibile for voting ");
		}
		else
		{
			//System.out.println("not eligibile");
			throw new NumberFormatException("Not eligibile");
		}

	}

}
