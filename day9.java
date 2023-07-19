package dayOne;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program 1
		for(int i = 1; i <= 5; i++) {  //2  //3  //4  //5  //6
			System.out.println(i);   //1  //2  //3  //4  //5
		}
		// program 2
		// for loop with break
		for(int i = 5; i >= 1; i--)  {  //4  //3  
			if(i == 3) {
				break;
			}
			System.out.println(i);  //5  //4
		}
		// program 3
		for(int i = 1; i <= 5; i++)  {  //2  //3
			if(i == 3)  {
				break;
			}
			System.out.println(i);  //1  //2
		}
		// program 4
		for(int i = 50; i >= 5; i = i-5)  {  //45  //40
			System.out.println(i);  //50  //45  //40
			if(i == 40) {
				break;
			}
		}
		// program 5
		for(int i = 1; i <= 3;  i++)  {  //2  //3  //4
			if(i == 2) {
				continue;
			}
				System.out.println(i);  //1  //3
			}
		//program 6
		for(int i = 5; i >= 1; i--) {  //4  //3  //2  //1  //0
			if(i == 3) {
				continue;
			}
			System.out.println(i);  //5  //4  //2  //1
		}
		}
		}


