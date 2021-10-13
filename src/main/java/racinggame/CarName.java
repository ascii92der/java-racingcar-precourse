package racinggame;

public class CarName {
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;
    private static final String INVALID_CAR_NAME_LENGTH = "자동차 이름은 5자 이하만 가능합니다.";

    private final String name;

    public CarName(String name) {
        this.name = name;
        if (!validName(name)) {
            throw new IllegalArgumentException(INVALID_CAR_NAME_LENGTH);
        }
    }

    boolean validName(String name) {
        return name.length() >= MIN_NAME_LENGTH && name.length() <= MAX_NAME_LENGTH;
    }

    public String name() {
        return name;
    }
}
