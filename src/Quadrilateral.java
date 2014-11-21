import java.util.LinkedList;

/**
 * Created by dwight on 11/19/14.
 */
public class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private LinkedList<Point> quad;

    public Quadrilateral(Quadrilateral quadrilateral) {
        this(quadrilateral.getPoint1(), quadrilateral.getPoint2(), quadrilateral.getPoint3(),
                quadrilateral.getPoint4());
    }

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        quad = setQuad(point1, point2, point3, point4);
        this.point1 = quad.get(0);
        this.point2 = quad.get(1);
        this.point3 = quad.get(2);
        this.point4 = quad.get(3);

    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public LinkedList<Point> getQuad() {
        return quad;
    }

    //public double getArea();

    public double getPerimeter() {
        double segment1 = getDistance(quad.get(0), quad.get(1));
        double segment2 = getDistance(quad.get(1), quad.get(2));
        double segment3 = getDistance(quad.get(2), quad.get(3));
        double segment4 = getDistance(quad.get(3), quad.get(1));

        return segment1 + segment2 + segment3 + segment4;
    }

    private LinkedList setQuad(Point A, Point B, Point C, Point D) {
        LinkedList<Point> points = new LinkedList<Point>();
        double currentDistance;
        double newDistance;

        points.add(A);
        points.add(B);
        points.add(C);
        points.add(D);

        for (int x = 0; x < points.size() - 2; x++) {
            Point start = points.get(x);
            for (int y = x + 1; y < points.size() - 1; y++) {
                currentDistance = getDistance(start, points.get(y));
                newDistance = getDistance(start, points.get(y + 1));

                if (newDistance < currentDistance) {
                    points.add(x + 1, points.remove(y + 1));
                }
            }
        }

        return points;
    }

    public double getDistance(Point pointA, Point pointB) {
        double distanceX = pointA.getX() - pointB.getX();
        double distanceY = pointA.getY() - pointB.getY();

        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    @Override
    public String toString() {
        String p1 = "Point 1: (" + point1.getX() + ", " + point1.getY() + ")\n";
        String p2 = "Point 2: (" + point2.getX() + ", " + point2.getY() + ")\n";
        String p3 = "Point 3: (" + point3.getX() + ", " + point3.getY() + ")\n";
        String p4 = "Point 4: (" + point4.getX() + ", " + point4.getY() + ")";

        return p1 + p2 + p3 + p4;
    }
}
