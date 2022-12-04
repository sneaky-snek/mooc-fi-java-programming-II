package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.length() > 40 || name.length() < 1) {
            throw new IllegalArgumentException("Name Waaay too long buddy");
        }
        if(age > 120 || age < 0){
            throw new IllegalArgumentException("You can't be that old.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
