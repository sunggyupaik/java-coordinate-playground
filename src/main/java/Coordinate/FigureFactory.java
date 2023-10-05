package Coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {
	private static final Map<Figure, List<Point>> map = new HashMap<>();

	static Figure create(List<Point> points) {
		if(points == null) {
			throw new IllegalArgumentException("올바른 Point 가 아닙니다.");
		}

		if(points.size() < 2 || points.size() > 4) {
			throw new IllegalArgumentException("입력된 Point 갯수가 올바르지 않습니다.");
		}

		if(map.size() == 0) {
			map.put(new Line(points), points);
			map.put(new Rectangle(points), points);
			map.put(new Triangle(points), points);
		}

		return map.keySet().stream()
				.filter(figure -> figure.size() == points.size())
				.findAny()
				.orElseThrow(IllegalArgumentException::new);
	}
}
