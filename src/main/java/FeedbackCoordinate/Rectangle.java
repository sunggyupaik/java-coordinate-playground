package FeedbackCoordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rectangle extends AbstractFigure {
	public final static int RECTANGLE_SIZE = 4;
	private final static int RECTANGLE_SIDE_VERTEX_NUMBER = 2;


	public Rectangle(List<Point> points) {
		super(points);

		Set<Integer> xSet = convertToSetValues(points, Point::getX);
		Set<Integer> ySet = convertToSetValues(points, Point::getY);

		if(xSet.size() != RECTANGLE_SIDE_VERTEX_NUMBER || ySet.size() != RECTANGLE_SIDE_VERTEX_NUMBER) {
			throw new IllegalArgumentException("점의 위치가 사각형이 아닙니다");
		}
	}

	@Override
	public String getName() {
		return "사각형";
	}

	@Override
	public int size() {
		return RECTANGLE_SIZE;
	}

	@Override
	public double area() {
		List<Point> points = getPoints();
		double width = calculateWidth(points);
		double height = calculateHeight(points);

		return width * height;
	}

	private double calculateWidth(List<Point> points) {
		Set<Integer> set = convertToSetValues(points, Point::getX);

		List<Integer> list = new ArrayList<>(set);
		return Math.abs(list.get(0) - list.get(1));
	}

	private double calculateHeight(List<Point> points) {
		Set<Integer> set = convertToSetValues(points, Point::getY);
		List<Integer> list = new ArrayList<>(set);

		return Math.abs(list.get(0) - list.get(1));
	}

	private Set<Integer> convertToSetValues(List<Point> points, Function<Point, Integer> function) {
		return points.stream()
				.map(function)
				.collect(Collectors.toSet());
	}
}
