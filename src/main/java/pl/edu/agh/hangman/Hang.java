package pl.edu.agh.hangman;

import java.util.List;

public class Hang {

    private int count = 0;

    private boolean success = false;
    public void hang() {
        Words words = new Words("slowa.txt");
        List<String> wordsList = words.getWords();

        String word = wordsList.get((int) (Math.random() * wordsList.size()));
        String asterisk = new String(new char[word.length()]).replace("\0", "*");


        System.out.println(word);
        while (count < 7 && success != true) {
            GuessWord guessWord = new GuessWord();
            String guess = guessWord.askForLetter2();

            String newasterisk = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newasterisk += guess.charAt(0);
                } else if (asterisk.charAt(i) != '*') {
                    newasterisk += word.charAt(i);
                } else {
                    newasterisk += "*";
                }
            }

            if (asterisk.equals(newasterisk)) {
                count++;
                hangmanImage();
                System.out.println("Current game state "+ asterisk);
            } else {
                asterisk = newasterisk;
                System.out.println("Correct " + asterisk + " is included in searched word");
            }
            if (asterisk.equals(word)) {
                System.out.println("Correct! You win! The word was " + word);
                success = true;
            }
        }
    }


    public void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println("  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");

        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");

        }
        if (count == 4) {
            System.out.println("\"  +---+\\n\" +\n" +
                    "\"  |   |\\n\" +\n" +
                    "\"  O   |\\n\" +\n" +
                    "\" /|   |\\n\" +\n" +
                    "\"      |\\n\" +\n" +
                    "\"      |\\n\" +\n" +
                    "\"=========\"");

        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");

        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========");
        }
        if (count == 7) {
            System.out.println("  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========");

        }


    }
}