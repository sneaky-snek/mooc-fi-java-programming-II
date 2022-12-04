package dictionary;

public class Word {
    public String word;
    public String sana;

    public Word(String englishWord, String finishWord){
        word = englishWord;
        sana = finishWord;
    }

    public String getWord() {
        return word;
    }

    public String getSana() {
        return sana;
    }

    @Override
    public String toString(){
        return word + ":" + sana;
    }
}
