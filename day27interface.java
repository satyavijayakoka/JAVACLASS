package dayOne;
interface WorlbankL{
	public void save(int x);
	public void loan(int y);
}
public class day27interface {

	public static void main(String[] args) {
		
		SBIL India = new SBIL();
		India.save(0);
		India.loan(0);
		
		PNBL Punjab = new PNBL();
		Punjab.loan(0);
		Punjab.save(0);
		

	}

}
class SBIL implements WorldbankL{
	public void save(int x) {
		System.out.println("i am save method of sbil");
	}
	public void loan(int y) {
		System.out.println("i am loan method of sbil");
	}	
	
}
class PNBL implements WorldbankL{
	public void save(int x) {
		System.out.println("i am save method of pnbl");
	}
	public void loan(int y) {
		System.out.println("i am loan method of pnbl");
	}	
}

