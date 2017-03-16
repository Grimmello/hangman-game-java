import java.io.Console;

public class App{
	public static void main(String[] args) {
		Console myConsole = System.console();
		Hangman newHangman = new Hangman();

		System.out.println("Try your luck with our hangman! Get hung! ");
		System.out.println(newHangman.hangmanGame("cat", ""));
		while(newHangman.mStillPlaying) {
			System.out.println("Enter a letter to guess! You have "+(7 - newHangman.mWrongGuesses)+ " left");
			String letter = myConsole.readLine();
			String newGuess = newHangman.hangmanGame("cat", letter);
			System.out.println(newGuess);
		}
	}
}
