package dayOne;

public class Day8exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Q1 Addition
		int z = Add(9,7);
		System.out.println(z);
		//Q2 Arithmetic operations
		calculator(7,3);
	}

	public static int Add(int x, int y) {
		return (x+y);
	
	}
	public static void calculator(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	
	}

}
