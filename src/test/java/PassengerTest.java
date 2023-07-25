import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

  private Passenger passenger1;
  private Passenger passenger2;

  @BeforeEach
    public void setUp() {
      passenger1 = new Passenger("Amelie", "07584486189", 1 );
      passenger2 = new Passenger("Hannah", "07587738951", 2);
  }

  @Test
  public void canGetName() {
    assertThat(passenger1.getName()).isEqualTo("Amelie");
  }

  @Test
  public void canSetName() {
    passenger1.setName("Joe");
    assertThat(passenger1.getName()).isEqualTo("Joe");
  }

  @Test
  public void canGetContactNumber() {
    assertThat(passenger1.getContactNumber()).isEqualTo("07584486189");
  }

  @Test
  public void canSetContactNumber() {
    passenger1.setContactNumber("07584586189");
    assertThat(passenger1.getContactNumber()).isEqualTo("07584586189");
  }

  @Test
  public void canGetPassengerId() {
    assertThat(passenger1.getPassengerId()).isEqualTo(1);
  }

  @Test
  public void canSetPassengerId() {
    passenger1.setPassengerId(3);
    assertThat(passenger1.getPassengerId()).isEqualTo(3);
  }

}
