package FlightControl.logic;

public class Plane {
    private final String ID;
    private final int capacity;

    public Plane(String ID, int capacity){
        this.ID = ID;
        this.capacity = capacity;
    }

  /*  public String getID(){
        return ID;
    }
    public int getCapacity() {
        return capacity;
    } */

    @Override /*[ID] ([CAPACITY] capacity)*/
    public String toString(){
        return ID + " (" + capacity + " capacity)";
    }
}
