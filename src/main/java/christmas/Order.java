package christmas;

import java.util.HashMap;

public class Order {
    private HashMap<String, Integer> order = new HashMap<>();

    public void Order(HashMap<String, Integer> order) {
        this.order = order;
    }

    public HashMap<String, Integer> getOrder() {
        return order;
    }
}
