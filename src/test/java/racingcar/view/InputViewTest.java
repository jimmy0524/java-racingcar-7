package racingcar.view;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

public class InputViewTest {
    @Test
    public void 자동차_이름_입력() {
        //given
        String input = "pobi,woni";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputView inputView = new InputView();

        //when
        String carNames = inputView.getInput();

        //then
        assertThat(carNames).isEqualTo("pobi,woni");
    }

    @Test
    public void 시도할_횟수_입력() {
        //given
        String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputView inputView = new InputView();

        //when
        String count = inputView.getInput();

        //then
        assertThat(count).isEqualTo("3");
    }
}
