package pair;
import java.util.Random;

public class PairSet {
	private Pair[] pairs;
	private int n;
	private static Random rand = new Random();
	
	/** Skapar en mängd av alla talpar (a,b) sådana att
        0 <= a < rows  och  0 <= b < cols */
	public PairSet(int rows, int cols) {
		n = (rows * cols);
		pairs = new Pair[n];
		
		int k = 0;
		
		for(int i = 0; i < rows; i++){
			for(int j =0; j < cols; j++) {
				pairs[k] = new Pair(i, j);
				k++;
					
				}
			}
	
	}

	/** Undersöker om det finns fler par i mängden. */
	public boolean more() {
		if(n > 0){
			return true;
		}
		
		return false;
		
	}

	/** Hämtar ett slumpmässigt valt talpar ur mängden. Mängden
	 	blir ett element mindre. Om mängden är tom returneras null. */
	public Pair pick() {
		if(more() == true) {
			int p = rand.nextInt(n);
			Pair value = pairs[p];
			pairs[p] = pairs[n-1];
			n--;
			return value;
		}
		
		return null;
		
	}
		
	
}
