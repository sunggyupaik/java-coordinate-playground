package Coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

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

	private Set<Integer> convertToUniqueXValues(List<Point> points) {
		return convertToUniqueValues(points, Point::getX);
	}

	private Set<Integer> convertToUniqueYValues(List<Point> points) {
		return convertToUniqueValues(points, Point::getY);
	}

	private Set<Integer> convertToUniqueValues(List<Point> points, Function<Point, Integer> function) {
		return points.stream()
				.map(function)
				.collect(Collectors.toSet());
	}

	public double area2() {
		List<Point> points = getPoints();
		int differenceOfXValues = calculateDifference(convertToUniqueXValues(points));
		int differenceOfYValues = calculateDifference(convertToUniqueYValues(points));

		return (double) (differenceOfXValues * differenceOfYValues);
	}

	private int calculateDifference(Set<Integer> valuesOfPoints) {
		List<Integer> values = new ArrayList<>(valuesOfPoints);
		return Math.abs(values.get(0) - values.get(1));
	}

	@Override
	public double area() {
		Point point1 = getPoints().get(0);
		Point point2 = getPoints().get(1);
		Point point3 = getPoints().get(2);
		Point point4 = getPoints().get(3);

		double width = findWidth(point1, point2, point3, point4);
		double height = findHeight(point1, point2, point3, point4);

		return width * height;
	}

	private double findHeight(Point point1, Point point2, Point point3, Point point4) {
		double height = 0;

		if(point1.getX() == point2.getX()) {
			height = point1.getDistance(point2);
		}

		else if(point1.getX() == point3.getX()) {
			height = point1.getDistance(point3);
		}

		else if(point1.getX() == point4.getX()) {
			height = point1.getDistance(point4);
		}

		return height;
	}

	private double findWidth(Point point1, Point point2, Point point3, Point point4) {
		double width = 0;

		if(point1.getY() == point2.getY()) {
			width = point1.getDistance(point2);
		}

		else if(point1.getY() == point3.getY()) {
			width = point1.getDistance(point3);
		}

		else if(point1.getY() == point4.getY()) {
			width = point1.getDistance(point4);
		}

		return width;
	}
}
