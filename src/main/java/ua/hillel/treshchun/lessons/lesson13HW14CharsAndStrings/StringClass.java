package ua.hillel.treshchun.lessons.lesson13HW14CharsAndStrings;

import java.util.Scanner;

public class StringClass {

    public String readWord() {
        Scanner scanner = new Scanner(System.in);
        String scannnedString;
        while (!scanner.hasNextLine()) {
            System.out.println("Please enter a valid string");
        }
        scannnedString = scanner.nextLine();
        while (scannnedString.isEmpty() || scannnedString.isBlank()) {
            System.out.println("Please enter a valid string: ");
            scannnedString = scanner.nextLine();
        }
        return scannnedString;
    }

    public int findSymbolOccurance(String str, char chr) {
        return (int) str.chars().filter(c -> c == chr).count();
    }

    public int findWordPosition(String source, String target) {
        return source.lastIndexOf(target);
    }

    public String stringReverse(String inputStr) {
        StringBuilder result = new StringBuilder();
        for (int i = inputStr.length() - 1; i > -1; i--) {
            result.append(inputStr.charAt(i));
        }
        return result.toString();
    }

    public boolean isPalindrome(String inputStr) {
        for (int i = 0; i < inputStr.length() / 2; i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - (i + 1))) return false;
        }
        return true;
    }

    public void guessGame() {
        boolean gameWon = false;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String randomWord = words[(int) (Math.random() * words.length)];
        System.out.println("Welcome to \"Guess a word\" game! Enter your guess: ");
        while (!gameWon) {
            String guess = readWord().toLowerCase();
            StringBuilder guessedPart = new StringBuilder("###############");
            if (!guess.equals(randomWord)) {
                for (int i = 0; i < guess.length(); i++) {
                    if (guess.charAt(i) == randomWord.charAt(i)) {
                        guessedPart.setCharAt(i, guess.charAt(i));
                    } else {
                        break;
                    }
                }
                System.out.println("Your guess is wrong! Here is how close you were: "
                        + guessedPart + "\nEnter your guess: ");
            } else {
                gameWon = true;
                System.out.println("Congratulations, you guessed right!");
            }
        }
        System.out.println("Game over! Tank you for playing.");
    }
}
