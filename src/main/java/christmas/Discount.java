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

    public void setDiscount(int main , int dessert) {
        HashMap<String, Integer> discount = new HashMap<>();
        if(isWeekendDiscount()){
            if(main!= 0){
                discount.put(DistcountEvent.WEEKEND.getBenefit(),(DistcountEvent.WEEKEND.getDiscount() * main));
            }
        }
        if(isWeekdayDiscount()){
            if(dessert!= 0){
                discount.put(DistcountEvent.WEEKDAY.getBenefit(),(DistcountEvent.WEEKDAY.getDiscount() * dessert));
            }
        }
        if(isSpecialDiscount()){
            discount.put(DistcountEvent.SPECIAL.getBenefit(),DistcountEvent.SPECIAL.getDiscount());
        }
        if(isCHRISTMASDiscount()){
            discount.put(DistcountEvent.CHRISTMAS.getBenefit(),(DistcountEvent.CHRISTMAS.getDiscount() + (day-1) * 100));
        }
        if (getGift()) {
            discount.put("증정 이벤트", 25000);
        }
        this.discount = discount;
    }

    public void setGift(int money)
    {
        if (money >= 120000) this.gift = true;
    }

    public int getTotalDiscount(){
        final int[] money = {0};
        discount.forEach((strKey, strValue) -> {
            money[0] += strValue;
        });
        return money[0];
    }

    public int estimateDiscount(){
        if(gift){
            return getTotalDiscount()- 25000;
        }
        return getTotalDiscount();
    }

    public String getBadge(int money){
        if(money > Badge.SANTA.prize()){
            return Badge.SANTA.Badge();
        }
        if(money > Badge.TREE.prize()){
            return Badge.TREE.Badge();
        }
        if(money > Badge.STAR.prize()){
            return Badge.STAR.Badge();
        }
        return "없음";
    }

    private boolean isWeekendDiscount(){
        if(day%7 == 1 || day%7 == 2){
            return true;
        }
        return false;
    }

    private boolean isWeekdayDiscount(){
        if(day%7 < 1 || day%7 > 2){
            return true;
        }
        return false;
    }

    private boolean isSpecialDiscount(){
        int[] special = {3,10,17,24,25,31};
        for(int num : special){
            if(day == num){
                return true;
            }
        }
        return false;
    }

    private boolean isCHRISTMASDiscount(){
        if(day < 26){
            return  true;
        }
        return false;
    }
}
