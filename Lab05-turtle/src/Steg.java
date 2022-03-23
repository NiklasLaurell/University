import se.lth.cs.pt.window.SimpleWindow;
import java.util.Random;

public class Steg {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "1000 steg");
		Random rand = new Random();
		Turtle t1 = new Turtle(w, 300, 300);
		t1.penDown();
		int n = 0;
			
		while(n<1000) {
			int rotation_angle = rand.nextInt(360) + 1;
			int length = rand.nextInt(10) + 1;
			
			t1.left(rotation_angle);
			t1.forward(length);
			n++;
			SimpleWindow.delay(10);

		}
		
	}
}
