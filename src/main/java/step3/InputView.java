package step3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputView {
	public static Scanner scanner = new Scanner(System.in);

	private InputView() {
	}

	public static int inputNumberOfCars() {
		System.out.println("자동차 대수는 몇 대 인가요?");
		String input = scanner.nextLine();
		if (!Pattern.matches("^[1-9]+$", input)) {
			return inputNumberOfCars();
		}
		return Integer.parseInt(input);
	}

}