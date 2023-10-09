package FeedbackCoordinate;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getDistanceFrom(Point point) {
		return squareRoot(square(x - point.getX()) + square(y - point.getY()));
	}

	public double square(int value) {
		return Math.pow(value, 2);
	}

	public double squareRoot(double value) {
		return Math.sqrt(value);
	}
}
