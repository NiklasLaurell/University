import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class egetSpel {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	private int len;
	//private int antal;
	private int[] deck;
	private int[] quantity;	
	private int numb;
	
	
	public egetSpel(int len, int antal) {
		this.len = len;
		//this.antal = antal;
		this.deck = new int[len];
		this.quantity = new int[len];
		this.numb = randomInt();
		
		for(int i=0; i < this.len; i++) {
			this.deck[i] = i + 1;
			this.quantity[i] = antal;
		}
	}
	
	
	public int[] getDeck(){
		return deck;
	}
	
	public int[] getQuan(){
		return quantity;
	}
	
	
	public void uppdateDeck(int index) {
		this.quantity[index-1] = this.quantity[index-1] - 1;
		
	}
	
	public int randomInt() {
		return rand.nextInt(this.len) + 1;
	}
	
	public void gameLoop() {
		System.out.println(Arrays.toString(getDeck()) + "<--" + "Tal att gissa på");
		System.out.println(Arrays.toString(getQuan()) + "<--" + "Antal kvar av talet");
		boolean bol = true;
		while(bol == true) {
			int guess = scan.nextInt();
			if(guess > this.len || guess < 1){
				bol = false;
			}
			else if(guess == this.numb) {
				uppdateDeck(guess);
				System.out.println("Rätt");
				System.out.println(Arrays.toString(getDeck()) + "<--" + "Tal att gissa på");
				System.out.println(Arrays.toString(getQuan()) + "<--" + "Antal kvar av talet");
				this.numb = randomInt();
			}	
			else if(guess > this.numb) {
				System.out.print("Lägre än " + guess + ", gissa igen");
			
			}
			else if(guess < this.numb) {
				System.out.print("Högre än "  + guess +  ", gissa igen");
			}
			
	
		}
	}
}


							
		
	

