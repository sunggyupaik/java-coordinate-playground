package Coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
	private List<Point> points;
	private Point point1;
	private Point point2;
	private Point point3;

	@BeforeEach
	void setUp() {
		points = new ArrayList<>();

		point1 = new Point(10, 10);
		point2 = new Point(14, 15);
		point3 = new Point(20, 8);

		points.add(point1);
		points.add(point2);
		points.add(point3);
	}

	@Test
	void triangleAreaTest() {
		Triangle triangle = new Triangle(points);

		assertThat(triangle.area()).isEqualTo(29.0d, offset(0.00099));
	}
}
