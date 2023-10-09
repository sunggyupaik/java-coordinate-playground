package Line;

public class Point {
	private final int positionAX;
	private final int positionAY;
	private final int positionBX;
	private final int positionBY;
	private final int positionCX;
	private final int positionCY;
	private final int positionDX;
	private final int positionDY;

	public Point(int positionAX, int positionAY, int positionBX, int positionBY,
				 int positionCX, int positionCY, int positionDX, int positionDY) {
		this.positionAX = positionAX;
		this.positionAY = positionAY;
		this.positionBX = positionBX;
		this.positionBY = positionBY;
		this.positionCX = positionCX;
		this.positionCY = positionCY;
		this.positionDX = positionDX;
		this.positionDY = positionDY;
	}

	public double area() {
		int width = Math.max(Math.abs(positionAX - positionBX), Math.abs(positionAX - positionCX));
		int height = Math.max(Math.abs(positionAY - positionBY), Math.abs(positionAY - positionCY));
		return width * height;
	}
}
