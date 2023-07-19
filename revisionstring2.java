package dayOne;

public class revisionstring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program 1
	String text = "i love India";
	String p1 = text.toUpperCase();	
	System.out.println(p1);
		
	String p2 = text.toLowerCase();
	System.out.println(p2);
		
	System.out.println(text.length());	
		
		
	// program 2
	String text2 = "shiva";
	boolean p3 = text2.equals("shiva");
	System.out.println(p3);
	
	boolean p4 = text2.equalsIgnoreCase("SHiva");
	System.out.println(p4);
	
	String info = "i am new to java";
	boolean p5 = info.contains("i");
	System.out.println(p5);
	
	
	String name = "satya";
	char p6 = name.charAt(2);
	System.out.println(p6);
	
	String city = "vijayawada";
	String p7 = city.substring(4);
	System.out.println(p7);
	
	String p8 = city.substring(4, 8);
        System.out.println(p8);
	
	// program 3
        
        String text3 = " I am learning java and java is great language";
        String p9 = text3.replace("I", "U");
        System.out.println(p9);
	String p10 = text3.replaceAll("java", "python");
	System.out.println(p10);
	
	 String p11 = text3.replaceFirst("java", "python");
	 System.out.println(p11);
	 
	// program 4
	 
	 String name2 = "vijaya"; //{"v","i","j","a","y","a"}
	 char[] p12 = name2.toCharArray();
	 
	 for(int i = 0; i < name2.length(); i++) {
		 System.out.println(p12[i]);
	 }
	 
	 // program 5
	 
	 String firstname = "vijaya";
	 String lastname = "koka";
	 
	 String p13 = String.join(" ", lastname, firstname, "lakshmi");
	 System.out.println(p13);
	 
	String p14 = String.join("@", lastname, firstname);
	System.out.println(p14);
	
	// program 6
	
	boolean p15 = "".isEmpty();
	System.out.println(p15);
	
	boolean p16 = firstname.startsWith("vi");
	System.out.println(p16);
	
	boolean p17 = firstname.endsWith("ya");
	System.out.println(p17);
	
	
	}

}
