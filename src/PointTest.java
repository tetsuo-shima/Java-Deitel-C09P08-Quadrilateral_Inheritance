import org.junit.Before;
import org.junit.Test;

/**
 * Created by dwight on 11/19/14.
 */
public class PointTest {
    private Point point1 = new Point();
    private Point point2 = new Point(3, 4);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetX() throws Exception {
        assert(point1.getX() == 0);
        assert(point2.getX() == 3);
    }

    @Test
    public void testGetY() throws Exception {
        assert(point1.getY() == 0);
        assert(point2.getY() == 4);
    }

    @Test
    public void testSetX() throws Exception {
        point1.setX(5);
        assert(point1.getX() == 5);
    }

    @Test
    public void testSetY() throws Exception {
        point1.setY(7.2);
        assert(point1.getY() == 7.2);
    }

    @Test
    public void testToString() throws Exception {
        assert(point1.toString().equals("X Coordinate: " + point1.getX() + "\nY Coordinate: " + point1.getY()));
    }
}
