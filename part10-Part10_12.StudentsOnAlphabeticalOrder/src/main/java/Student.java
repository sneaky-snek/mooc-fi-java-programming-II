

public class Student implements Comparable{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Object o){
        Student compared = (Student) o;
        return compareTo(compared);

    }
    public int compareTo(Student compared) {
        return this.name.compareToIgnoreCase(compared.getName());
    }
}
