package oops;


abstract class Phone
{
	abstract public void acessory();
	public void charger()
	{
		System.out.println("33w Fast Charger");
	}
}

class infinix extends Phone
{

	
	

	@Override
	public void acessory() {
		System.out.println("case details");
		
	}
	
}

public class Abstrsactpgm {

	public static void main(String[] args) {

	infinix ob= new infinix();
	ob.acessory();
	ob.charger();
	
	
	

	}

}
