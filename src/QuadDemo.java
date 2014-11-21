

/**
 * Created by dwight on 11/21/14.
 */
public class QuadDemo {
    public static void main(String[] args) {
        Quadrilateral box = new Quadrilateral(new Point(0, 0), new Point(2, 2), new Point(2, 0), new Point(0, 2));

        System.out.println(box);
        System.out.println(box.getDistance(box.getPoint2(), box.getPoint3()));
        System.out.println(box.getDistance(box.getPoint2(), box.getPoint4()));

    }
}
