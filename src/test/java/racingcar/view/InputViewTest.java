package racingcar.view;

import static org.junit.jupiter.api.Assertions.*;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest extends NsTest {

    private final InputView inputView = new InputView();

    @Test
    @DisplayName("자동차 이름 입력 테스트")
    void testGetPlayerInput() {
        run("car1,car2,car3");

        inputView.getPlayerInput();

        assertThat(output()).contains("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    @Test
    @DisplayName("이동 횟수 입력 테스트")
    void testGetMoveNumber() {
        run("5");

        inputView.getMoveNumber();

        assertThat(output()).contains("시도할 횟수는 몇 회인가요?");
    }

    @Override
    public void runMain() {
    }
}
