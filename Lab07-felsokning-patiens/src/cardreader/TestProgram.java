package cardreader;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserTable UT = new UserTable();
		
		User a = UT.find(24073);
		User b = UT.find(24074);
		User c = UT.findByName("Jens Holmgren");
		
		//User u = new User(1234, "Niklas Fredrik");
		//UT.add(u);
		
		int TF = UT.testFind();
		
		System.out.println(TF);
		
		
		//UT.print();
		//System.out.println(a + "  " + b + " " + c);
		//System.out.println(c);
	}

}
