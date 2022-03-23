import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class DrawThreeSquare {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		//SimpleWindow w = null;
		Square sq = new Square(250, 250, 100);
		//Square sq = null;
		for(int i=0; i<3; i++) {
			sq.draw(w);
			sq.move(100, 100);
		}
		;
	}
}
