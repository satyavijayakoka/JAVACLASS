package dayOne;

public class dayFourpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 // calling function Add()
		 
		Add();
		Add();
		Add();

	// calling the function AddB()
		AddB(2,3);
		AddB(7,9);
		
		// calling the function AddC()
	int	z = AddC(2,3);
	System.out.println(z);
	System.out.println(z+z);
	System.out.println(z-z);
	System.out.println(z*z);
	System.out.println(z/z);
	}
	// writing a function without parameter and without return type
	public static void Add() {
		System.out.println(9+9);
	}
	// writing a function with parameter and without return type
	public static void AddB(int x, int y) {
		System.out.println(x + y);
	}
	// writing a function with parameter with return type
	public static int AddC(int x , int y) {
		return(x+y);
		
	}
}
