package racinggame;

import java.util.List;

public class RacingGameUI {

    public static final String INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String INPUT_RACING_COUNT = "시도할 회수는 몇회인가요?";
    public static final String RESULT_EXECUTION = "실행 결과";
    public static final String ERROR = "[ERROR] ";
    public static final String ERROR_WRONG_INPUT_NUMBER = "0보다 큰 숫자를 입력해 주세요.";
    public static final String PRINT_WINNERS = "최종 우승자는 %s 입니다.";

    public static void printError(String errorMessage) {
        System.out.println(ERROR + errorMessage);
    }

    public static void printInputRacingCount() {
        System.out.println(INPUT_RACING_COUNT);
    }

    public static int inputRacingCount(String count) {
        return Integer.parseInt(count);
    }

    public static void printRacingStart() {
        System.out.println(INPUT_CAR_NAMES);
    }

    public static void printWinners(List<String> winnerList) {
        System.out.printf(PRINT_WINNERS, String.join(",", winnerList));
    }

    public static void printBlank() {
        System.out.println("");
    }

    public static void printCurrentRace(String printCurrentRace) {
        System.out.println(printCurrentRace);
    }

    public static void printExecute() {
        System.out.println(RacingGameUI.RESULT_EXECUTION);
    }
}
