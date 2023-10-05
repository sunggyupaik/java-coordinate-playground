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
		return 0;
	}

	@Override
	public Figure create(List<Point> points) {
		if(points.size() == Triangle.TRIANGLE_POINT_SIZE) {
			return new Triangle(points);
		}

		throw new IllegalArgumentException("유효하지 않은 도형입니다.");
	}
}
