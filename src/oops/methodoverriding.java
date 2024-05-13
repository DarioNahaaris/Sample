package oops;

class Father
{
	public void phone()
	{
		System.out.println("Samsung");
	}
}
class Son extends Father
{
	@Override
	public void phone()
	{
		System.out.println("I phone");
		super.phone();
		
	}
	}


public class methodoverriding {

	public static void main(String[] args) {
		
		// TODO Sample
		Son s= new Son();
				
		s.phone();
		
		
	}

}
