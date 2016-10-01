package del1;

import del1.Dice;

public class DiceCup {

	Dice d1 = new Dice();
	Dice d2 = new Dice();
	
	/**
	 * rollDiceCup, rolls two dice adds the facevalues together and returns the value.
	 * @return
	 */
	public int rollDiceCup(){
		int v1 = d1.roll();
		int v2 = d2.roll();
		return v1+v2;
	}


}

