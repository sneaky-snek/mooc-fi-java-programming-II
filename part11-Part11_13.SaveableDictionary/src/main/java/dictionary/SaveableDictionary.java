package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary{

    private final HashMap<String, Word> words;
    private String file;


    public SaveableDictionary(){
        words = new HashMap<>();

    }
    public SaveableDictionary(String file){
        words = new HashMap<>();
        this.file = file;

    }

    public boolean load() {
        Scanner fileReader;
        boolean output = false;

        try {
            fileReader = new Scanner(Paths.get(file));
        } catch (IOException e) {
            System.out.println(e);
            return output;
        }


        if(fileReader.hasNextLine()){
            output = true;
        }
        while (fileReader.hasNextLine()) {
            String word = fileReader.nextLine();
            String[] parts = word.split(":");

            add(parts[0], parts[1]);
        }

        return output;


    }


    public boolean save(){
        boolean output = false;
        FileWriter printer;

        try {
           printer = new FileWriter(file);
           for (Word element: words.values()){
               printer.write(element.toString());
               printer.write("\n");
           }
           printer.close();
           output = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return output;
    }


    public void add(String words, String translation){
        Word word = new Word(words, translation);

        this.words.putIfAbsent(words, word);
    }

/* spaghetti */
    public String translate(String word) {
        if (words.containsKey(word)) {
            return words.get(word).getSana();
        }
        for(String element: words.keySet()){
            if(word.equals(words.get(element).getSana())){
                return words.get(element).getWord();
            }
        }
        return null;
    }

    public void delete(String word){
        int size = words.size();
        words.remove(word);
        if(size == words.size()){
            words.remove(translate(word));
        }
        // this is so stupid lmfao //
    }


}
