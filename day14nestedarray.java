package dayOne;

public class day14nestedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// multidimensional array

		// {

		// {11,22,33}

		// {44,55,66}
		// {77,88,99}

		// }

		// program 1----- forloop

		int[][] marks3 = {

				{ 1, 2, 3, 4 }, { 11, 22, 33, 44 }, { 111, 222, 333, 444 },

		};
		for (int i = 0; i < marks3.length; i++) {
			// System.out.println(i);

			int[] arr = marks3[i]; // {1,2,3,4}, //{11,22,33,44},//{111,222,333,444}
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}

		}

		// program 2

		int[][] numbers2 = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 }, };

		for (int i = 0; i < numbers2.length; i++) {
			int[] arr = numbers2[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}

		// program 3------- while loop

		int r1 = 0;
		while (r1 < numbers2.length) {
			int[] arr = numbers2[r1];
			int c1 = 0;
			while (c1 < arr.length) {
				System.out.println(arr[c1]);
				c1++;
			}
			r1++;
		}

		// program 4 ------ for each

		for (int[] row : numbers2) {
			for (int col : row) {
				System.out.println(col);
			}
		}

		// program 5 forloop
		int [] [] numbers3 = {
				{10, 20, 30}, {40, 50, 60},{70, 80, 90}
		};
		for(int i = 0; i < numbers3.length; i++) {
		int [] arr	= numbers3[i];
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		}
		// program 6 whileloop
		int[][] numbers4 = {
				{3, 5, 7},{ 11, 13, 17},{19, 23, 29}
		};
		
		int r2 = 0;
		while(r2 < numbers4.length) {
		int[] arr	= numbers4[r2];
		int c2 = 0;
		while(c2 < arr.length) {
			System.out.println(arr[c2]);
			c2++;
		}
		r2++;
		}
		
		// program7 foreach
		
		for(int [] row1 : numbers4) {
			
			for(int col1 : row1) {
				System.out.println(col1);	
			}	
		}		
		//	p8
		for(int [] row2 : numbers3) {
			for(int col2 : row2) {
				
				System.out.println(col2);
			}
		}
	// program 9
		int [][] numbers5 = {
				{1000,2000,3000},{1001,2001,3001},{4000,5000,6000}		
		};
		for(int i = 0; i < numbers5.length; i++) {
			int[] arr = numbers5[i];
			for(int j = 0; j< arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
		
		int r3 = 0;
		while(r3 < numbers5.length) {
			int [] arr = numbers5[r3];
			int c3 = 0;
			while(c3 < arr.length) {
				System.out.println(arr[c3]);
				c3++;
			}
			r3++;
		}
		
		for(int [] row3 : numbers5 ) {
			for(int col3 : row3) {
				System.out.println(col3);
			}
		}
		
		// program 10
		String[][] names = {
				{"ram","sam","jam"},{"ria","sia","tia"},{"joe","roy","tom"}		
		};
		for(int i = 0; i < names.length; i++) {
			String[] arr = names[i];
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
		int r4 = 0;
		while (r4 < names.length) {
			String [] arr = names[r4];
			int c4 = 0;
			while(c4 < arr.length) {
				System.out.println(arr[c4]);
				c4++;
			}
			r4++;
		}
		
		for(String[] row4 : names ) {
			for(String col4 : row4) {
				System.out.println(col4);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
