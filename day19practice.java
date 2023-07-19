package dayOne;

public class day19practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle2 toyota = new Vehicle2();
		Vehicle2 Honda = new Vehicle2("Honda");
		Vehicle2 bmw = new Vehicle2("Honda","CRV");
		
		
		
		
		
		
	}

}
class Vehicle2 {
	String name;
	String model;
	public Vehicle2() {
		System.out.println("default constructor is called");
	}
	public Vehicle2(String nm) {
		this.name = nm;
		System.out.println("name of the vehicle"+ this.name);
	}
	public Vehicle2(String nm, String mdl) {
		this.name = nm;
		this.model = mdl;
		System.out.println("name of the vehicle"+this.name+this.model);
	}
}













