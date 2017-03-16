import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hangman{
  private Integer mWrongGuesses = 0 ;
  private List<String> mLettersGuessed = new ArrayList<String>();
  private String mWord;

  public String hangmanGame (String word, String letter){
    String returnMessage;
    if(mLettersGuessed.contains(letter)){
      returnMessage = "You have already entered this letter";
    } else {
      mLettersGuessed.add(letter);
      List wordSplit = Arrays.asList(word.split(""));
      if (wordSplit.contains(letter)) {
        returnMessage = "Letter in word";
      } else {
        returnMessage = "Letter not in word";
        mWrongGuesses += 1;
      }
    }
    return returnMessage;
  }
}
