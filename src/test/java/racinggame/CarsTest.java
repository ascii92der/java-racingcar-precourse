package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @Test
    void carsMoveAndPrintTest() {
        Cars cars = new Cars("KIA,BMW,AUDI");

        cars.moves();

        assertThat(cars.printCurrentRace()).contains("KIA","BMW","AUDI",":");
    }
}