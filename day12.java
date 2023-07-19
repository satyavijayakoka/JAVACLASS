package dayOne;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Chinmay";

		// 0 1 2 3 4 5 6
		// c h i n m a y
		String rev = "";
		for (int i = 0; i < firstName.length(); i++) {
			// System.out.println(firstName.charAt(i));
			rev = firstName.charAt(i) + rev;
			// C +"" =======> C
			// h+C ======>hC
			// i+hC =====>ihC
		}

		// Program1

		String city1 = "Erie";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("Welcome ".toUpperCase() + uc);
		System.out.println("welcome" + uc);
		// program 2

		String city2 = "CHIcago";
		String lc = city2.toLowerCase();
		System.out.println(lc);
		System.out.println(city2.toLowerCase());
		System.out.println("Welcome".toLowerCase() + lc);

		// program3

		String city3 = "Newyork";
		int a = city3.length();
		System.out.println(a);

		// Program 4

		String city4 = "Fairview";
		int b = city4.toUpperCase().toLowerCase().length();
		System.out.println(b);

		// program5

		String city5 = "lakeview";
		char c = city5.charAt(city5.length() - 1);
		System.out.println(c);

		// program6
		// SUBSTRING

		String city6 = "Buffalo";
		// 0 1 2 3 4 5 6
		// B u f f a l o

		String s1 = city6.substring(3);
		System.out.println(s1);

		// city6.substring(startIndex,endIndex(not included));

		String s2 = city6.substring(2, 6);
		System.out.println(s2);

		
	                        	// "day13"//
		
		
		// starts with()
		String city7 = "Lakeview";
		boolean s3 = city7.startsWith("Lak");
		System.out.println(s3);

		// ends with()
		String city8 = "Fairview";
		boolean s4 = city8.endsWith("ew");
		System.out.println(s4);

		// replace First()
		String city9 = "I am learning python and python is a good language";
		String s5 = city9.replaceFirst("python", "java");
		System.out.println(s5);

		// replace all()
		String s6 = city9.replaceAll("python", "java");
		System.out.println(s6);

		// replace()
		String s7 = city9.replace("I", "U");
		System.out.println(s7);

		// contact()
		String city10 = "Erie";
		String city11 = "Welcome to";
		String s8 = city11.concat(city10);
		System.out.println(s8);

		// contains()
		String city12 = "I am learning js in Erie";
		boolean s9 = city12.contains("am");
		System.out.println(s9);

		// equal()
		String city13 = "Chicago";
		String city14 = "CHICAGO";
		boolean s10 = city13.equals(city14);
		System.out.println(s10);

		// equal ignore case()
		boolean s11 = city13.equalsIgnoreCase(city14);
		System.out.println(s11);

		// trim()
		String city15 = " I am watching movie ";
		System.out.println(city15.length());

		String s12 = city15.trim();
		System.out.println(s12.length());

		// contains()

		String city16 = "I am learning french";
		String city17 = "FRENCH";
		boolean s13 = city16.toUpperCase().contains(city17);
		System.out.println(s13);
		
		
		
		// Split()
				// come back to this after array
			//	String city18 = "I am learning javascript";
			//	String [] s14 = city18.split(" "); //{"I","am","learning","javascript"}
			//	String [] s15 = city18.split("a"); //{"I ,"m" "le","rning j","v","script"}
		
		
		

	}

}
