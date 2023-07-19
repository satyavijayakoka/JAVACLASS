package dayOne;

public class revisionstringarray {

	public static void main(String[] args) {
		
		// program 1
				String firstName = null;
				System.out.println(firstName);
				
				int a = 0;
				System.out.println(a);
				
				int [] numbers = new int[3];
				int numbers2 [] = new int[4];
				
				System.out.println(numbers[0]);
				numbers[0] = 11;
				numbers[1] = 12;
				numbers[2] = 13;
				//numbers[3] = 14;
				
				
				System.out.println(numbers[0]);
				System.out.println(numbers[1]);
				System.out.println(numbers[2]);
				
				
			// program 2
				int[] numbers3 = new int[5];
				
				int [] numbers4 = {11, 22, 33, 44, 55};
				for(int i = 0; i < numbers4.length; i++) {
					System.out.println(numbers4[i]);
				}
		
		int t1 = 0;
		while(t1 < numbers4.length) {
			System.out.println(numbers4[t1]);
			t1++;	
		}
		
		for(int n: numbers4) {
			System.out.println(n);
		}
		
		
		// program 3
		                 //   0       1       2          3    
		                     
		String [] cities = {"pune", "goa", "jaipur", "madurai"};
		
		for(int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		int t2 =0;
		while(t2 < cities.length) {
			System.out.println(cities[t2]);
			t2++;
		}
		
		for( String c : cities) {
			System.out.println(c);
		}
		
		// program 4 (multidimensional array)
		
		int [] [] numbers5 = {
				{11, 22, 33}, {44, 55, 66}, {77, 88, 99}
		};
		
		
		for(int i = 0; i < numbers5.length; i++) {
			int [] ray = numbers5[i];
			for(int j = 0; j < ray.length; j++) {
				System.out.println(ray[j]);
			}
		}
		
		int t3 = 0;
		while(t3 < numbers5.length) {
			int [] ray = numbers5[t3];
			int t4 = 0;
			while(t4 < ray.length) {
				System.out.println(ray[t4]);
				t4++;
			}
			t3++;
		}
		
		
		for(int [] row: numbers5) {
			for(int col: row) {
				System.out.println(col);
			}
		}
		
		// program 5
		
		String [] [] names = {
				{"ram", "sita","laxman"}, {"krishna", "arjun", "bhima"}, {"nakul", "saha", "yudhistir"}
				
		};
		
		for(int i = 0; i < names.length; i++) {
			String [] ray2 = names[i];
			for(int j =0; j < ray2.length; j++) {
				System.out.println(ray2[j]);
			}
		}
		
		int t5 = 0;
		while(t5 < names.length) {
			String [] ray2 = names[t5];
			int t6 = 0;
			while(t6 < ray2.length) {
				System.out.println(ray2[t6]);
				t6++;
			}
			t5++;
		}
		
		for(String [] row2: names ) {
			for(String col2: row2) {
				System.out.println(col2);
			}
		}
		
		
		
		
		

	}

}