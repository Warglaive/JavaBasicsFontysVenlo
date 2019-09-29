
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if (this.word.contains(letter)) {
            if (!this.guessedLetters.contains(letter)) {
                this.guessedLetters += letter;
            }
        } else {
            if (!this.guessedLetters.contains(letter)) {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
        }
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String result = "";
        if (this.guessedLetters().isEmpty()) {
            for (int i = 0; i < this.word.length(); i++) {
                result += "_";
            }
            return result;
        }
        //TOP Comment -> build it, not delete.
        String hiddenWord = this.word;
        // create the hidden word by interating through this.word letter by letter
        for (int i = 0; i < this.word.length(); i++) {
            String guessedLetters = this.guessedLetters();
            String letter = this.word.charAt(i) + "";
            if (guessedLetters.contains(letter)) {
                result += letter;
            } else {
                hiddenWord = hiddenWord.replace(letter, "_");
            }
        }
        // if the letter in turn is within the guessed letters, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        return hiddenWord;
    }
}
