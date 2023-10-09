package Line;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
	@Test
	void triangleTest() {
		Triangle triangle = new Triangle(10, 10, 14, 15, 20, 8);

		assertThat(triangle.area()).isEqualTo(29.0d, offset(0.00099));
	}
}
