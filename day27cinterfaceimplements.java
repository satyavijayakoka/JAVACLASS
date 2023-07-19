package dayOne;

interface WBA{
	public void save();
	public void loan();
	
}
interface WBI{
	public void displaycountry();
	public void displaycity();
}

public class day27cinterfaceimplements {

	public static void main(String[] args) {
		
		BankA VJA = new BankA();
		VJA.displaycity();
		VJA.displaycountry();
		VJA.loan();
		VJA.save();

	}

}


// more than one interface can be implemented by class
class BankA implements WBA, WBI{

	
	public void displaycountry() {
	System.out.println("i am from india");	
		
	}

	
	public void displaycity() {
		System.out.println("i am from vijayawada");
		
		
	}

	
	public void save() {
		System.out.println("i am save method");
		
		
	}

	
	public void loan() {
		System.out.println("i am loan ,method");
		
	}
	
}