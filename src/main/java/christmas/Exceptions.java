package christmas;

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
        if(day > 31 && day < 0){
            throw new IllegalArgumentException("[ERROR] 숫자를 입력 하세요.");
        }
    }
}
