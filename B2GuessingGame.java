import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * The program B2GuessingGame.java is a guessing game.
  * The guessing game lets the computer generate a secret number, an integer between 1 and 100, for your friend to guess.
  * If they guess too high, print: "Too high, guess again."
  * If they guess too low, print: "Too low, guess again".
  * If they guess the number, let the program stop and print "Congratulations".
  * If they've guessed incorrectly after 5 attempts, print "Nice Try".
  * @author: E. Yap
  */
  
  public void run() {
    // Generate new random
    Random randomSecretNum = new Random();

    // Declare variables
    int intAnswer;
    int intGuess;
    int counter;

    // Generate random number
    intAnswer = randomSecretNum.nextInt(1, 100);
    
    // Get initial guess from user
    intGuess = readInt("Guess the number (1-100): ");

    // Starting guess
    counter = 1;

    // Loop until the user guesses 
    while (intAnswer != intGuess && counter < 5) {

      // Check if answer is too high
      if (intGuess > intAnswer) {
        System.out.println("Too high, guess again.");
        intGuess = readInt("Guess the number (1-100): ");
        counter++;
      }
      
      // Check if answer is too low
      else if (intGuess < intAnswer) {
        System.out.println("Too low, guess again.");
        intGuess = readInt("Guess the number (1-100): ");     
        counter++;  
      }

    }
    
    // User does not guess it correct on the 5th try
    if (intAnswer != intGuess && counter == 5) {
      System.out.println("Nice Try");
    }

    // User guess correct
    else if (intAnswer == intGuess) {
      System.out.println("Congratulations!");
    } 
  } 
}
