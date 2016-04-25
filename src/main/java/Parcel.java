import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Parcel {


  private Integer mParcelWeight;
  private Integer mHeight;
  private Integer mWidth;
  private Integer mDepth;

  public Parcel(Integer weight, Integer height, Integer width, Integer depth){
    mParcelWeight = weight;
    mHeight = height;
    mWidth = width;
    mDepth = depth;
  }

  public Integer weight() {
    return mParcelWeight;
  }

  public Integer volume() {
    return mHeight * mWidth * mDepth;
  }

  public Integer costToShip() {
    Integer weightCost = mParcelWeight * 2;
    Integer volumeCost = volume() * 2;
    Integer totalCost = weightCost + volumeCost;
    return totalCost;
  }
}
