class D1GramsToPounds extends ConsoleProgram {

  /**
  * The program D1GramsToPounds.java outputs a formatted table that shows a conversion from grams to pounds from 100 to 1000 grams.
  * The table displays for every 100 grams.
  * The pounds values are calculated.
  * The grams column is formatted to take up 6 spaces
  * The pounds column is formatted to take up 10 spaces.
  * @author: E. Yap
  */
  
  public void run() {
    // Declare variables
    int intGrams;
    double dblPounds;

    // Output table header
    System.out.printf("%6s %10s %n", "Grams", "Pounds");
    System.out.println("--------------------");

    for (intGrams = 100; intGrams <= 1000; intGrams+=100) {
      dblPounds = intGrams * 0.00220462;
      System.out.printf("%6d %10.4f %n", intGrams, dblPounds);
    }
  }
}
