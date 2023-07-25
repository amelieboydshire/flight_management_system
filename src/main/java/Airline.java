import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airline {

    private ArrayList<Flight> flightList;

    public Airline() {
        this.flightList = new ArrayList<>();
    }

    public ArrayList<Flight> getFlights() {
        return flightList;
    }

    public void setFlights(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public void addFlight (Flight flight){
        flightList.add(flight);
    }

    public void cancelFlight(Flight flight){
        flightList.remove(flight);
    }

    public void displayAvailableFlights() {
        System.out.println(flightList);
    }
}
