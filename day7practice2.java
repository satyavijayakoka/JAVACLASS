package dayOne;

public class day7practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// arithmetic operators
		
		int a = 6;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		int x = 14;
		int y = 3;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		// calling the function calculator

		calculator(6, 2);
		calculator(8, 4); 
		
		Add();
		Add();
		Add();

		AddB(7, 2);
		AddB(11, 5);

		int p = AddC(4, 2);
		System.out.println(p);
		System.out.println(p + p);
		System.out.println(p - 1);
		System.out.println(p * 0.10);
	}

	public static void calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

	// writing a function without parameter and without return type
	
	public static void Add() {
		System.out.println(8 + 7);

	}

	// writing the function with parameter and without return type
	
	public static void AddB(int x, int y) {
		System.out.println(x + y);
	}

	// writing the function with parameter and with return type
	public static int AddC(int x, int y) {
		return (x + y);

	}
}