import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class AnimatedSquare {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(800, 800, "PrintClicks");
		Square sq = new Square(0, 0, 100);
		int start_x = 0;
		int start_y = 0;
		int end_x = 0;
		int end_y = 0;
		while (true) {
			w.waitForMouseClick();
			sq.erase(w);
			sq.move(-sq.getX(), -sq.getY());
			start_x = w.getClickedX();
			start_y = w.getClickedY();
			w.waitForMouseClick();
			end_x = w.getClickedX();
			end_y = w.getClickedY();
			int jumpX = (end_x - start_x) / 10;
			int jumpY = (end_y - start_y) / 10;
			for (int i = 0; i < 10; i++) {
				if (i == 0) {
					sq.move(start_x, start_y);
					sq.draw(w);
				} else {
					sq.erase(w);
					sq.move(jumpX, jumpY);
					sq.draw(w);
					w.delay(20);
				}

			}
			
		}
	}
}
