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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
