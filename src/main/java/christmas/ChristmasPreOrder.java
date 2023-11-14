package christmas;

public class ChristmasPreOrder {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Discount discount;
    Order order;

    public void run() {
        outputView.printEventPlanner();
        while (true) {
            try {
                discount = new Discount(InputView.visitDate());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                order = new Order(InputView.order());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        OutputView.eventPreview(discount.getDay());
        OutputView.orderMenu(order.getOrder());
        order.setMoney();
        outputView.orderDiscountBefore(order.getMoney());
        discount.setGift(order.getMoney());
        discount.setDiscount(order.getMainMenu(), order.getDessertMenu());
        outputView.giftMenu(discount.getGift());
        outputView.benefits(discount.getDiscount());
        outputView.totalDiscount(discount.getTotalDiscount());
        outputView.estimatePayment(order.getMoney(), discount.estimateDiscount());
        outputView.eventBadge(discount.getBadge(discount.getTotalDiscount()));
    }
}
