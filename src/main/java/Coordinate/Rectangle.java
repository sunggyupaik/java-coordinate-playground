package Coordinate;

import java.util.List;

public class Rectangle extends AbstractFigure {
	public static final int RECTANGLE_POINT_SIZE = 4;

	public Rectangle(List<Point> points) {
		super(points);
	}

	@Override
	public int size() {
		return RECTANGLE_POINT_SIZE;
	}

	@Override
	public String getName() {
		return "사각형";
	}

	@Override
	public double area() {
		Point point1 = getPoints().get(0);
		Point point2 = getPoints().get(1);
		Point point3 = getPoints().get(2);
		Point point4 = getPoints().get(3);

		int width = Math.max(Math.abs(point1.getX() - point2.getX()), Math.abs(point1.getX() - point3.getX()));
		int height = Math.max(Math.abs(point1.getY() - point2.getY()), Math.abs(point1.getY() - point3.getY()));

		return width * height;
	}
}
