import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * The Program B1DiceGame.java lets you simulate the rolling of 100 pairs of dice.
  * For each roll, if the pair adds up to 2, print "snake eyes!" 
  * If the pair adds up to 7, print "lucky seven"
  * If the pair adds up to any other sum, do not print out anything
  * @author: E. Yap
  */
  
  public void run() {
    // Declare new random
    Random randomDiceRoll = new Random();

    // Declare variables
    int intDiceRollOne;
    int intDiceRollTwo;

    // Generate 100 pairs of dice rolls
    for (int counter = 0; counter < 100; counter++) {
      intDiceRollOne = randomDiceRoll.nextInt(1, 6);
      intDiceRollTwo = randomDiceRoll.nextInt(1, 6);

      // Check if pair adds to 2
      if ((intDiceRollOne + intDiceRollTwo) == 2) {
        System.out.println("snake eyes!");
      }

      // Check if pair adds to 7
      else if ((intDiceRollOne + intDiceRollTwo) == 7) {
        System.out.println("lucky seven");
      }
    }
  }
}

