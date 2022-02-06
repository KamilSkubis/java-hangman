package pl.edu.agh.hangman;

public class Hang {


    private String word = words[(int) (Math.random() * words.length)];
    private String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private int count = 0;

    public void hang(String guess) {
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
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
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