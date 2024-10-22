package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PlayerInput {
    private static final String PLAYER_INPUT_ERROR_MESSAGE = "입력 값이 비어있습니다.";
    private static final String PLAYER_NUMBER_VALID_ERROR = "자동차의 이름이 5자 이상이거나 비어있습니다.";
    private static final int PLAYER_CHARACTER_LIMIT = 5;

    public List<String> getPlayers(String players){
        if (Objects.isNull(players) || players.trim().isEmpty()) {
            throw new IllegalArgumentException(PLAYER_INPUT_ERROR_MESSAGE);
        }

        List<String> playersList = new ArrayList<>(Arrays.asList(players.split((","))));
        validatorPlayerName(playersList);
        return playersList;
    }

    public void validatorPlayerName(List<String> playersList) {
        for(String s : playersList) {
            if(s.trim().length() > PLAYER_CHARACTER_LIMIT || s.trim().isEmpty()) {
                throw new IllegalArgumentException(PLAYER_NUMBER_VALID_ERROR);
            }
        }
    }

}
