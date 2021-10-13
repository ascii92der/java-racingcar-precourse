package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("TEST");
    }

    @Test
    void carNameTest() {
        assertThat(car.name()).isEqualTo("TEST");
    }

    @Test
    void carMoveTest() {
        car.move(3);
        assertThat(car.currentPosition()).isZero();
    }

    @Test
    void carMovePrintTest() {
        car.move(4);
        car.move(4);
        assertThat(car.printCarDistance()).isEqualTo("--");
    }
}