import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class twoTurtle {
	public static void main(String[] args) {
		int width = 500;
		int heigth = 500;
		SimpleWindow w = new SimpleWindow(width, heigth, "1000 steg");
		SimpleWindow w1 = new SimpleWindow(width, heigth, "1000 steg");
		Random rand = new Random();
		
		Turtle t1 = new Turtle(w, rand.nextInt(width), rand.nextInt(heigth));
		Turtle t2 = new Turtle(w1, rand.nextInt(width), rand.nextInt(heigth));
		Turtle t = new Turtle(w, rand.nextInt(width), rand.nextInt(heigth));
		t1.penDown();
		t2.penDown();
		
		int dist = 10000000;
		int rotation_angle = 0;
		int length = 0;
		
		while(dist > 40) {
			
			// låt respektive Turtle hoppa 1 steg
			for(int i = 1; i<=2; i++) {		
				rotation_angle = rand.nextInt(360) + 1;
				length = rand.nextInt(10) + 1;
				if(i==1) {
					
					t = t1;
				}
				if(i==2) {
					t = t2;
				}
			
				t.left(rotation_angle);
				t.forward(length);
				
			// Flyttar turtle till random position om den hamnar utanför window
				if(t.getX() < 0 || t.getX() > width || t.getY() < 0 || t.getY() > heigth)
					t.jumpTo(rand.nextInt(width), rand.nextInt(heigth));
				
			}
			// Uppdatera avståndet mellan t1 och t2
			dist = distance(t1 , t2);
			
			//SimpleWindow.delay(30);
			System.out.println(dist);
			
		}
		
		
	}
	
	
	public static int distance(Turtle t1 , Turtle t2){
		int xDiff = t1.getX() - t2.getX();
		int yDiff = t1.getY() - t2.getY();
		int dist = (int) Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
		return dist;
		}
}
