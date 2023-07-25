import java.util.ArrayList;

public class Flight {
    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengerList;

    public Flight(String destination, int flightId, ArrayList<Passenger> passengerList) {
        this.destination = destination;
        this.flightId = flightId;
        this.passengerList = passengerList;
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

    public void setPassengers(ArrayList<Passenger> passengerList) {
        this.passengerList  = passengerList;
    }

    public void addPassenger (Passenger passenger){
        passengerList.add(passenger);
    }

}
