package christmas;

import java.util.HashMap;

public class Exceptions {
    public static void isInteger(String strValue) {
        try {
            Integer.parseInt(strValue);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력 하세요.");
        }
    }

    public static void isDecemberDay(String strValue) {
        int day = Integer.parseInt(strValue);
        if(day > 31 || day < 0){
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }

    public static void isValidMenu(String str){
        Menu.hasMenu(str);
    }

    public static void isValidLeastOne(Integer num){
        if(num <= 0){
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    public static void isValidMenuFormat(String[] str){
        try {
            if(!(str.length == 2)){
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
            Integer.parseInt(str[1]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    public static void isvalidOverlapping(HashMap<String,Integer> order,String str) {
        if(order.containsKey(str)){
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }
}
