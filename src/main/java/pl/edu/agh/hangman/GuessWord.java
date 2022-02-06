package pl.edu.agh.hangman;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class GuessWord {

	Scanner scanner;
	Set<String> guessedWords = new HashSet<>();

	public GuessWord() {
		scanner = new Scanner(System.in);
	}

	public String askForLetter() {

		String userGuess = null;

		do {
			System.out.println("Guess letter");
			userGuess = String.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0));

			if (guessedWords.contains(userGuess)) {
				System.out.println("You already picked that letter " + userGuess);
			}}
			while (!guessedWords.contains(userGuess));
			guessedWords.add(userGuess);

		return userGuess;

		}

		public String askForLetter2(){
			System.out.println("Guess letter");
			String userGuess = scanner.nextLine().toUpperCase(Locale.ROOT);

			return userGuess;

	}


	}
