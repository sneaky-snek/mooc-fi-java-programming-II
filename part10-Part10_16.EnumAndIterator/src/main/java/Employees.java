import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private final List<Person> employees;


    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd){
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        peopleToAdd.forEach(employees::add);
    }

    public void print(){
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()){
            Person current = iterator.next();
            if(current.getEducation().equals(education)){
                System.out.println(current);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
