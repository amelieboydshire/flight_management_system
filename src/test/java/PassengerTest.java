import org.junit.jupiter.api.BeforeEach;

public class PassengerTest {

  private Passenger passenger;

  @BeforeEach
    public void setUp() {
      passenger = new Passenger("Amelie", "07584486189", 1 );
      passenger = new Passenger("Hannah", "07587738951", 2);
  }

  


}
