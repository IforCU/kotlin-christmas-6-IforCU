package christmas;

import java.util.HashMap;

public class Order {
    private HashMap<String, Integer> order = new HashMap<>();
    private int money = 0;

    public Order(HashMap<String, Integer> order) {
        this.order = order;
    }

    public void setMoney() {
        order.forEach((strKey, strValue) -> {
            for(int i = 0 ; i < strValue ; i++){
                money += Menu.hasMenu(strKey).price();
            }
        });
    }

    public HashMap<String, Integer> getOrder() {
        return order;
    }

    public int getMoney() {
        return money;
    }
}
