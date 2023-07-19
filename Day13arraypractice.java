package dayOne;

public class Day13arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Array [] stores value	by index
		
		//program1
		//  int [] numbers = new int [5];
		int [] numbers = {10,20,30,40,50};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
	
		// program 2
		// String [] cities = new String[5];
		String [] cities = {"Erie","Chicago","Buffalo","Newyork","Frankfurt","cleveland"};
		
		for(int i = 0; i < cities.length; i++) {
			
			System.out.println(cities[i]);
		}
		
		for(int i = cities.length-1; i >= 0; i--) {
			
			System.out.println(cities[i]);
		}
		
		// program 3
		     //            0 1 2  3  4  5                  
		
		int [] numbers2 = {3,6,9,12,15,18};
		
		for(int i = 0; i < numbers2.length; i++) {
			
			System.out.println(numbers2[i]);
		}
		
		for(int i = numbers2.length-1; i >=0; i--) {
			
			System.out.println(numbers2[i]);
		}
		
		// program 4
		
		int [] numbers3 = {5,10,15,20,25,30};
		
	  int t1 = 0;
	  while(t1 < numbers3.length) {
		  
		System.out.println(numbers3[t1]);
		t1 = t1+1;
		  
	  }
	  int t2 = numbers3.length-1;
	  while(t2 >=0) {
		  
		System.out.println(numbers3[t2]);
		t2 = t2-1;
		  
		  
	  }
	  // program 5 ---- for each loop
	  
	  String [] flowers = {"Rose","marygold","jasmine","tulips"};
	  
	  for(String item : flowers) {
	  
		System.out.println(item);
		
	  }
		
		int [] numbers4 = {6,12,18,24};
		for(int a : numbers4) {
			
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
