package Coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {
	private List<Point> points;
	private Point point1;
	private Point point2;

	@BeforeEach
	void setUp() {
		points = new ArrayList<>();

		point1 = new Point(10, 10);
		point2 = new Point(14, 15);
		points.add(point1);
		points.add(point2);
	}

	@Test
	void lineAreaTest() {
		Line line = new Line(points);

		assertThat(line.area()).isEqualTo(6.403124, offset(0.00099));
	}
}
