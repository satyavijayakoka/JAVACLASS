package dayOne;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a = 10  ---- -12, 12, 0 

		// String ---- properties and methods

		// program 1
		// How to defined String??
		String name = "Lakshmi";
		System.out.println(name);
		// program 2
		// 0 1 2 3 4 5 6
		// L a k s h m i
		// string is a collection of characters
		// string stores the value by index

		// charAt();
		char fourthchar = name.charAt(4);
		System.out.println(fourthchar);

		// program3
		// length()
		// action - count total number of char
		// return -int

		// 0 1 2 3
		// k o k a
		String lastname = "Koka";
		int totalchar = lastname.length();

		System.out.println(totalchar);

		// length-1 is always the last index
		// program 4
		String fathername = "Ratnam";
		int totalC = fathername.length();
		System.out.println(totalC);
		
		// program 5
		for (int i = 0; i < totalC; i++) {
			System.out.println(fathername.charAt(i));

		}
		// program 6
		String city = "Erie";
		for (int i = 0; i < city.length(); i++) {
			System.out.println(city.charAt(i));
		}
		// program 7
		// print every char in reverse order

		for (int i = city.length() - 1; i >= 0; i--) {
			// system.out.println
			System.out.println(city.charAt(i));
		}
		// program 8
		String city2 = "Chicago";
		String uppercaseString = city2.toUpperCase();
		System.out.println(uppercaseString);

		// program 9
		String city3 = "BUFFALO";
		String lowercaseString = city3.toLowerCase();
		System.out.println(lowercaseString);
	}

}
