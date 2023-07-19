package dayOne;

public class Day7practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	// Program 1
	int numT = 6;
	
	if(numT > 0 && numT <= 10) {
System.out.println("10% dicount");
	}
	if(numT < 10 && numT >= 20) {
		System.out.println("20% dicount");
	}
if(numT > 20) {
	System.out.println("30% dicount");
}
	
	// program 2
int numTa = -17;
if(numTa > 0 && numTa <=10) {
	System.out.println("10% discount");	
}
else if(numTa > 10 && numTa <=20) {
	System.out.println("20% discount");	
}
else if(numTa > 20) {
	System.out.println("30% discount");
}
else {
	System.out.println("Incorrect input");
}

// program 3
int marks = 93;
if(marks > 90) {
	System.out.println("Grade A");
}
if(marks > 75) {
	System.out.println("Grade B");
}
if(marks > 65) {
	System.out.println("Grade C");
}

// Program 4
int marksB =63;
if(marksB > 90) {
	System.out.println("Grade A");
}
else if(marksB > 75) {
	System.out.println("Grade B");
}
else if(marksB > 65) {
	System.out.println("Grade C");
}
else {
	System.out.println("Fail try again");
}
// Program 5
int a = 15;
int b = 11;
if(a > b) {
	System.out.println("a is greater");
}
else {
	System.out.println("b is greater");
}
// program 6
int p = 9;
int q = 7;
int r = 5;
if(p > q && p > r) {
	System.out.println("p is greater");	
}
else if(q > p && q > r) {
	System.out.println("q is greater");
}
else {
	System.out.println("r is greater");
}
 // program 1
String city = "Erie";
switch(city) {
case "Erie":
	System.out.println("PA");
case "Newyork":
	System.out.println("NY");
case "Chicago":
	System.out.println("IL");
case "Frankfurt":
	System.out.println("KT");
	default:
		System.out.println("Incorrect city name");
}
// program 2
String city2 = "Ere";
switch(city2) {
case "Erie":
	System.out.println("PA");
	break;
case "Newyork":
	System.out.println("NY");
	break;
case "Chicago":
	System.out.println("IL");
	break;
case "Frankfurt":
	System.out.println("KT");
	break;
	default:
		System.out.println("Incorrect city name");
}
// program 3
String city3 = "Berry";
switch(city3) {
case    "Erie":
case	"Phildelphia":
		System.out.println("PA");
	break;
case    "Newyork":
case	"Buffalo":
	System.out.println("NY");
case  "Chicago":
case  "Bloomington":
	System.out.println("IL");
	break;
case "Frankfurt":
case "Berry":
	System.out.println("KT");
	break;
	default:
		System.out.println("Incorrect city name");
		
}
}

}