package Line;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
	@Test
	void lineTest() {
		Point point = new Point(10, 10, 22, 10,
				22, 18, 10, 18);

		assertThat(point.area()).isEqualTo(96d);
	}
}
