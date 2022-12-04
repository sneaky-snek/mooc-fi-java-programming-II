public class Book implements Packable{
    private String author;
    private String name;
    private double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.name = title;
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }
    // [author]: [name]
    public String toString(){
        return author + ": " + name;

    }


}
