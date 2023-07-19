package dayOne;

public class day17exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q1(write a function to add two numbers & return a int)

		// Add(5,6)
		int z = Add(5, 6);
		System.out.println(z);
		// Q2(write a program to reverse the string)

		String name = "Satya";
		String rev = "";
		// rev + name = ""+ a--->a
		// a + y---->ay;
		// ay +t---> ayt;
		// ayt +a---->ayta;
		// ayta +s---->aytas;

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

		// Q3(write a program to define multi-dimensional array of int and loop using for each)
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] row : numbers) {
			for (int col : row) {
				System.out.println(col);
			}
		}

		// Q4(define a string array and loop using while loop)
		String[] colors = { "blue", "pink", "white", "black" };
		int c1 = 0;
		while (c1 < colors.length) {
			System.out.println(colors[c1]);
			c1++;
		}

		// Q5(define a class vehicle with 2 property color and type and one method start() and create object using constructor)

		Vehicle Honda = new Vehicle("blue", "suv");
		System.out.println(Honda.color);
		System.out.println(Honda.type);
		Honda.start();

	}

	public static int Add(int x, int y) {
		return (x + y);

	}

}

class Vehicle {
	String color;
	String type;

	public Vehicle(String cl, String ty) {
		this.color = cl;
		this.type = ty;
	}

	public void start() {
		System.out.println("start the car");
	}
}
