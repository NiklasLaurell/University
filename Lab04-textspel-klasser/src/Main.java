import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		//Scanner scan = new Scanner(System.in);
		int len = 1;
		int antal = 2;
		egetSpel game = new egetSpel(len, antal);
		//game.createDeck();
		game.gameLoop();
		
	}	
}
	
	