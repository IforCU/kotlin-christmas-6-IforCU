package christmas;

import java.util.HashMap;
import java.text.DecimalFormat;

public class OutputView {

    public void printEventPlanner() {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public static void eventPreview(int day) {
        System.out.println("12월 " + day + "일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
    }

    public static void orderMenu(HashMap<String, Integer> order) {
        System.out.println("\n<주문 메뉴>");
        order.forEach((key, value) -> {
            System.out.println(key + " " + value + "개");
        });
    }

    public void orderDiscountBefore(int money) {
        System.out.println("\n<할인 전 총주문 금액>");
        System.out.println(commaMoney(money) + "원");
    }

    public void giftMenu(boolean bool) {
        System.out.println("\n<증정 메뉴>");
        if (bool) {
            System.out.println("샴페인 1개");
        } else {
            System.out.println("없음");
        }
    }

    public void benefits(HashMap<String, Integer> discount) {
        System.out.println("\n<혜택 내역>");
        if(discount.isEmpty()){
            System.out.println("없음");
            return;
        }
        discount.forEach((strKey, strValue) -> {
            System.out.println(strKey + ": -" + commaMoney(strValue) + "원");
        });
    }

    public void totalDiscount(int money) {
        System.out.println("\n<총혜택 금액>");
        if(money == 0){
            System.out.println("없음");
            return;
        }
        System.out.println("-" + commaMoney(money) + "원");
    }

    public void estimatePayment(int money, int discountMoney) {
        System.out.println("\n<할인 후 예상 결제 금액>");
        if(money < 10000){
            System.out.println(commaMoney(money) + "원");
            return;
        }
        System.out.println(commaMoney(money - discountMoney) + "원");
    }

    public void eventBadge(String str) {
        System.out.println("\n<12월 이벤트 배지>\n" + str);
    }


    // 숫자 3자리 마다 콤마 찍기.
    private String commaMoney(int money) {
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(money);
    }
}
