package step3;

import java.util.List;

public class Game {
	private List<Car> gameCars;
	private int moveTryMaxCount;

	public Game(List<Car> gameCars, int moveTryMaxCount) {
		this.gameCars = gameCars;
		this.moveTryMaxCount = moveTryMaxCount;
	}

	public List<Car> getGameCars() {
		return gameCars;
	}

	public int getMoveTryMaxCount() {
		return moveTryMaxCount;
	}

	public void tryToMoveAllGameCars() {
		for (Car gameCar : gameCars) {
			gameCar.tryToMove();
		}
	}

	public void playToEnd() {
		for (int i = 0; i < moveTryMaxCount; i++) {
			tryToMoveAllGameCars();
		}
	}
}
