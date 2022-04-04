package pair;

public class AltSolution {

	public static void main(String[] args) {
		
		int NBR_ITERATIONS = 1000000;
		int counter = 0;
		int i = 0;
		
		for(int k = 0; k < NBR_ITERATIONS; k++ ) {
			PairSet cardDeck = new PairSet(4,13);
			i = 0;
			while(cardDeck.more()) {
				Pair p = cardDeck.pick();
				int value = p.second();
				if(i == value) {
					counter ++;
					break;
				}
				i++;
				if(i == 3) {
					i = 0;
				}
					
				
			}
		}
		System.out.println((double) (1-(counter/(double)NBR_ITERATIONS)));
		

	}

}
