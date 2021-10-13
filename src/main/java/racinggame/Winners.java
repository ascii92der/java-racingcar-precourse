package racinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Winners {

    private final List<String> winnerList;

    public Winners(Cars cars) {
        this.winnerList = new ArrayList<>();
        int winnerPosition = winnerPosition(cars.carList());

        for (Car car : cars.carList()) {
            winnerResult(car, winnerPosition);
        }
    }

    private int winnerPosition(List<Car> carList) {
        Collections.sort(carList, (o1, o2) -> {
            if (o1.currentPosition() >= o2.currentPosition()) {
                return 1;
            }
            return -1;
        });
        return carList.get(carList.size() - 1).currentPosition();
    }

    private void winnerResult(Car car, int winnerPosition) {
        if (car.currentPosition() == winnerPosition) {
            winnerList.add(car.name());
        }
    }

    public List<String> winnerList() {
        return winnerList;
    }
}
