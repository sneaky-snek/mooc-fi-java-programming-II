package FlightControl.logic;

public class Flight {
    private final Plane plane;
    private final Place departure;
    private final Place destination;


    public Flight(Plane airPlane, Place departureAirport, Place destinationAirport){
        plane = airPlane;
        departure = departureAirport;
        destination = destinationAirport;
    }

  /*  public Plane getPlane(){
       return plane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getDestination() {
        return destination;
    }*/

    @Override/* PLANE (DEPARTURE - DESTINATION) */
    public String toString(){
        return plane + " (" + departure + "-" + destination + ")";
    }
}
