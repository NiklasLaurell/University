import se.lth.cs.pt.window.SimpleWindow;

public class Mole {
	Graphics g = new Graphics(30, 60, 10);
	private int y = 18;
	private int gras = 2;
	
	public static void main(String[] args){
		Mole m = new Mole();
		m.drawWorld();	
		m.dig();
	}
	
	public void drawWorld() {
			
		g.rectangle(0, 0, g.getWidth(), y, Colors.BLUE);
		g.rectangle(0, 18, g.getWidth(), gras, Colors.GREEN);
		g.rectangle(0, 20, g.getWidth(), 40, Colors.SOIL);
	}
	
	public void dig() {
		int x = g.getWidth() / 2; // För att börja på mitten
		int y = g.getHeight() / 2;
		g.block(x, y, Colors.MOLE);
		
			while (true) {
				if(x >= 0 && x < g.getWidth() && y >= 19 && y < g.getHeight()) {
					System.out.println(x);
					char key = g.waitForKey();
					if (key == 'w') { 
						g.block(x, y - 1, Colors.MOLE);
						g.block(x, y , Colors.TUNNEL);
						y = y - 1;
					}
					else if (key == 'a') { 
						g.block(x-1, y, Colors.MOLE);
						g.block(x, y, Colors.TUNNEL);
						System.out.println(x);
						x = x - 1;
					}
					else if (key == 's') { 
						g.block(x, y + 1, Colors.MOLE);
						g.block(x, y, Colors.TUNNEL);
						y = y +1;
					}
					else if (key == 'd') { 
						g.block(x + 1, y, Colors.MOLE);
						g.block(x, y, Colors.TUNNEL);
						x = x + 1;
					}
				}
				else {
					if (x < 0) {
						g.block(x + 1, y, Colors.MOLE);
						x = x + 1;
					}
					else if(x >= g.getWidth()) {
						System.out.println("hej");
						g.block(x - 1, y, Colors.MOLE);
						x = x - 1;
						
					}
					else if(y < 20) {
						g.block(x, y + 1, Colors.GREEN);
						y = y + 1;
					}
					else if(y >= g.getHeight()) {
						g.block(x, y - 1, Colors.MOLE);
						y = y - 1;
					}
				}
				
			}
		
	}
}

