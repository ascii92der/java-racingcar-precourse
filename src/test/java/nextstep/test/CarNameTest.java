package nextstep.test;

import nextstep.CarName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarNameTest {

    @Test
    void carNameValidTest() {
        String name = "HYUNDAI";
        assertThatThrownBy(() -> new CarName(name)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("자동차 이름은 5자까지만 가능합니다.");
    }
    
}
