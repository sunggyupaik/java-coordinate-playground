package Line;

public class Line {
	private final int positionAX;
	private final int positionAY;
	private final int positionBX;
	private final int positionBY;

	public Line(int positionAX, int positionAY, int positionBX, int positionBY) {
		this.positionAX = positionAX;
		this.positionAY = positionAY;
		this.positionBX = positionBX;
		this.positionBY = positionBY;
	}

	public double length() {
		return Math.sqrt(Math.pow(positionAX - positionBX, 2) + Math.pow(positionAY - positionBY, 2));
	}
}
