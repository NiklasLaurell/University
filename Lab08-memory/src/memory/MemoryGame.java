package memory;

public class MemoryGame {
	public static void main(String[] args) {
		String[] frontFileNames = {"can.jpg", "flopsy_mopsy_cottontail.jpg",
				"friends.jpg", "mother_ladybird.jpg", "mr_mcgregor.jpg",
				"mrs_rabbit.jpg", "mrs_tittlemouse.jpg", "radishes.jpg" };
		
		MemoryBoard mb = new MemoryBoard(4, "back.jpg", frontFileNames);
		
		MemoryWindow mw = new MemoryWindow(mb);
		for(int i =0; i < 4; i++ ) {
			for(int k= 0; k < 4; k++) {
				MemoryCardImage a = mb[i][k];
				System.out.println(a);
			}
			
		}
		mw.drawBoard();
		
	}
}
