package racinggame;

import nextstep.utils.Console;

public class RacingGame {

    private Cars cars;

    public void start() {
        try {
            RacingGameUI.printRacingStart();
            cars = new Cars(Console.readLine());
            race();
            end();
        } catch (IllegalArgumentException e) {
            RacingGameUI.printError(e.getMessage());
            start();
        }

    }

    public void race() {
        RacingGameUI.printInputRacingCount();
        int count = RacingGameUI.inputRacingCount(Console.readLine());
        if (count < 0) {
            throw new IllegalArgumentException(RacingGameUI.ERROR_WRONG_INPUT_NUMBER);
        }
        RacingGameUI.printExecute();

        for (int index = 0; index < count; index++) {
            cars.moves();
            RacingGameUI.printCurrentRace(cars.printCurrentRace());
        }
        RacingGameUI.printBlank();
    }

    public void end() {
        Winners winners = new Winners(cars);
        RacingGameUI.printWinners(winners.winnerList());
    }
}
