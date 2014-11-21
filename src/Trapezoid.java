import java.util.ArrayList;
import java.util.List;

/**
 * Created by dwight on 11/19/14.
 */
public class Trapezoid extends Quadrilateral {

    private LineSegment AB;
    private LineSegment BC;
    private LineSegment CD;
    private LineSegment DA;


    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super();

        if (!isTrapezoid(point1, point2, point3, point4)) {
            throw new IllegalArgumentException("Points do not form a trapezoid.");
        }

        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
        setPoint4(point4);
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    private boolean isTrapezoid(Point point1, Point point2, Point point3, Point point4) {
        Point[] points = new Point[] {point1, point2, point3, point4};
        double[] slopeArray = new double[3];
        boolean trapezoid = false;
        slopeArray[0] = getSlope(point2, point3);
        slopeArray[1] = getSlope(point2, point4);
        slopeArray[2] = getSlope(point3, point4);


        for (int x = 0; x < points.length - 1; x++){
            Point A = points[0];
            Point B = points[x + 1];
            double slope = getSlope(A, B);

            if (slope == slopeArray[0]) {
                AB = new LineSegment(A, B);
                CD = new LineSegment(point2, point3);
                trapezoid = true;
            }
            else if (slope == slopeArray[1]) {
                AB = new LineSegment(A, B);
                CD = new LineSegment(point2, point4);
                trapezoid = true;
            }
            else if (slope == slopeArray[2]) {
                AB = new LineSegment(A, B);
                CD = new LineSegment(point3, point4);
                trapezoid = true;
            }
        }

        return trapezoid;
    }

    private double getSlope(Point pointA, Point pointB) {
        double numerator = pointA.getY() - pointB.getY();
        double denominator = pointA.getX() - pointB.getX();

        return numerator / denominator;
    }

    private double getDistance(Point pointA, Point pointB) {
        double distanceX = pointA.getX() - pointB.getX();
        double distanceY = pointA.getY() - pointB.getY();

        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    /*
    private LineSegment shortestSegment(Point A, Point B, Point C) {
        LineSegment segment;
        double distance1 = getDistance(A, B);
        double distance2 = getDistance(A, C);

        if (distance1 < distance2) {
            segment = new LineSegment(A, B);
        }
        else {
            segment = new LineSegment(A, C);
        }

        return segment;
    }

    public double getPerimeter() {
        double distance12 = getDistance(getPoint1(), getPoint2());
        double distance23 = getDistance(getPoint2(), getPoint3());
        double distance34 = getDistance(getPoint3(), getPoint4());
        double distance41 = getDistance(getPoint4(), getPoint1());

        return distance12 + distance23 + distance34 + distance41;
    }
    */
}
