package del1;

import java.util.Scanner;
import del1.Dice;
import del1.DiceCup;
import del1.Player;

public class Game {

	public static void main(String[] args) {

		Scanner scannavn = new Scanner(System.in);
		Scanner scanroll = new Scanner(System.in);

		Player p1 = new Player("Spiller 1",0);
		Player p2 = new Player("spiller 2",0);

		DiceCup d6 = new DiceCup();
		int points;

		System.out.println("Velkommen til terningspillet");
		System.out.println("Regler: ved slag med to terninger summeres øjnene, som lægges til ens point. \n Ved point på 40 eller derover vindes spillet.");


		// Brug scanner til at registere spiller navn i klassen "player.java". 
		// Brug nested loops til at få spillet til at køre og evaluer for balance !=> 40. 

		//Hvordan skal en spiller rolle terningerne? - via en evaluering af en scanning? eller ved at trykke på en tast?
		do {

			points = d6.rollDiceCup();
			p1.addToCurrentBalance(points);


		}while(!(p1.getBalance() >= 40 && p2.getBalance() >= 40));

		// en hurtig test af spillet so far: 
		//		points = d6.rollDiceCup();
		//		p1.addToCurrentBalance(points);
		//		System.out.println(p1.getBalance());
	}

}
