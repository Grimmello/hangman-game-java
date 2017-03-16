import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HangmanTest {
  @Test public void newGame_determineOneLetterWord_true(){
    Hangman testHangman = new Hangman();
    assertEquals("Letter in word", testHangman.hangmanGame("a", "a"));
  }
  @Test public void newGame_determineOneLetterWord_false(){
    Hangman testHangman = new Hangman();
    assertEquals("Letter not in word", testHangman.hangmanGame("a", "b"));
  }
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
