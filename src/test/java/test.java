import org.junit.*;
import static org.junit.Assert.*;
import java.text.*;

public class test {

  @Test
  public void volume_testVolumeMethodWithInputsOf2_8() {
  Parcel parcel = new Parcel(1.0d, 2.0d, 2.0d, 2.0d);
  Double expected = 8.00 ;
  assertEquals(expected, parcel.volume());
  }

  @Test
  public void totalCost_weightOneAllSidesTwo_return() {
  Parcel parcel = new Parcel(1.0d, 2.0d, 2.0d, 2.0d);
  Double expected =  18.00 ;
  assertEquals(expected, parcel.costToShip());
  }

  // @Test
  // public void totalCost_withGiftWrap_24() {
  // Parcel parcel = new Parcel(1, 2, 2, 2);
  // Integer expected =  24;
  // assertEquals(expected, parcel.giftWrapSurfaceArea());
  // }


}
