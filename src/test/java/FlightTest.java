import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    private Flight flight1;
    private Flight flight2;


    @BeforeEach
    public void setUp(){
        flight1 = new Flight("Spain", 1);
        flight2 = new Flight("Portugal", 2);
    }

    @Test
    public void canGetDestination(){
        assertThat(flight1.getDestination()).isEqualTo("Spain");
    }

    @Test
    public void canSetDestination(){
        flight1.setDestination("America");
        assertThat(flight1.getDestination()).isEqualTo("America");
    }

    @Test
    public void canGetFlightId(){
        assertThat(flight1.getFlightId()).isEqualTo(1);
    }

    @Test
    public void canSetFlightId(){
        flight1.setFlightId(3);
        assertThat(flight1.getFlightId()).isEqualTo(3);
    }

    @Test
    public void canBookPassenger(){
        Passenger passenger1 = new Passenger("Amelie", "083839239", 1);
        Passenger passenger2 = new Passenger("Hannah", "047647282", 2);
        flight1.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertThat(flight1.getPassengers().get(0)).isEqualTo(passenger1);
        assertThat(flight2.getPassengers().get(0)).isEqualTo(passenger2);
    }

}
