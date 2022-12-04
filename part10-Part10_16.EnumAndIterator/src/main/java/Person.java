public class Person {
    private final Education education;
    private final String name;

    public Person(String name, Education education){
        this.education = education;
        this.name = name;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString(){
        return  this.name + ", " + education;
    }
}
