package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VottingException {
		int age =16;
		if(age>=18)
		{
			System.out.println("eligibile for voting ");
		}
		else
		{
			//System.out.println("not eligibile");
			throw new VottingException("Not eligibile");
		}

	}

}
