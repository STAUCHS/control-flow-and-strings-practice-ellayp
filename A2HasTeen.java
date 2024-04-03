class A2HasTeen extends ConsoleProgram {

  /**
  * The program A2HasTeen.java, when given 3 int values via user input, outputs true if 1 or more of them are teen.
  * A number is "teen" if it is in the range 13 to 19.
  * @author: E. Yap
  */
  
  public void run() {
    // Declare variables
    int intValueOne;
    int intValueTwo;
    int intValueThree;

    // Get user input
    intValueOne = readInt ("Enter age one: ");
    intValueTwo = readInt ("Enter age two: ");
    intValueThree = readInt ("Enter age three: ");

    if ((intValueOne >= 13 && intValueOne <= 19) || (intValueTwo >= 13 && intValueTwo <= 19) || (intValueThree >= 13 && intValueThree <= 19)) {
      System.out.println(true);
    }
    else {
      System.out.println(false);
    }
  }
}
