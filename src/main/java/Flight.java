import java.util.ArrayList;

public class Flight {
    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, int flightId, ArrayList<Passenger> passengers) {
        this.destination = destination;
        this.flightId = flightId;
        this.passengers = passengers;
    }

   
}
