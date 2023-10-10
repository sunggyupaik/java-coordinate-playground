package FeedbackCoordinate;

public class CoordinateCalculator {
	public void run() {
		Figure figure = InputView.inputCoordinate();
		OutputView.showArea(figure);
	}
}
