package dayOne;

public class revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program1
		String name = "lakshmi";
		String u = name.toUpperCase();
		System.out.println(u);

		// program2
		String name2 = "VIJaya";
		String l = name2.toLowerCase();
		System.out.println(l);

		// program3
		String name3 = "satya";
		String s1 = name3.substring(2);
		System.out.println(s1);
		String s2 = name3.substring(1, 4);
		System.out.println(s2);

		// program4
		String name4 = "koshika";
		int a = name4.length();
		System.out.println(a);

		// program5(for, while, for each loop)
		
		String name5 = "neelima";
		// 0 1 2 3 4 5 6
		// n e e l i m a
		System.out.println(name5.charAt(3));

		for (int i = 0; i < name5.length(); i++) {
			char ch = name5.charAt(i);
			System.out.println(ch);
		}
		String name6 = "jathin";
		int t1 = 0;
		while (t1 < name6.length()) {
			System.out.println(name6.charAt(t1));
			t1++;
		}
		String name7 = "sita";
		// "sita"========>{ "s","i","t","a"}

		for (char cc : name7.toCharArray()) {
			System.out.println(cc);
		}

		// program6( starts with, ends with)

		String name8 = "jimmy";
		System.out.println(name8.startsWith("ji"));
		System.out.println(name8.endsWith("my"));

		// program7(replace, replace all, replace first)

		String name9 = "I love animals and animals are good";
		String s3 = name9.replace("I", "U");
		System.out.println(s3);
		String s4 = name9.replaceAll("animals", "dogs");
		System.out.println(s4);
		String s5 = name9.replaceFirst("animals", "dogs");
		System.out.println(s5);

		// program8(concat)
		String name10 = "INDIA";
		String name11 = "I love";
		System.out.println(name11.concat(name10));

		// program9(contains, equals, equals ignore case)

		String name12 = "erie";
		String name13 = "erie";
		String name14 = "Erie";
		System.out.println(name12.equals(name13));
		System.out.println(name13.equalsIgnoreCase(name14));
		System.out.println(name12.contains("er"));

		// program10 (split)

		String name15 = "i am learning java";

		String[] s6 = name15.split(""); // { "i","am","learning","java"}

		for (String s7 : s6) {
			System.out.println(s7);
		}
		
		// program11
		
		String name16 = "selenium";
		String rev = "";
		for (int i = name16.length() - 1; i >= 0; i--) {
			rev = rev + name16.charAt(i);
			
			// "" +m ====> m	
			// m+ u  ===> mu
			// mu + i  ====> mui
			// mui + n ====> muin
			// muin + e ======> muine
			// muine + l =====> muinel
			// muinel + e =====> muinele
			// muinele + s =======> muineles
			
		}
		System.out.println(rev); 
		
		// program 11b
		
String city1 = "pune";
		String rev2 = "";
		for (int i = 0; i < city1.length(); i++) {
			rev2 = city1.charAt(i) + rev2;
			
			// p + "" ===> p
			// u + p ===> up
			// n + up ===> nup
			// e + nup ===> enup
		}
		System.out.println(rev2);
		
		// program12
		
		String name17 = "i am going for walk";
		String[] s8 = name17.split(""); // {"I","am","going","for","walk"}
		for(String s9: s8) {
			System.out.println(s9);
		}
		
		// program 13 (trim)
		
		String name18 = " I hate lizards ";	
		System.out.println(name18.length());
		String s10 = name18.trim();
		System.out.println(s10.length());
		
		String city = " i love you ";
		System.out.println(city.length());
		String s11 = city.trim();
		System.out.println(s11.length());
		
String city2 = " go for walk ";
System.out.println(city2.length());
String s12 = city2.trim();
System.out.println(s12.length());

// program 14 (split)
    
     String city3 = "you are beautiful";
     String [] s13 = city3.split("");  // {"you","are","beautiful"}
     for(String s14: s13) {         
    	 System.out.println(s14);
     }
     
     String city4 = "i like icecream";
     String[] s15 = city4.split("");
     for(String s16: s15) {
    	 System.out.println(s16);
     }
     

	}

}
