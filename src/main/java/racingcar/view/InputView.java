package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InputView {

    private static final String INITIAL_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    private static final int MAX_PLAYERS = 5;
    public void printInitialMessage(){
        System.out.println(INITIAL_MESSAGE);
        String players = Console.readLine();
        List<String> playerList = new ArrayList<>(Arrays.asList(players.split(",")));
    }



}
