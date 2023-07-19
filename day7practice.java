package dayOne;

public class day7practice {

	public static void main(String[] args) {

		// conditional statement
		int a = 10;
		int b = 17;
		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}

		int p = 33;
		int q = 29;
		int r = 67;
		if (p > q && p > r) {
			System.out.println("p is gerater");
		} else if (q > r && q > p) {
			System.out.println("q is greater");
		} else {
			System.out.println("r is greater");
		}
		// ternary operator
		int m = 12;
		int n = 54;
		String l = m > n ? "m is greater" : "n is greater";
		System.out.println(l);

		// switch operator

		String city = "hyderabad";
		switch (city) {
		case "hyderabad":
			System.out.println("TS");
		case "vijayawada":
			System.out.println("AP");
		case "bangalore":
			System.out.println("KT");
		case "madhurai":
			System.out.println("TN");
		default:
			System.out.println("incorrect city name");
		}

		String city2 = "vijayawada";
		switch (city2) {
		case "hyderabad":
		case "kodada":
			System.out.println("TS");
			break;
		case "vijayawada":
		case "vizag":
			System.out.println("AP");
			break;
		case "bangalore":
		case "mysore":
			System.out.println("KT");
			break;
		case "madhurai":
		case "coimbatore":
			System.out.println("TN");
			break;
		default:
			System.out.println("incorrect city name");
		}

// for loop

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

		}

		for (int i1 = 50; i1 >= 5; i1 = i1 - 5) {
			System.out.println(i1);

		}

		for (int i2 = 3; i2 <= 30; i2 = i2 + 3) {
			if (i2 == 15) {
				break;
			}
			System.out.println(i2);
		}
		for (int i3 = 20; i3 >= 2; i3 = i3 - 2) {  //18  //16  //14  //12  //10  ...//0
			if (i3 == 10) {
				continue;
			}
			System.out.println(i3);  //20 //18  //16  //14  //12  //8  //6  //4  //2
		}

		// while loop
		
		int t1 = 1;
		while (t1 <= 3) {
			System.out.println(t1);
			t1++;
		}
		int t2 = 7;
		while (t2 >= 1) {
			System.out.println(t2);
			t2--;
		}

		int t3 = 3;
		while (t3 <= 30) {
			if (t3 == 12) {
				break;
			}
			System.out.println(t3);
			t3 = t3 + 3;
		}
		int t4 = 40;
		while (t4 >= 4) {
			if (t4 == 16) {
				t4 = t4 - 4;// 20
				continue;
			}
			System.out.println(t4);
			t4 = t4 - 4;
		}
		int t5 = 1;
		while(t5<=3) {
			System.out.println("hello");
			t5++;
		}
		int t6 = 1;
		while(t6 <= 7) {
			if(t6 == 4) {
				t6++;//5
				continue;
			}
			System.out.println(t6); // 1 // 2 // 3 // 5 // 6 // 7
			t6++; //2 //3  //4  //6  //7  //8
		}

	}

}
