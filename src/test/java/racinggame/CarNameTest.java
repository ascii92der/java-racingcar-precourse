package racinggame;

import racinggame.CarName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarNameTest {

    @Test
    void carNameValidTest() {
        String name = "HYUNDAI";
        assertThatThrownBy(() -> new CarName(name)).isInstanceOf(IllegalArgumentException.class);
    }

}
