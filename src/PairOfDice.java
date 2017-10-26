public class PairOfDice {

	 double die1;// Number showing on the first die.
	 double die2; // Number showing on the second die.

	PairOfDice(double n) {
            
       
        
    }

	public double roll(double n) {
       
    		double die1 = (Math.random()*n) +1;
    		this.die1 = die1;
    		double die2 = (Math.random() * n) + 1;
    		this.die2 = die2;
        return die1 + die2;
    }

	double getDie1() {
		// Return the number showing on the first die.
		return die1;
	}

	double getDie2() {
		// Return the number showing on the second die.
		return die2;
	}

}
