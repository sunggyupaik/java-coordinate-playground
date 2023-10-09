package FeedbackCoordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {
	private static final Map<Integer, Function<List<Point>, Figure>> map = new HashMap<>();

	static {
		map.put(Line.LINE_SIZE, Line::new);
		map.put(Triangle.TRIANGLE_SIZE, Triangle::new);
		map.put(Rectangle.RECTANGLE_SIZE, Rectangle::new);
	}

	public static Figure create(List<Point> points) {
		return map.get(points.size()).apply(points);
	}
}
