package my.first.pak;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTetst {

  @Test
  public void testDistance() {
    Point p1 = new Point(1,2);
    Point p2 = new Point(1,4);
    Assert.assertEquals(p1.distance(p2), 2);
  }
}
