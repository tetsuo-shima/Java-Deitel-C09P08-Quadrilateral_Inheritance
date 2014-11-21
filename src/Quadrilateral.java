/**
 * Created by dwight on 11/19/14.
 */
public abstract class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral() {
        this(new Point(), new Point(), new Point(), new Point());
    }

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
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

    public void setPoint1(Point point) {
        point1 = point;
    }

    public void setPoint2(Point point) {
        point2 = point;
    }

    public void setPoint3(Point point) {
        point3 = point;
    }

    public void setPoint4(Point point) {
        point4 = point;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        String p1 = "Point 1: (" + point1.getX() + ", " + point1.getY() + ")\n";
        String p2 = "Point 2: (" + point2.getX() + ", " + point2.getY() + ")\n";
        String p3 = "Point 3: (" + point3.getX() + ", " + point3.getY() + ")\n";
        String p4 = "Point 4: (" + point4.getX() + ", " + point4.getY() + ")";

        return p1 + p2 + p3 + p4;
    }
}
