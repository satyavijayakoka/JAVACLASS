package dayOne;

public class revision6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		               // morning revision class
		
		// comparison operators
		// <, >, <=, >=, ==, !=
		// program1
		
		System.out.println(9 > 6);
		System.out.println(9 >= 6);
		System.out.println(9 < 6);
		System.out.println(9 <= 6);
		System.out.println(9 == 6);
		System.out.println(9 == 9);
		System.out.println(9 != 6);
		System.out.println(9 >= 9);
		
		// logical operators
		//and==> &&; or==> ||; not===> !
		
		// program 2
		
		System.out.println(9 == 9 && 9 == 9);
		System.out.println(9 != 9 && 9 == 9);
		System.out.println(9 == 9 && 9 != 9);
		System.out.println(9 != 9 && 9 != 9);
		
		// program 3
		
		System.out.println(9 == 9 || 9 == 9);
		System.out.println(9 != 9 || 9 == 9);
		System.out.println(9 == 9 || 9 != 9);
		System.out.println(9 != 9 || 9 != 9);
		
		// program 4
		
		System.out.println(!(9 == 9 ));
		System.out.println(!(9 != 9 ));
		
	// conditional statements(if, else if, switch)
		// one i/p multiple outcomes
		
		// program 5
		
		int numT = 4;
	if(numT >0 && numT < 5)	{
		System.out.println("10% discount");
	}
	if(numT > 5 && numT < 10) {
		System.out.println("30% discount");
	}
	if(numT > 10) {
		System.out.println("40% discount");
	}
	
		// program 6
	
	int numT1 = 12;	
		
	if(numT1 >0 && numT1 < 5)	{
		System.out.println("10% discount");
	}
	else if(numT1 > 5 && numT1 < 10) {
		System.out.println("30% discount");
	}
	else if(numT1 > 10) {
		System.out.println("40% discount");
	}	
	else {
		System.out.println("incorrect input");
	}
	
		// program 7
	
	int marks = 64;
	
	if (marks > 90) {
		System.out.println("grade A");
	}
	else if(marks > 75) {
		System.out.println("grade B");
	}
	else if(marks > 65) {
		System.out.println("grade C");
	}
	else {
		System.out.println("fail try again");
	}
		
	// ternary operator
	
	// program  8
	
	int a1 = 17;
	int b1 = 84;
	
String s1 = a1 > b1 ? "a1 is grater": "b1 is greater";
System.out.println(s1);

int x1 = 51;
int y1 = 11;
String s2 = x1 >y1 ? "x1 is greater": "y1 is greater";
System.out.println(s2);

// switch case

// program  9

String city = "Erie";
switch (city ){
case "Erie":
System.out.println("PA");
case "newyork":
	System.out.println("NY");
case "cleveland":
	System.out.println("OH");
default:
	System.out.println("incorrect city name");
}

// program 10

String city2 = "akron";
switch (city2) {
case "Erie":
case "pittsburgh":
	System.out.println("PA");
	break;
case "newyork":
case "buffalo":
	System.out.println("NY");
	break;
case "cleveland":
case "akron":
	System.out.println("OH");
	break;
	default: System.out.println("incorrect city name");	
	
}



	}

}
