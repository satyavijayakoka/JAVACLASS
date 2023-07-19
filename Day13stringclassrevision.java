package dayOne;

public class Day13stringclassrevision {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		// program1	
		
String city1 = "Newyork";
String uc = city1.toUpperCase();

System.out.println(uc);
System.out.println(city1.toUpperCase());
System.out.println("welcome".toUpperCase()+ uc);
System.out.println("Welcome" + uc);


// program2

String city2 = "ChIcago";
String lc = city2.toLowerCase();

System.out.println(lc);
System.out.println(city2.toLowerCase());
System.out.println("WELcome".toLowerCase()+ lc);
System.out.println("Welcome" + lc);

// program 3

String city3 = "Lakeview";
    int a  = city3.length();
    System.out.println(a);
    
    //program 4
    
    String city4 = "Fairview";
    int b = city4.toUpperCase().toLowerCase().length();
    
    System.out.println(b);
    
    // program 5
    
    String city5 = "Vineyard";
    char c = city5.charAt(city5.length()-1);
    
    System.out.println(c);
    
    //program7
    
    String city6 = "Westwind";
    String s1 = city6.substring(3);
    
    System.out.println(s1);
    System.out.println(city6.substring(4, 7));
    // program 8
    
    // 0  1  2  3  4  5  6  7  8   
    // w  i  l  l  o  w  o  o  d
    String city7 = "Willowood";
    String s2 = city7.substring(4, 8);
    
    System.out.println(s2);
    
    
	}

}
