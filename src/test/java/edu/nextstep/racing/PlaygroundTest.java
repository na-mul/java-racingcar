package edu.nextstep.racing;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Playground : Game과 Car 객체를 엮어, 실제 Game이 세팅되고 Play될 수 있도록 함.")
class PlaygroundTest {

	@DisplayName("createGameCars : 자동차 이름들을 파라미터로 받아 목록길이만큼의 이름 달린 자동차들을 생성하여 리턴해야 함.")
	@Test
	void createGameCars() {
		String[] namesOfCars = new String[]{"pobi", "crong", "honux"};
		List<Car> gameCars = new Playground().createGameCars(namesOfCars);
		assertThat(gameCars).hasSize(3);
		assertThat(gameCars.get(0).getName()).isEqualTo("pobi");
		assertThat(gameCars.get(1).getName()).isEqualTo("crong");
		assertThat(gameCars.get(2).getName()).isEqualTo("honux");
	}

	@DisplayName("createRacingGame : 파라미터로 넘겨준 만큼의 자동차 대수와 이동 시도 횟수를 가지는 새 게임을 생성해 리턴해야 함")
	@Test
	void createRacingGame() {
		String[] namesOfCars = new String[]{"pobi", "crong", "honux"};
		int moveTryMaxCount = 5;
		assertThat(new Playground().createRacingGame(namesOfCars, moveTryMaxCount))
			.isNotNull()
			.satisfies(game -> {
				assertThat(game.getGameCars()).hasSize(namesOfCars.length);
				assertThat(game.getMoveTryMaxCount()).isEqualTo(moveTryMaxCount);
			});
	}
}