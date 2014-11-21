/**
 * Created by dwight on 11/19/14.
 */
public class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point() {
       this(0.0, 0.0);
    }

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getX() {
        return xCoordinate;
    }

    public double getY() {
        return yCoordinate;
    }

    public void setX(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setY(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return "X Coordinate: " + xCoordinate + "\nY Coordinate: " + yCoordinate;
    }
}
