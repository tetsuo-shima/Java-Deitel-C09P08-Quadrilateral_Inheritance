import org.junit.Before;
import org.junit.Test;

/**
 * Created by dwight on 11/21/14.
 */
public class QuadrilateralTest {
    Quadrilateral box = new Quadrilateral(new Point(0, 0), new Point(0, 2), new Point(2, 0), new Point(2, 2));

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetPoint1() throws Exception {
        assert(box.getPoint1().getX() == 0);
        assert(box.getPoint1().getY() == 0);
    }

    @Test
    public void testGetPoint2() throws Exception {

    }

    @Test
    public void testGetPoint3() throws Exception {
        assert(box.getPoint3().getY() == 0);
    }

    @Test
    public void testGetPoint4() throws Exception {

    }

    @Test
    public void testGetQuad() throws Exception {

    }

    @Test
    public void testGetArea() throws Exception {

    }

    @Test
    public void testGetPerimeter() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}