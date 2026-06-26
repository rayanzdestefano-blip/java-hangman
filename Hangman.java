import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class RayanHangman {
    private static ArrayList<String> wordData;
    static Scanner scan = new Scanner(System.in);
    private static String word;


    public static boolean welcome() {
        System.out.println("Welcome to Hangman!");
        System.out.println("Would you like to play? yes/no");
        String result = scan.nextLine().toLowerCase();
        return result.equals("yes");
    }


    public static String random() {
        int ran = (int)(Math.random() * wordData.size());
        return wordData.get(ran).toLowerCase();
    }


    public static String makeHint(String word, String guessed) {
        String hint = "";


        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            if (guessed.contains(letter)) {
                hint += letter + " ";
            } else {
                hint += "_ ";
            }
        }


        return hint;
    }


    public static void start() {
        if (!welcome()) {
            System.out.println("Maybe next time.");
            return;
        }


        word = random();
        String guessed = "";
        int lives = 6;


        while (lives > 0) {
            System.out.println("\nHint: " + makeHint(word, guessed));
            System.out.println("Lives left: " + lives);
            System.out.print("Guess a letter: ");


            String guess = scan.nextLine().toLowerCase();


            if (guess.length() != 1) {
                System.out.println("Type one letter.");
                continue;
            }


            if (guessed.contains(guess)) {
                System.out.println("Already guessed.");
                continue;
            }


            guessed += guess;


            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
                lives--;
            }


            if (makeHint(word, guessed).replace(" ", "").equals(word)) {
                System.out.println("\nYou won! The word was " + word);
                return;
            }
        }


        System.out.println("\nYou lost! The word was " + word);
    }


    public static void main(String[] args) throws IOException {
        wordData = new ArrayList<String>();
        File file = new File("wordlist.txt");
        Scanner fileScan = new Scanner(file);


        while (fileScan.hasNext()) {
            wordData.add(fileScan.next());
        }


        fileScan.close();
        start();
    }
}


