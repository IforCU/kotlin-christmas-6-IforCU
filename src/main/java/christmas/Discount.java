package christmas;

import java.util.*;

public class Discount {

    private final int day;

    private HashMap<String, Integer> discount;

    private boolean gift = false;

    public Discount(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public boolean getGift() {
        return gift;
    }

    public HashMap<String, Integer> getDiscount() {
        return discount;
    }

    public void setDiscount(HashMap<String, Integer> order) {
        HashMap<String, Integer> discount = new HashMap<>();
        if (List.of(DistcountEvent.SPECIAL.getDay()).contains(day)) {
            discount.put(DistcountEvent.WEEKDAY.getBenefit(), DistcountEvent.WEEKDAY.getDiscount());
        }
        if (Objects.equals(DistcountEvent.WEEKEND.getDay(), day)) {
            discount.put(DistcountEvent.WEEKEND.getBenefit(), DistcountEvent.WEEKEND.getDiscount());
        }
        if (List.of(DistcountEvent.SPECIAL.getDay()).contains(day)) {
            discount.put(DistcountEvent.SPECIAL.getBenefit(), DistcountEvent.SPECIAL.getDiscount());
        }
        if (List.of(DistcountEvent.DDAY.getDay()).contains(day)) {
            int money = (day - 1) * 100;
            discount.put(DistcountEvent.DDAY.getBenefit(), DistcountEvent.DDAY.getDiscount() + money);
        }
        if (getGift()) {
            discount.put("증정 이벤트", 25000);
        }
        this.discount = discount;
    }


    public void setGift(int money) {
        if (money >= 120000) this.gift = true;
    }
}
