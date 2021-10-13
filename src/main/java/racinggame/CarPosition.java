package racinggame;

public class CarPosition {

    private static final int CAR_MOVE_CONDITION = 4;

    private int position;

    public CarPosition() {
        position = 0;
    }

    public void move(int movingCondition) {
        if (movingCondition >= CAR_MOVE_CONDITION) {
            position += 1;
        }
    }

    public int currentPosition() {
        return position;
    }
}
