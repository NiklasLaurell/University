package pair;

public class PatiensSimulering {
	
	
	private static final double NBR_ITERATIONS = 1000000.0;

	public static void main(String[] args) {
		int c = 0;
		int b = 0;
		double count = 0.0;
		Pair pair;
		for (int i = 0; i < NBR_ITERATIONS; i++) {
			c = 0;
			PairSet pairSet = new PairSet(4, 13);
			for (int j = 1; j <= 52; j += 3) {
				pair = pairSet.pick();
				b = pair.second();
				if (b == 0) {
					c++;
				}
			}
			for (int k = 2; k <= 52; k += 3) {
				pair = pairSet.pick();
				b = pair.second();
				if (b == 1) {
					c++;
				}
			}
			for (int m = 3; m <= 52; m += 3) {
				pair = pairSet.pick();
				b = pair.second();
				if (b == 2) {
					c++;
				}
			}
			if (c == 0) {
				count++;
			}

		}
		System.out.print(count / NBR_ITERATIONS);
	}
}
		
	
