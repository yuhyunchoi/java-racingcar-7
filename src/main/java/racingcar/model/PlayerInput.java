package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PlayerInput {
    private static final String PLAYER_INPUT_ERROR_MESSAGE = "입력 값이 비어있습니다.";

    public List<String> getPlayers(String players){
        if (Objects.isNull(players) || players.trim().isEmpty()) {
            throw new IllegalArgumentException(PLAYER_INPUT_ERROR_MESSAGE);
        }

        List<String> playersList = new ArrayList<>(Arrays.asList(players.split((","))));
        return playersList;
    }

}
