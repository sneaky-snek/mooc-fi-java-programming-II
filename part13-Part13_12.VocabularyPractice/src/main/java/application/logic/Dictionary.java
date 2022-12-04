package application.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Dictionary {

    private final HashMap<String, String> translations;
    private final ArrayList<String> words;


    public Dictionary() {
        this.translations = new HashMap<>();
        this.words = new ArrayList<>();
    }

    public void add(String word, String translation) {
        word = cleaner(word);
        translation = cleaner(translation);

        if (translation.contains(word)) {
            return;
        }

        words.add(word);
        words.add(translation);

        translations.put(word, translation);
        translations.put(translation, word);
    }


    public String translate(String toTranslate){
        if (words.isEmpty()){
            return "noWordsInside";
        }
        return translations.get(cleaner(toTranslate));
    }

    public String[] getRandomWord(){
        String[] output = {"NoWordsAddedYet","NoWordsAddedYet"};

        if (words.isEmpty()){
            return output;
        }

        Random random = new Random();
        int rng = random.nextInt(words.size());




        output[0] = words.get(rng);
        output[1] = translations.get(output[0]);

        return output;
    }

    public String cleaner(String dirty){
        return dirty.toLowerCase().trim();
    }
}
