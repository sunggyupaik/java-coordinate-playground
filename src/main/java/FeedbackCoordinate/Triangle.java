package FeedbackCoordinate;

import java.util.List;

public class Triangle extends AbstractFigure {
	public final static int TRIANGLE_SIZE = 3;

	public Triangle(List<Point> points) {
		super(points);
	}

	@Override
	public String getName() {
		return "삼각형";
	}

	@Override
	public int size() {
		return TRIANGLE_SIZE;
	}

	@Override
	public double area() {
		List<Point> points = getPoints();
		Point point1 = points.get(0);
		Point point2 = points.get(1);
		Point point3 = points.get(2);

		double firstSide = point1.getDistanceFrom(point2);
		double secondSide = point2.getDistanceFrom(point3);
		double thirdSide = point3.getDistanceFrom(point1);

		return calculateAreaWithHeronFormula(firstSide, secondSide, thirdSide);
	}

	private double calculateAreaWithHeronFormula(double firstSide, double secondSide, double thirdSide) {
		double s = (firstSide + secondSide + thirdSide) / 2;

		return Math.sqrt(s * (s-firstSide) * (s-secondSide) * (s-thirdSide))/2;
	}
}
