
public class Human implements Comparable {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }


    /* Implement the interface Comparable in a way, such that the overridden compareTo method sorts the humans according
     to wage from largest to smallest salary. */

    @Override
    public int compareTo(Object o) {
            return this.compareTo((Human) o);
    }

    public int compareTo(Human people) {

        if (this.wage == people.getWage()) {
            return 0;
        }
        if (this.wage > people.getWage()) {
            return -1;
        } else {
            return 1;
        }


    }
}
