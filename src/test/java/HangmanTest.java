import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HangmanTest {
  @Test
  public void newGame_determineOneLetterWord_true(){
    Hangman testHangman = new Hangman();
    Integer resultExpected = 1;
    assertEquals(resultExpected, testHangman.hangmanGame1("a", "a"));
  }
  @Test
  public void newGame_determineOneLetterWord_false(){
    Hangman testHangman = new Hangman();
    Integer resultExpected = 2;
    assertEquals(resultExpected, testHangman.hangmanGame1("a", "b"));
  }
  @Test
  public void newGame_printLineOfDashesNoLettersGuessedCorrectly_dashes(){
    Hangman testHangman = new Hangman();
    String resultExpected = "___";
    assertEquals(resultExpected, testHangman.hangmanGame2("cat"));
  }
  // @Test
  // public void newGame_printLineOfDashesNoLettersGuessedCorrectly_spacesFilled(){
  //   Hangman testHangman = new Hangman();
  //   String resultExpected = "_ a _ ";
  //   assertEquals(resultExpected, testHangman.hangmanGame2("cat", "a", 1));
  // }





  // @Test public void newGame_determineManyLetterWord_true(){
  //   Hangman testHangman = new Hangman();
  //   assertEquals(true, testHangman.letterInWord("cat", "a"));
  // }
  // @Test public void newGame_addLettersGuessedToArray_Array(){
  //   Hangman testHangman = new Hangman();
  //   List<String> testList = new ArrayList<String>();
  //   testList.add("a");
  //   assertEquals(testList, testHangman.lettersGuessed("a"));
  // }
  // @Test public void newGame_ifLetterAlreadyGuessed_False(){
  //   Hangman testHangman = new Hangman();
  //   assertEquals(false, testHangman.letterAlreadyGuessed("a"));
  // }
  // @Test public void newGame_ifLetterAlreadyGuessed_True(){
  //   Hangman testHangman = new Hangman();
  //   List<String> testList = new ArrayList<String>();
  //   testHangman.lettersGuessed("a");
  //   assertEquals(true, testHangman.letterAlreadyGuessed("a"));
  // }
  // @Test public void newGame_howManyWrongGuessed_1(){
  //   Hangman testHangman = new Hangman();
  //   testHangman.lettersGuessed
  //   assertEquals(1, testHangman.howManyWrong());
  // }
}
