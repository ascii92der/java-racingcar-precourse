package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WinnersTest {

    @Test
    void winnersTest() {
        Cars cars = new Cars("KIA,BMW,AUDI");

        cars.moves();
        cars.moves();
        cars.moves();

        Winners winners = new Winners(cars);
        assertThat(winners.winnerList().size()).isPositive();
    }
}