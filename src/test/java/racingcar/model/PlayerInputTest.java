package racingcar.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.PlayerInput;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerInputTest {

    private PlayerInput playerInput;

    @BeforeEach
    void setUp() {
        playerInput = new PlayerInput();
    }

    @Test
    @DisplayName("정상적인 플레이어 입력 테스트")
    void testGetPlayers_ValidInput() {
        String input = "car1,car2,car3";
        List<String> players = playerInput.getPlayers(input);

        assertEquals(3, players.size());
        assertEquals("car1", players.get(0));
        assertEquals("car2", players.get(1));
        assertEquals("car3", players.get(2));
    }

    @Test
    @DisplayName("플레이어 입력이 null 또는 빈 값일 경우 예외 발생")
    void testGetPlayers_InvalidInput_EmptyOrNull() {
        assertThrows(IllegalArgumentException.class, () -> playerInput.getPlayers(""));
        assertThrows(IllegalArgumentException.class, () -> playerInput.getPlayers(null));
    }

    @Test
    @DisplayName("플레이어 이름이 5자 이상이거나 빈 경우 예외 발생")
    void testValidatorPlayerName_InvalidPlayerName() {
        String input = "car1,carTooLong,car3";
        assertThrows(IllegalArgumentException.class, () -> playerInput.getPlayers(input));
    }
}
