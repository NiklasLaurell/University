import se.lth.cs.pt.window.SimpleWindow;
// import java.awt.Color;

public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "Drawing Window");
		w.setLineColor(java.awt.Color.RED);
		w.setLineWidth(5);
		w.moveTo(100, 100);
		
		w.lineTo(150, 100);
		w.lineTo(150, 150);
		w.lineTo(100, 150);
		w.lineTo(100, 100);
		
		}
	
}