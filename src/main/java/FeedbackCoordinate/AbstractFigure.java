package FeedbackCoordinate;

import java.util.List;

public abstract class AbstractFigure implements Figure {
	private final List<Point> points;

	public AbstractFigure(List<Point> points) {
		if(points.size() != size()) {
			throw new IllegalArgumentException("점의 위치를 확인해주세요");
		}

		this.points = points;
	}

	@Override
	public List<Point> getPoints() {
		return this.points;
	}
}