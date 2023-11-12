package christmas;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
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
            Exceptions.isValidMenuFormat(str); // 형식이 맞는가
            Exceptions.isValidMenu(str[0]); // 메뉴에 존재하는가
            Exceptions.isValidLeastOne(Integer.valueOf(str[1])); // 갯수가 0이 아닌가
            Exceptions.isvalidOverlapping(order,str[0]); // 메뉴가 중복되지 않았나
            order.put(str[0], Integer.valueOf(str[1]));
        }
        return order;
    }
}
