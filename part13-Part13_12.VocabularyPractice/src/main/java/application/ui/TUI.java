package application.ui;

import application.logic.Dictionary;

import java.util.Random;
import java.util.Scanner;

public class TUI {
    private Dictionary dictionary;
    private Scanner scan;

    public TUI(){
        this.dictionary = new Dictionary();
        scan = new Scanner(System.in);
    }


    public void start() {
        System.out.println("Welcome to the Dictionary app!");
        while (true){
            System.out.println("   Options: \n" +
                    "    1- Add  word\n" +
                    "    2- Practice your vocabulary! (Get a random word to translate)\n" +
                    "    3- Exit\n" +
                    "    ");
            System.out.print("> ");
            String input = scan.nextLine();

            switch (input){
                case "1":
                    addWord();
                    break;
                case "2":
                    translateRandomWord();
                    break;
                case "3":
                    return;
            }


        }

    }


    public void addWord() {
        System.out.print("Insert word to add: ");
        String word = scan.nextLine();

        System.out.print("Insert " + word + " meaning: ");
        String translation = scan.nextLine();

        dictionary.add(word, translation);
    }

    public void translateRandomWord() {
        Random random = new Random();
        int rng = random.nextInt(1 - 0 + 1) + 0;

        String[] words = dictionary.getRandomWord();

        System.out.print("Translate the word '" + words[rng] + "':");
        String answer = scan.nextLine().toLowerCase().trim();

        boolean translatedCorrectly = false;

        if(answer.equals(words[0]) || answer.equals(words[1])){
            translatedCorrectly = true;
        }

        if (translatedCorrectly){
            System.out.println("Correct!");
            return;
        }

        System.out.printf("dumb fucko");
    }
}
