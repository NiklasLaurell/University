package memory;

import java.util.ArrayList;
import java.util.Random;

public class MemoryBoard {
	private MemoryCardImage [][] board;
	private boolean [][] flipped;
	private int size;
	private int pos;
	private Random r;

	
	private ArrayList<Integer> random;
	
	/** Skapar ett memorybräde med size * size kort. backFileName är filnamnet 
	    för filen med baksidesbilden. Vektorn frontFileNames innehåller filnamnen 
	    för frontbilderna. */
	public MemoryBoard(int size, String backFileName, String[] frontFileNames) {
		this.size = size;
		board = new MemoryCardImage[size][size];
		flipped = new boolean[size][size];
		createCards(backFileName, frontFileNames);
		
		
		
	}

	/* Skapar size * size / 2 st memorykortbilder.
	   Placerar ut varje kort på två slumpmässiga ställen på spelplanen. */
	private void createCards(String backFileName, String[] frontFileNames) {
		r = new Random();		
		
		
		for(int i = 0; i < size; i++) {
			for(int k = 0; k < size; k++) {
				flipped[i][k] = false;
			}
		}
		
		
		random = new ArrayList<Integer>();
		for(int a = 0; a < size*size/2; a++) {
				random.add(a);
				random.add(a);
			
		}
		for(int i = 0; i < size; i++){
			for(int k = 0; k < size; k++) {
				pos = r.nextInt(random.size());
				board[i][k] = new MemoryCardImage(frontFileNames[random.get(pos)], backFileName);
				random.remove(pos);
				
			}
			
		}
			
		}

	/** Tar reda på brädets storlek. */
	public int getSize() {
		return size*size;
	}
	
	/** Hämtar den tvåsidiga bilden av kortet på rad r, kolonn c.
	    Raderna och kolonnerna numreras från 0 och uppåt. */
	public MemoryCardImage getCard(int r, int c) {
		return board[r][c];
	}

	/** Vänder kortet på rad r, kolonn c. */
	public void turnCard(int r, int c) {
		if(flipped[r][c]) {
			flipped[r][c] = false;
		} else {
			flipped[r][c] = true;
		}	

	}
	
	/** Returnerar true om kortet r, c har framsidan upp. */
	public boolean frontUp(int r, int c) {
		if(flipped[r][c]) {
			return true;
		}
		return false;
	}
	
	/** Returnerar true om det är samma kort på rad r1, kolonn c2 som på rad r2, 
	    kolonn c2. */
	public boolean same(int r1, int c1, int r2, int c2) {
		if(board[r1][c1].getFront() == board[r2][c2].getFront()){
			return true;
		}
		return false;
	}

	/** Returnerar true om alla kort har framsidan upp. */
	public boolean hasWon() {
		for(int i = 0; i < size; i++) {
			for(int k = 0; k < size; k++) {
				if(flipped[i][k] == false) {
					return false;
				}
			}
		}
		return true;
	}	
}
