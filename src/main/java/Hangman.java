import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hangman{
  private Integer mWrongGuesses = 0 ;
  private List<String> mLettersGuessed = new ArrayList<String>();
  private String mWord;
  private Integer mReturnNumber;
  private String mDashesString;

//return number corresponding to if the letter has already been used, and if it has not been used, if the letter is present in the word.
  public Integer hangmanGame1 (String word, String letter){
    Integer returnNumber;
    if(mLettersGuessed.contains(letter)){
      returnNumber = 0;
    } else {
      mLettersGuessed.add(letter);
      List wordSplit = Arrays.asList(word.split(""));
      if (wordSplit.contains(letter)) {
        returnNumber = 1;
      } else {
        returnNumber = 2;
        mWrongGuesses += 1;
      }
    }
    mReturnNumber = returnNumber;
    return mReturnNumber;
  }

//Return String of letters and dashes, showing letters that were guessed correctly, and also blanks for letters that have not been guessed yet
  public String hangmanGame2 (String word){
    String dashString = word.replaceAll(".", "_");
    // List dashList = Arrays.asList(dashString.split(""));
    // List wordSplit = Arrays.asList(word.split(""));
    // int wordLength = wordSplit.size();
    mDashesString = dashString;
    return mDashesString;
  }
  public String hangmanGame3 (String word, String letter){
    return "null";
  }
}
