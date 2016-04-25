import org.junit.*;
import static org.junit.Assert.*;

public class test {

  @Test
  public void costToShip_i_i() {
  Parcel parcel = new Parcel();
  String expected = "" ;
  assertEquals(expected, Parcel.costToShip());
  }

}
