package exceptionhandling;

public class AgeException1 {

	public static void main(String[] args) throws AgeException {
		int age =16;
		if(age>=18)
		{
			System.out.println("eligibile for voting ");
		}
		else
		{
			//System.out.println("not eligibile");
			throw new AgeException("Not eligibile");
		}

	}

}
