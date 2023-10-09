package Line;

public class Triangle {
	private final int positionAX;
	private final int positionAY;
	private final int positionBX;
	private final int positionBY;
	private final int positionCX;
	private final int positionCY;

	public Triangle(int positionAX, int positionAY, int positionBX, int positionBY,
				 int positionCX, int positionCY) {
		this.positionAX = positionAX;
		this.positionAY = positionAY;
		this.positionBX = positionBX;
		this.positionBY = positionBY;
		this.positionCX = positionCX;
		this.positionCY = positionCY;
	}

	public double area() {
		double a = Math.sqrt(Math.pow(positionAX - positionBX, 2) + Math.pow(positionAY - positionBY, 2));
		double b = Math.sqrt(Math.pow(positionAX - positionCX, 2) + Math.pow(positionAY - positionCY, 2));
		double c = Math.sqrt(Math.pow(positionBX - positionCX, 2) + Math.pow(positionBY - positionCY, 2));

		return Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b -c)) / 4;
	}
}
