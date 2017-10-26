import java.util.Scanner;

	 class PairOfDice {

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

public class Lab5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String choice = "y";
		String choice1 = "y";
		
		System.out.print("Enter a number of sides you want the dice to have: ");
		double n = input.nextDouble();
		input.nextLine();
		
		PairOfDice pod = new PairOfDice(n);
		
		System.out.println("Roll the dice y/n");
		while(choice.equalsIgnoreCase("y")) {
		choice1 = input.nextLine();
		
		while(choice.equalsIgnoreCase("y")) {
		
		pod.roll(n);
		int x = (int) pod.die1;
		int i = (int) pod.die2;
		System.out.println("The dice come up " + x + " and " + i);
		
		System.out.println("Would you like to continue y/n: ");
		choice = input.nextLine();
		
         
		}
		System.out.println("Program Terminated");
		}
		System.out.println("Program Terminated");
		
        
     }

	
		
 } 
			
	


