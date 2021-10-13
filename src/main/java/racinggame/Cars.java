package racinggame;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static final String CAR_SEPERATED_CHARACTER = ",";

    private final List<Car> carList;

    public Cars(String carList) {
        this.carList = new ArrayList<>();
        for (String carName : carList.split(CAR_SEPERATED_CHARACTER)) {
            this.carList.add(new Car(carName));
        }
    }

    public void moves() {
        for (Car car : carList) {
            car.move(Randoms.pickNumberInRange(0, 9));
        }
    }

    public String printCurrentRace() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carList) {
            sb.append(car.name()).append(":").append(car.printCarDistance()).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public List<Car> carList() {
        return carList;
    }
}
