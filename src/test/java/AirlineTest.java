import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;
    Flight flight1;

    @BeforeEach
    public void setUp(){
        airline = new Airline();
        flight1 = new Flight("Spain", 3);
        airline.addFlight(flight1);
    }

    @Test
    public void canAddFlights(){
        Flight flight2 = new Flight("Portugal", 2);
        airline.addFlight(flight2);
        assertThat(airline.getFlights().get(1)).isEqualTo(flight2);

    }

    @Test
    public void canCancelFlights() {
        airline.cancelFlight(flight1);
        assertThat(airline.getFlights().size()).isEqualTo(0);
    }

   
}
