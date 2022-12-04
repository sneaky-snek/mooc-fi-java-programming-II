
public class Book {
    private final String name;
    private final int recomendedAge;

    public Book(String[] parts){
        name = parts[0].trim();
        recomendedAge = Integer.valueOf(parts[1]);
    }

    public String getName(){
        return name;
    }

    public int getRecomendedAge(){
        return recomendedAge;
    }

    @Override
    /* The Ringing Lullaby Book (recommended for 0 year-olds or older)
    *  [NAME] (recommended for [recomendedAge] year-olds or older); */
    public String toString(){
        return name + "(recommended for " + recomendedAge + " year-olds or older)";
    }

}
