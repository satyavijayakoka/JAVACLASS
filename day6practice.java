package dayOne;

public class day6practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program 1
		int numT = 8;
		if (numT > 0 && numT <= 5) {
			System.out.println("10% discount");
		}
		if (numT > 5 && numT <=  10) {
			System.out.println("20% discount");
		}
		if (numT > 10) {
			System.out.println("30% discount");
		}
		// program 2
		int numTa = -4;
		if (numTa > 0 && numTa <= 5) {
			System.out.println("10% dicount");
		}
		else if (numTa > 5 && numTa <= 10) {
			System.out.println("20% discount");
		}
		else if (numTa > 10) {
			System.out.println("30% discount");
		}
		else {
			System.out.println("Incorrect input");
		}
		// program 3
		
		int marks = 70;
		if (marks > 90 ) {
			System.out.println("Grade A");	
		} 
		if (marks > 75) {
			System.out.println("Grade B");	
		}
		if (marks > 65) {
			System.out.println("Grade C");	
		}
		// program 4
		int marksB = 45;
		if (marksB > 90) {
			System.out.println("Grade A");
			
		} else if (marksB > 75) {
			System.out.println("Grade B");
			
		}else if (marksB > 65) {
			System.out.println("Grade C");
			
		}else {
			System.out.println("Fail try again");
		}
		// program 5
		
		int a = 69;
		int b = 54;
		if (a > b) {
			System.out.println("a is greater");
		
		}else {
			System.out.println("b is greater");
		}
		// program 6
		
		int x = 45;
		int y = 54;
		int z = 35;
		if (x > y && x > z) {
			System.out.println("x is greater");
		}else if (y > z && y > x) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
			
		}
		// program 7
		
		int marksC = 70;
		if(marksC > 90) {
			System.out.println("GradeA");
		}else if(marksC > 75){
			System.out.println("GradeB");
		}else if(marksC > 65) {
			System.out.println("GradeC");
			
		}
		else {
			System.out.println("Fail try again");
		}
		// program 8
		
		int l = 75;
		int m = 55;
		int t = 85;
		if(l > m && l > t) {
			System.out.println("l is greater");
		}else if(m > t && m >l) {
			System.out.println("m is greater");
		}else {
			System.out.println("t is greater");
		}
	}

}
