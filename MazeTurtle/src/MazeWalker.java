import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.maze.Maze;


public class MazeWalker {
	private Turtle t;
	private Maze m;
	
	
	public MazeWalker(Turtle turtle) {
		t = turtle;
		
	}
	
	
	/** Låter sköldpaddan vandra genom labyrinten maze, från
	ingången till utgången. */
	public void walk(Maze maze) {
		m = maze;
		t.penDown();
		int x = m.getXEntry();
		int y = m.getYEntry();
		int direction = t.getDirection();
		
		boolean atExit = m.atExit(x, y);
		boolean wallAtLeft = m.wallAtLeft(direction,x, y);
		boolean wallInFront = m.wallInFront(direction, x, y);
		
		t.jumpTo(x, y);
		
		while(atExit == false){
			if (wallAtLeft == true){
				if(wallInFront == true) {
					t.left(-90);
					t.forward(1);
				}
				t.forward(1);
			}
			else {
				t.left(90);
				t.forward(1);
			}
				
			x = t.getX();
			y = t.getY();
			direction = t.getDirection();
			atExit = m.atExit(x, y);
			wallAtLeft = m.wallAtLeft(direction,x, y);
			wallInFront = m.wallInFront(direction, x, y);
			
			SimpleWindow.delay(0);
			
		}
	}
}
		

