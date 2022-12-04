public class CD implements Packable{
    private String artist;
    private String name;
    private int year;
    private double weight;

    public CD(String artist, String name, int year){
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.weight = 0.1;

    }


    public double weight() {
        return this.weight;
    }
    // [author]: [name] [(year)]
    public String toString(){
        return artist + ": "+ name + " (" + year + ")";
    }
}
