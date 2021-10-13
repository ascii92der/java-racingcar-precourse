package racinggame;

public class Car {

    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String name) {
        this.carName = new CarName(name);
        this.carPosition = new CarPosition();
    }

    public String name() {
        return carName.name();
    }

    public void move(int moveCondition) {
        carPosition.move(moveCondition);
    }

    public int currentPosition() {
        return carPosition.currentPosition();
    }

    public String printCarDistance() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentPosition(); i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
