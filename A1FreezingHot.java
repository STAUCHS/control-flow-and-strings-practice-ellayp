class A1FreezingHot extends ConsoleProgram {

  /**
  * The program A1FreezingHot.java outputs true when given two temperatures, via user input, if one is less than 0 and the other is greater than 100.
  * The program outputs false otherwise.
  * @author: E. Yap
  */
  
  public void run() {
   // Declare variables
   int intTempOne;
   int intTempTwo;

   // Get user input
   intTempOne = readInt ("Input the first temperature: ");
   intTempTwo = readInt ("Input the second temperature: ");

   if ((intTempOne > 100 && intTempTwo < 0 ) || (intTempOne < 0 && intTempTwo > 100)) {
    System.out.println(true);
   }
   else {
    System.out.println(false);
   }
  }
}
