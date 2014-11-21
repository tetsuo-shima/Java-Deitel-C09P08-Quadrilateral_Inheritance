
/**
 * Created by dwight on 11/19/14.
 */
public class Trapezoid extends Quadrilateral {

    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);

        if (!isTrapezoid()) {
            throw new IllegalArgumentException("Points do not form trapezoid.");
        }
    }

    public double getArea() {
        return 0;
    }

    private boolean isTrapezoid() {
        double slopeAB = getSlope(getPoint1(), getPoint2());
        double slopeCD = getSlope(getPoint3(), getPoint4());

        if (slopeAB == slopeCD) {
            return true;
        }

        double slopeAD = getSlope(getPoint1(), getPoint4());
        double slopeBC = getSlope(getPoint2(), getPoint3());

        if (slopeAD == slopeBC) {
            return true;
        }

        return false;
    }

    private double getSlope(Point pointA, Point pointB) {
        double numerator = pointA.getY() - pointB.getY();
        double denominator = pointA.getX() - pointB.getX();

        return numerator / denominator;
    }

}
