package christmas;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
//        ChristmasPreOrder christmasPreOrder = new ChristmasPreOrder();
//        christmasPreOrder.run();
        Order order = new Order(InputView.order());
        order.setMoney();
        System.out.println(order.getMoney());
    }
}
