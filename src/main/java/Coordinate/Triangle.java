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

		double a = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
		double b = Math.sqrt(Math.pow(point1.getX() - point3.getX(), 2) + Math.pow(point1.getY() - point3.getY(), 2));
		double c = Math.sqrt(Math.pow(point2.getX() - point3.getX(), 2) + Math.pow(point2.getY() - point3.getY(), 2));

		return Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b -c)) / 4;
	}
}
