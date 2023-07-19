package dayOne;

public class revision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program1
		int[] numbers = { 111, 222, 333 };

		// for, while, foreach
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		int t1 = 0;
		while (t1 < numbers.length) {
			System.out.println(numbers[t1]);
			t1++;
		}

		for (int row : numbers) {
			System.out.println(row);
		}

		// program 2
		String[] names = { "ram", "sham", "siya" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		int t2 = 0;
		while (t2 < names.length) {
			System.out.println(names[t2]);
			t2++;
		}

		for (String name : names) {
			System.out.println(name);

		}

	}

}
