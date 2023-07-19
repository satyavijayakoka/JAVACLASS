package dayOne;

public class day9practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // program 1
		String name = "chinmay";
		System.out.println(name);
		
		// program2
		
		char fifthchar = name.charAt(5);
		System.out.println(fifthchar);
		
		// program3
		//length()
		
		String lastname = "Deshpande";
		int totalchar = lastname.length();
		System.out.println(totalchar);
		
		// program4
		
		String city = "Buffalo";
		for(int i = 0; i < city.length(); i++) {
			System.out.println(city.charAt(i));
			}
		
		// program5
		
		for(int i = city.length()-1; i >=0; i--) {
			System.out.println(city.charAt(i));
		}
		
		// program6
		
		String city2 = "chicago";
		String uppercaseString = city2.toUpperCase();
		System.out.println(uppercaseString);
	
	// program7
		
	String city3 = "newyORK";
	String lowercaseString = city3.toLowerCase();
	System.out.println(lowercaseString); 
	
	// program 8 
	
	String city4 = "eRie";
	String upperCaseString = city4.toUpperCase();
	System.out.println(upperCaseString);
	
	//PROGRAM9
	
	String city5 = "pittsBUrGh";
	String lowerCaseString = city5.toLowerCase();
System.out.println(lowerCaseString);
}
}
