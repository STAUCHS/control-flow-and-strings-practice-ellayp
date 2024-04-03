class C1BackToBack extends ConsoleProgram {

  /**
  * The program C1BackToBack.java, when given a string,
  * takes the last character and print a new string with the last character added at the front and back.
  * The original string will be length 1 or more.
  * For example, "cat" yields "tcatt"
  * @author: E. Yap
  */
  
  public void run() {
    // Declare variables
    String strWord;
    String strLastChar;
    String strNewWord;

    // Get user to input a word
    strWord = readLine ("Input a word: ");

    // Get last character of inputted word
    strLastChar = strWord.substring(strWord.length() - 1);

    // Add the last character to the front and back
    strNewWord = strLastChar + strWord + strLastChar;

    // Output new word
    System.out.println(strNewWord);
  }
}
