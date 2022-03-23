import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
			SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
			w.moveTo(0, 0);
			w.setLineWidth(5);
			for (int i=0; i<5; i++) {
				w.waitForMouseClick();
				int x = w.getMouseX();
				int y = w.getMouseY();
				w.moveTo(x, y);
				
				w.waitForMouseClick();
				int x2 = w.getMouseX();
				int y2 = w.getMouseY();
				w.lineTo(x2, y2);
				
				
// vänta tills användaren klickar på en musknapp
// rita en linje till den punkt där användaren klickade
}
}
}