import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airline {

    private ArrayList<Flight> flights;

    public Airline(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
