package Coordinate;

import java.util.List;

public class Triangle extends AbstractFigure {
	public static final int TRIANGLE_POINT_SIZE = 3;

	public Triangle(List<Point> points) {
		super(points);
	}

	@Override
	public int size() {
		return TRIANGLE_POINT_SIZE;
	}

	@Override
	public String getName() {
		return "삼각형";
	}

	@Override
	public double area() {
		Point point1 = getPoints().get(0);
		Point point2 = getPoints().get(1);
		Point point3 = getPoints().get(2);

		double firstSide = point1.getDistance(point2);
		double secondSide = point2.getDistance(point3);
		double thirdSide = point3.getDistance(point1);

		return calculateWithFormulaOfHeron(firstSide, secondSide, thirdSide);
	}

	private double calculateWithFormulaOfHeron(double firstSide, double secondSide, double thirdSide) {
		double s = (firstSide + secondSide + thirdSide) / 2;

		return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
	}
}
