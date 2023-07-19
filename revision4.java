package dayOne;

public class revision4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program1
		String[][] states = { { "erie", "lakeview" }, { "buffalo", "newyork" }, { "texas", "dallas" }

		};
		
		for (int i = 0; i < states.length; i++) {
			String[] city = states[i];//{"erie","lakeview"},{"buffalo","newyork"},{"Texas","Dallas"}
			for (int j = 0; j < city.length; j++) {
				System.out.println(city[j]);
			}
		}
		
		int r1 = 0;
		while (r1 < states.length) {
			String[] ci = states[r1];
			int c1 = 0;
			while (c1 < ci.length) {
				System.out.println(ci[c1]);
				c1++;
			}
			r1++;
		}
		
		for (String[] a : states) {
			for (String b : a) {
				System.out.println(b);
			}
			
		}
		
		// program 2
		
		PersonC satya = new PersonC();
		System.out.println(satya.fullname);
		System.out.println(satya.age);
		satya.fullname = "satya koka";
		satya.age = 35;
		System.out.println(satya.fullname);
		System.out.println(satya.age);
         satya.displayName();

		PersonC madhu = new PersonC();
		madhu.fullname = "madhu duggirala";
		madhu.age = 39;
		System.out.println(madhu.fullname);
		System.out.println(madhu.age);
        madhu.displayName();
        
		// program3
		
		PersonD ram = new PersonD("ram raj",32);
		ram.displayName();
		
		PersonD nalini = new PersonD("nalini v",31);
		nalini.displayName();

	// program4
		
		int [][] numbers = {{101,201,301},{102,202,302},{103,203,303}};
		
for(int i =0; i < numbers.length; i++) {
int [] arr	= numbers[i];
for(int j = 0; j < arr.length; j++) {
	System.out.println(arr[j]);
}
}

int t1 = 0;
while(t1 < numbers.length) {
	int[]arr = numbers[t1];
	int t2 = 0;
	while(t2 < arr.length) {
		System.out.println(arr[t2]);
		t2++;
	}
	t1++;
}

for(int [] p : numbers) {
	for(int q: p) {
		
	}
}

	}
	
}

class PersonC {
	// Properties;
	// class fields;
	String fullname;
	int age;
	
	public void displayName() {
		System.out.println(this.fullname);
	}
	
}

class PersonD {
	String fullname;
	int age;
	
	public PersonD(String fn, int ag) {
		this.fullname = fn;
		this.age = ag;
	}
	
public void displayName() {
	System.out.println(this.fullname);
}
	
}
