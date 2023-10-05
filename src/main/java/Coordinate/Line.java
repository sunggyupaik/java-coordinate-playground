package Coordinate;

import java.util.List;

public class Line extends AbstractFigure {
	public static final int LINE_POINT_SIZE = 2;

	public Line(List<Point> points) {
		super(points);
	}

	@Override
	public int size() {
		return LINE_POINT_SIZE;
	}

	@Override
	public String getName() {
		return "선";
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public Figure create(List<Point> points) {
		if(points.size() == Line.LINE_POINT_SIZE) {
			return new Line(points);
		}

		throw new IllegalArgumentException("유효하지 않은 도형입니다.");
	}
}
