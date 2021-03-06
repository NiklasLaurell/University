import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.maze.Maze;

public class MainMaze {
	public static void main(String[] args) {
		Maze maze = new Maze(5);
		SimpleWindow w = new SimpleWindow(500, 500, "Maze");
		Turtle t = new Turtle(w, 150, 150);
		MazeWalker mw = new MazeWalker(t);
		maze.draw(w);
		mw.walk(maze);

	}

}
