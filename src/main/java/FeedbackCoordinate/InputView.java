package FeedbackCoordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
	private final static String INPUT_COORDINATE = "좌표를 입력하세요";
	private final static String POINT_DELIMITER  = "-";
	private static final String ERROR_INVALID_COORDINATES = "올바르지 않은 입력값입니다.";
	private static final Scanner scan = new Scanner(System.in);

	public static Figure inputCoordinate() {
		try {
			System.out.println(INPUT_COORDINATE);
			String input = scan.nextLine();
			checkValidInput(input);

			List<Point> points = points = generatePoints(input);
			return FigureFactory.create(points);
		} catch(IllegalArgumentException e) {
			return inputCoordinate();
		}
	}

	private static void checkValidInput(String input) {
		Pattern pattern = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
		Matcher matcher = pattern.matcher(input);
		if (!matcher.matches()) {
			throw new IllegalArgumentException(ERROR_INVALID_COORDINATES);
		}
	}

	private static List<Point> generatePoints(String input) {
		List<Point> points = new ArrayList<>();
		String[] inputPoints = input.split(POINT_DELIMITER);

		for (String inputPoint : inputPoints) {
			points.add(generatePoint(inputPoint));
		}

		return points;
	}

	private static Point generatePoint(String inputPoint) {
		String pointLine = inputPoint.substring(1, inputPoint.length() - 1);
		int x = Integer.parseInt(pointLine.split(",")[0]);
		int y = Integer.parseInt(pointLine.split(",")[1]);

		return new Point(x, y);
	}
}
