package christmas;

public class Discount {

    private int day;
    private int money;

    public Discount(int day,int money){
        this.money = money;
        this.day = day;
    }

    public int getMoney(){
        return money;
    }

    public int getDay(){
        return day;
    }

}
