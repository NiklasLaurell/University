import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {
	private double x;
	private double y;
	private SimpleWindow w;
	private boolean draw = false;
	private double rikt; 
	/** Skapar en sköldpadda som ritar i ritfönstret w. Från början 
	    befinner sig sköldpaddan i punkten x, y med pennan lyft och 
	    huvudet pekande rakt uppåt i fönstret (i negativ y-riktning). */
	public Turtle(SimpleWindow w, int x, int y) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.rikt = 90;
		w.moveTo(x, y);
	}

	/** Sänker pennan. */
	public void penDown() {
		draw = true;
	}
	
	/** Lyfter pennan. */
	public void penUp() {
		draw = false;
	}
	
	/** Går rakt framåt n pixlar i den riktning huvudet pekar. */
	public void forward(int n) {
		w.moveTo((int) x, (int) y);
		double x1 = x + n*Math.cos(rikt/180 * Math.PI);
		double y1 = y - n*Math.sin(rikt/180 * Math.PI);
		
		if(draw == false) {
			w.moveTo((int) Math.round(x1), (int) Math.round(y1));
		}
		else {
			w.lineTo((int) Math.round(x1), (int) Math.round(y1));
		}
		x = x1;
		y = y1;
		
	}

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
		rikt = rikt + beta;
	}

	/** Går till punkten newX, newY utan att rita. Pennans läge (sänkt
	    eller lyft) och huvudets riktning påverkas inte. */
	public void jumpTo(int newX, int newY) {
		w.moveTo(newX, newY);
		x = newX;
		y = newY;
		
	
	}

	/** Återställer huvudriktningen till den ursprungliga. */
	public void turnNorth() {
		rikt = 90;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		return (int) Math.round(x);
	}

 	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return (int) Math.round(y);
	}
  
	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
 	public int getDirection() {
 		return (int) Math.round(rikt);
	}
}
