/**
 * Created by dwight on 11/20/14.
 */
public class LineSegment {
    private Point start;
    private Point end;

    public LineSegment() {
        this(new Point(), new Point());
    }

    public LineSegment(LineSegment lineSegment) {
        this(lineSegment.getStart(), lineSegment.getEnd());
    }

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
