import java.util.ArrayList;

public class Flight {
    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengerList;

    public Flight(String destination, int flightId) {
        this.destination = destination;
        this.flightId = flightId;
        this.passengerList = new ArrayList<>();
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
        return passengerList;
    }

    public void bookPassenger (Passenger passenger){
        passengerList.add(passenger);
    }

}
