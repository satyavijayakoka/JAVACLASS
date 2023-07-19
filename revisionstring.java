package dayOne;

public class revisionstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first_name = "satya";
		
	//  0  1  2  3  4	
	//	s  a  t  y  a
		System.out.println(first_name.charAt(0));
		
		// program 1
		
		for(int i = 0; i < first_name.length(); i++) {
			System.out.println(first_name.charAt(i));
		}
		
		int t1 = 0;
		while(t1 < first_name.length()) {
			System.out.println(first_name.charAt(t1));
			t1++;
		}
		// program 2
		
		String city = "Jaipur";
		System.out.println(city.length());
		
		String q1 = city.toUpperCase();
		System.out.println(q1);
		
		String q2 = city.toLowerCase();
		System.out.println(q2);
		
		//  program3
		
		// concat()
		
		System.out.println(city.concat(" welcomes you "));
		
		// split
		
		String q3 = "i am learning javascript";
		String [] arr = q3.split("");// { "i", "am", "learning", "javascript"}
		
		for(String q4: arr) {
			System.out.println(q4);
		}
		
		// program 4
		// replace first(), replace all(), replace first()
		
		String q5 = "i am learning java and java is great language";
		System.out.println(q5.replaceFirst("java", "python"));
		
		System.out.println(q5.replaceAll("java", "python"));
		
		System.out.println(q5.replace("i","u"));
		
		// program 5
		// trim()
		
		String q6 = " chennai ";
		System.out.println(q6.trim().length());
	
		
	}

}
