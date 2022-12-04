
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        Book WoK = new Book("Brandon Sanderson","The Way of Kings", 2.0);
        Book WoR = new Book("Brandon Sanderson", "Words of Radiance", 1.8);
        Book OB = new Book("Brandon Sanderson", "OathBringer", 1.9);
        Book Dawnshard = new Book("Brandon Sanderson", "Dawnshard", 0.6);
        Book RoW = new Book("Brandon Sanderson", "Rhythm of War", 2.0);


        Box bigBox = new Box(20);
        Box box = new Box(10);
        bigBox.add(box);
        System.out.println(bigBox);
        box.add( new Book("Horstman", "Core Java",5) );
        bigBox.weight();
        System.out.println(bigBox);

    }

}
