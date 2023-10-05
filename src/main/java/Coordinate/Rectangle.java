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
		return 0;
	}

	@Override
	public Figure create(List<Point> points) {
		if(points.size() == Rectangle.RECTANGLE_POINT_SIZE) {
			return new Rectangle(points);
		}

		throw new IllegalArgumentException("유효하지 않은 도형입니다.");
	}
}
