package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.PlayerInput;

import java.util.List;

public class InputView {

    private static final String INITIAL_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public void printInitialMessage(){
        System.out.println(INITIAL_MESSAGE);
        String players = Console.readLine();

        PlayerInput playerInput = new PlayerInput();
        List<String> playerList = playerInput.getPlayers(players);


    }



}
