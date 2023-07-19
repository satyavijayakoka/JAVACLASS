package dayOne;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 5; int y = 3;
System.out.println(x+y);
System.out.println(x-y);
System.out.println(x*y);
System.out.println(x/y);
System.out.println(x%y);
int a = 7;
int b = 3;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);
// calling the function calculator()
        calculator (5,3);
        calculator (4,2);
        calculator (9,5);
        // calling the function addA();
        addA();
        addA();
        addA();
        addA();
        addA(); 
        // calling the function addB()
        addB(6,3);
        addB(9,4);
        addB(12,4); 
        // calling the function addC()
        int z = addC(4,4);
        System.out.println(z);
        System.out.println(z+z);
        System.out.println(z*0.10);
        System.out.println(z/2);
	}
	// writing the function calculator 
	public static void calculator(int x, int y) {
		System.out.println(x+y);
	}
	// writing the function without parameter and without return type
	public static void addA() {
		System.out.println(7+7);
	}
	// writing the function with parameter and without return type
	public static void addB(int s, int t) {
		System.out.println(s+t);
	}
	// writing the function with parameter and with return type
	public static int addC(int x, int y) {
		return(x+y);
	}
	
}
