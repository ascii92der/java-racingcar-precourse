package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarPositionTest {

    @Test
    void carMoveTest() {
        CarPosition carPosition = new CarPosition();
        carPosition.move(4);

        assertThat(carPosition.currentPosition()).isEqualTo(1);
    }

}