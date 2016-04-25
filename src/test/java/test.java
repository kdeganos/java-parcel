import org.junit.*;
import static org.junit.Assert.*;

public class test {

  @Test
  public void volume_testVolumeMethodWithInputsOf2_eight() {
  Parcel parcel = new Parcel(1, 2, 2, 2);
  Integer expected = 8 ;
  assertEquals(expected, parcel.volume());
  }

  @Test
  public void totalCost_weightOneAllSidesTwo_return() {
  Parcel parcel = new Parcel(1, 2, 2, 2);
  Integer expected =  18;
  assertEquals(expected, parcel.costToShip());
  }
}
