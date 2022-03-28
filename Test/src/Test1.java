
public class Test1 {
	public static int[] nbrDigits(int start, int stop, int interval) {
	    int[] digits = new int[10];
	    for(int i = start; i <= stop; i += interval){
	        String number=String.valueOf(i);
	      
	        for (int j = 0; j < number.length(); j++) {
	            char pos = number.charAt(j);
	            
	            int pos_int=Character.getNumericValue(pos);  
	           
	            digits[pos_int] += 1;
	            for(int k = 0; k < digits.length; k++) {
	    			System.out.println(digits[k]);
	            }
	            System.out.println();
	            System.out.println(i);
	            System.out.println();
	        }

	      System.out.println();   
	    }

	    return digits;
	    
	}

	public static void main(String[] args) {
	
		
		
		int[] nbrDigitsres = nbrDigits(101, 125, 2);
		for(int k = 0; k < nbrDigitsres.length; k++) {
			System.out.println(nbrDigitsres[k]);
		}
		
	}

}
