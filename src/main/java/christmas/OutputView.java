package christmas;

import java.util.HashMap;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class OutputView {

    public void printEventPlanner(){
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void order(){
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
    }

    public void eventPreview(int day){
        System.out.println("12월 "+ day +"일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
    }

    public void orderMenu(HashMap<String ,Integer> order){
        order.forEach((key,value) ->{
            System.out.println(key+" "+value+"개");
        });
    }

    public void orderDiscountBefore(int money){
        System.out.println("<할인 전 총주문 금액>");
        System.out.println(commaMoney(money));
    }

    public void giftMenu(){
        System.out.println("<증정 메뉴>\n" + "샴페인 1개");
    }

    // 숫자 3자리 마다 콤마 찍기.
    private String commaMoney(int money){
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(money);
    }
}
