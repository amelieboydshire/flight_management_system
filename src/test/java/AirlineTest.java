import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AirlineTest {

    private ArrayList<Flight> flightList;

    @BeforeEach
    public void setUp(){
        Flight flight1 = new Flight("Spain", 1);
        Flight flight2 = new Flight("Portugal", 2);
        flightList.add(flight1);
        flightList.add(flight2);
    }

    @Test
    public void canGetFlights(){

    }
}
