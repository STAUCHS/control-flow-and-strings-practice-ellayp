class C2EveryNth extends ConsoleProgram {

  /**
  * The program C2EveryNth, when given a non-empty string and an int N,
  * returns the string made starting with character 0, 
  * and then every Nth char of the string. 
  * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
  * @author: E. Yap
  */
  
  public void run() {
    // Declare variables
    String strWord;    
    String strNewWord;
    int intNthChar;
    int intLength;
    
    // Get word from user
    strWord = readLine("Enter a word: ");
    intNthChar = readInt("Enter an integer: ");

    // Initialize varaibles
    intLength = strWord.length();
    strNewWord = "";

    for (int i = 0; i <= intLength; i += intNthChar) {
      strNewWord += strWord.charAt(i);
    }

    System.out.println(strNewWord);  
  }
}
