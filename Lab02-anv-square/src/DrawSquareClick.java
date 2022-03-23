import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawSquareClick {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(800, 800, "PrintClicks");
		Square sq = new Square(0, 0, 100);
		int x = 0;
		int y = 0;
		while (true) {
			w.waitForMouseClick();
			sq.erase(w);
			sq.move(-x, -y);
			x = w.getClickedX();
			y = w.getClickedY();
			sq.move(x, y);
			sq.draw(w);	
		}
	}
}
