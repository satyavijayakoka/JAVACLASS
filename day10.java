package dayOne;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program 1
		int t1 = 50;
		while( t1 >= 5) {
			System.out.println(t1);//50  //45  //40  //35  //25  //20  //15  //10  //5
			t1 = t1-5;  ///45  //40  //35  //30  //20  //15  //10  //5  //0
		}
		
	// program 2
	int t2 = 3;
	while(t2 <= 30) {
		System.out.println(t2); //3  //6  //9  //12  //15  //18  //21  //24  //27  //30
		t2 = t2+3;//6  //9  //12  //15  //18  //21   //24  //27  //30  //33
	}
	// program 3
	int t3 = 70;
	while(t3 >= 7)  {
		if(t3 == 35)  {
			break;
		}
		System.out.println(t3);  //70  //63  //56  //49  //42
		t3 = t3-7;  //63  //56  //49  //42  //35
	}
	// program 4
	int t4 = 1;
	while(t4 <= 5)  {
		if(t4 == 3)  {
			t4++; //4
			continue;
		}
		System.out.println(t4);  //1  //2   //4  //5
		t4++;  //2  //3  //5  //6
	}
	}
}
