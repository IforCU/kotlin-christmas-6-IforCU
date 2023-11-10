package christmas;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public int visitDate(){
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String input = Console.readLine();
        Exceptions.isInteger(input);
        Exceptions.isDecemberDay(input);
        return Integer.parseInt(input);
    }
}
