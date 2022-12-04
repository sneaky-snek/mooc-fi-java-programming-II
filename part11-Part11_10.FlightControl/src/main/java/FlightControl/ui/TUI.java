package FlightControl.ui;

import FlightControl.logic.Flight;
import FlightControl.logic.Place;
import FlightControl.logic.Plane;
import java.util.HashMap;
import java.util.Scanner;

public class TUI implements UserInterface {
    private final Scanner scan;
    private final HashMap<String, Plane> planes;
    private final HashMap<String, Place> places;
    private final HashMap<String, Flight> flights;

    public TUI(Scanner scan) {
        this.scan = scan;
        planes = new HashMap<>();
        places = new HashMap<>();
        flights = new HashMap<>();
    }

    @Override
    public void start() {
        airportAssetControl();
        flightControl();
    }
    public void airportAssetControl(){
        String input;
        System.out.println("Airport Asset Control");
        while (true) {
            System.out.print("[1] Add an airplane\n" +
                    "[2] Add a flight\n" +
                    "[x] Exit Airport Asset Control\n");
            input = scan.nextLine();
            if (input.equals("x")) {
                return;
            }
            if(input.equals("")){
                return;
            }
            if (Integer.valueOf(input) > 0) {
                switch (Integer.valueOf(input)) {
                    case 1:
                        this.airplaneAdd();
                        break;
                    case 2:
                        this.flightAdd();
                        break;
                }
            }
        }
    }

    @Override
    public void airplaneAdd() {
        System.out.print("Give the airplane id:");
        String planeID = scan.nextLine();
        System.out.print("Give the airplane capacity:");
        int planeCapacity = Integer.valueOf(scan.nextLine());
        Plane plane = new Plane(planeID, planeCapacity);
        planes.put(planeID, plane);
    }

    @Override
    public void flightAdd() {
        System.out.print("Give the airplane id: ");
        String planeID = scan.nextLine();
        System.out.print("Give the departure airport id: ");
        String departPlace = scan.nextLine();
        System.out.print("Give the target airport id: ");
        String targetAirport = scan.nextLine();

        places.putIfAbsent(departPlace, new Place(departPlace));
        places.putIfAbsent(targetAirport, new Place(targetAirport));

        Flight flight = new Flight(planes.get(planeID), places.get(departPlace), places.get(targetAirport));
        flights.put(flight.toString(), flight);
    }

    private void flightControl() {
        String input;
        System.out.println("Flight Control");

        while(true){
            System.out.print("[1] Print airplanes\n" +
                    "[2] Print flights\n" +
                    "[3] Print airplane details\n" +
                    "[x] Quit\n");
            input = scan.nextLine();
            if(input.equals("x")){
                return;
            }
            switch (Integer.valueOf(input)){
                case 1:
                    listAirplanes();
                    break;
                case 2:
                    listFlights();
                    break;
                case 3:
                    listPlane();
                    break;
            }
        }
    }

    public void listAirplanes() {
        planes.values().stream()
                .forEach(System.out::println);
    }

    public void listFlights(){
        flights.values().stream()
                .forEach(System.out::println);
    }

    public void listPlane(){
        System.out.print("Give the airplane id: ");
        String input = scan.nextLine();
        System.out.println(planes.get(input));
    }

}
