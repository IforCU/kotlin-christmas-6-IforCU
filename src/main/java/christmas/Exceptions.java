package christmas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Exceptions {
    public static void isInteger(String strValue) {
        try {
            Integer.parseInt(strValue);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }

    public static void isDecemberDay(String strValue) {
        int day = Integer.parseInt(strValue);
        if (day > 31 || day <= 0) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }

    public static void isValidMenu(String str) {
        Menu.hasMenu(str);
    }

    public static void isValidLeastOne(Integer num) {
        if (num <= 0) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    public static void isValidMenuFormat(String[] str) {
        try {
            if (!(str.length == 2)) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
            Integer.parseInt(str[1]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    public static void isValidOverlapping(HashMap<String, Integer> order, String str) {
        if (order.containsKey(str)) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    public static void isOrderJustDrinks(HashMap<String, Integer> order) {
        List<String> list = new ArrayList<>();
        order.forEach((strKey, strValue) -> {
            list.add(Menu.hasMenu(strKey).kind());
        });
        Set<String> set = new HashSet<String>(list);
        List<String> newList = new ArrayList<String>(set);
        if (newList.size() == 1 && newList.contains("Beverage")) {
            throw new IllegalArgumentException("[ERROR] 음료만 주문 시, 주문할 수 없습니다.");
        }
    }

    public static void isOrderUpTo20(HashMap<String, Integer> order) {
        final int[] num = {0};
        order.forEach((strKey, strValue) -> {
            num[0] += strValue;
        });
        if (num[0] > 20) {
            throw new IllegalArgumentException("[ERROR] 메뉴는 한 번에 최대 20개까지만 주문할 수 있습니다.");
        }
    }
}
