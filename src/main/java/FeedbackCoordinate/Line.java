package FeedbackCoordinate;

import java.util.List;

public class Line extends AbstractFigure {
	public final static int LINE_SIZE = 2;

	public Line(List<Point> points) {
		super(points);
	}

	@Override
	public String getName() {
		return "선";
	}

	@Override
	public int size() {
		return LINE_SIZE;
	}

	@Override
	public double area() {
		List<Point> points = getPoints();
		Point point1 = points.get(0);
		Point point2 = points.get(1);

		return point1.getDistanceFrom(point2);
	}
}
