package Coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {
	private List<Point> points;
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;

	@BeforeEach
	void setUp() {
		points = new ArrayList<>();

		point1 = new Point(10, 10);
		point2 = new Point(22, 10);
		point3 = new Point(22, 18);
		point4 = new Point(10, 18);

		points.add(point1);
		points.add(point2);
		points.add(point3);
		points.add(point4);
	}

	@Test
	void rectangleAreaTest() {
		Rectangle rectangle = new Rectangle(points);

		assertThat(rectangle.area()).isEqualTo(96d);
	}

	@Test
	void rectangleAreaTest2() {
		Rectangle rectangle = new Rectangle(points);

		assertThat(rectangle.area2()).isEqualTo(96d);
	}
}
