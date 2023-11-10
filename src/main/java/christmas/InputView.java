package christmas;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashMap;

public class InputView {

    public static int visitDate(){
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String input = Console.readLine();
        Exceptions.isInteger(input);
        Exceptions.isDecemberDay(input);
        return Integer.parseInt(input);
    }

    public static HashMap<String, Integer> order(){
        HashMap<String,Integer> order = new HashMap<String,Integer>();
        String input = Console.readLine();
        String[] split = input.split(",");
        for(String sp : split){
            String[] str = sp.split("-");
            order.put(str[0], Integer.valueOf(str[1]));
        }
        return order;
    }
}
