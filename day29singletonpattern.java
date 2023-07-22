package dayOne;

public class day29singletonpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Database a = new Database(); // constructor is private
		
		Database db1 = Database.getInstance();
		db1.getConnection();

	}

}

class Database{
	private static Database dbObject = null;
		private Database() {
			
		}
	public static Database getInstance() {
			if(dbObject == null) {
				dbObject = new Database();
			}
			
			// returns you singleton object
			
			return dbObject;
		}
		public void getConnection() {
			System.out.println("you are connected to database");
		}
		
	}
		
			
		
	
	




