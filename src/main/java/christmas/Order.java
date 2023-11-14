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
            for (int i = 0; i < strValue; i++) {
                money += Menu.hasMenu(strKey).price();
            }
        });
    }

    public int getMainMenu() {
        final int[] num = {0};
        order.forEach((strKey, strValue) -> {
            if (Menu.hasMenu(strKey).menuname().equals("Main")) {
                num[0]++;
            }
        });
        return num[0];
    }

    public int getDessertMenu() {
        final int[] num = {0};
        order.forEach((strKey, strValue) -> {
            if (Menu.hasMenu(strKey).menuname().equals("Dessert")) {
                num[0]++;
            }
        });
        return num[0];
    }

    public HashMap<String, Integer> getOrder() {
        return order;
    }

    public int getMoney() {
        return money;
    }
}
