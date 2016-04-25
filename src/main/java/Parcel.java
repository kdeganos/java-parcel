import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.*;

public class Parcel {

  DecimalFormat decimal =  new DecimalFormat("0.00");

  private Double mParcelWeight;
  private Double mHeight;
  private Double mWidth;
  private Double mDepth;
  private Double mGiftWrapArea = 0.00;


  public Parcel(Double weight, Double height, Double width, Double depth){
    mParcelWeight = weight;
    mHeight = height;
    mWidth = width;
    mDepth = depth;
  }

  public Double weight() {
    return mParcelWeight;
  }

  public Double volume() {
    return mHeight * mWidth * mDepth;
  }

  public Double costToShip() {
    Double weightCost = mParcelWeight * 2;
    Double volumeCost = volume() * 2;
    Double wrapCost = 0.0d;
    if (mGiftWrapArea > 0){
      wrapCost = mGiftWrapArea / 25 + 1;
    }
    Double totalCost = Double.parseDouble(decimal.format(weightCost + volumeCost + wrapCost));
    return totalCost;
  }

  public void giftWrapSurfaceArea() {
    mGiftWrapArea = 2*(mHeight * mWidth) + 2*(mDepth * mHeight) + 2*(mWidth * mDepth);
  }
}
