package racingcar;

import racingcar.controller.ApplicationController;
import racingcar.view.InputView;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        ApplicationController controller = new ApplicationController(new InputView());
        controller.run();
    }
}
