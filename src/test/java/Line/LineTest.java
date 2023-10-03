package Line;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {
	@Test
	void lineTest() {
		Line line = new Line(10, 10, 14, 15);

		assertThat(line.length()).isEqualTo(6.403124, offset(0.00099));
	}
}
