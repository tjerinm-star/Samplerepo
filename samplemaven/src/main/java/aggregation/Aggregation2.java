package aggregation;

public class Aggregation2 
{
	String city,state;
	Aggregation1 ref;
	public Aggregation2(String city,String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
public void display()
{
	System.out.println(ref.name+" "+ref.rollno+" "+ref.address+" "+city+" "+state);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aggregation1 obj = new Aggregation1("Jerin",32,"Iritty");
		Aggregation2 obj1=new Aggregation2("Peratta","kannur",obj);  
		 obj1.display();

	}

}
