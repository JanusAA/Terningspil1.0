package del1;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		// vi caster Math.random double til int. Vi adderer 1 til at starte med så randomnumber ikke kan blive 0.
		int randomnumber= (int)(Math.random()*6+1);
		return randomnumber;
	}

}
