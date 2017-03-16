
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Hangman{
  public Integer mWrongGuesses = 0 ;
  private List<String> mLettersGuessed = new ArrayList<String>();
  private String mWord;
  private String mDashesString = "";
  public boolean mStillPlaying = true;

// Return String of letters and dashes, showing letters that were guessed correctly, and also blanks for letters that have not been guessed yet
  public String hangmanGame (String word, String letter){
    if (mWrongGuesses < 6) {
      if (mDashesString.length() > 0) {
        if(mLettersGuessed.contains(letter)){
          return mDashesString;
        } else{
          mLettersGuessed.add(letter);
          List wordSplit = Arrays.asList(word.split(""));
          if (wordSplit.contains(letter)) {
            Integer indexWord = word.indexOf(letter);
            char letterChar = letter.charAt(0);
            char[] dashesCharArray = mDashesString.toCharArray();
            dashesCharArray[indexWord] = letterChar;
            mDashesString = String.valueOf(dashesCharArray);
            if(mDashesString.equals(word)) {
              mDashesString = "Yay the word was: " + word;
              mStillPlaying = false;
              return mDashesString;
            }
            return mDashesString;
          } else {
          mWrongGuesses += 1;
          return mDashesString;
          }
        }
      } else {
        String dashString = word.replaceAll(".", "_");
        mDashesString = dashString;
        return mDashesString;
      }

    }
    else {
      mDashesString = "Game over. The word was: "+ word;
      mStillPlaying = false;
      return mDashesString;
    }
  }
}
