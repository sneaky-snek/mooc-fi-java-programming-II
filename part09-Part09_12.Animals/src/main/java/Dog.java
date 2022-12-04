public class Dog extends Animal implements NoiseCapable{

    public Dog(String name){
        super(name);
    }
    public Dog(){
        super("Dog");
    }
    public void bark(){
        // System.out.println("WOOF WOOF"); not the expected implementation :c
        System.out.println(getName() + " barks");
    }
    public void makeNoise(){
        this.bark();
    }

}
