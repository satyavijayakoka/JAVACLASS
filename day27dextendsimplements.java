package dayOne;

interface TWO{
	public void methodTWO();
}
interface THREE{
	public void methodTHREE();
	
}
interface FOUR{
	public void methodFOUR();
	
}

public class day27dextendsimplements {

	public static void main(String[] args) {
		
SEVEN seven = new SEVEN();
seven.methodTHREE();
seven.methodTWO();
seven.SIXA();
seven.SIXB();

	}

}

class SIX{
	public void SIXA() {
		System.out.println("this is SIXA method");
	}
	public void SIXB() {
		System.out.println("this is SIXB method");
	}
}

class SEVEN extends SIX implements TWO, THREE{


	public void methodTHREE() {
		System.out.println("this is method from interface three");
		
	}

	
	public void methodTWO() {
		System.out.println("this is method from interface two");
		
		
	}
	
}
