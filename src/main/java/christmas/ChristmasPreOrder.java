package christmas;

public class ChristmasPreOrder {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void run(){
        outputView.printEventPlanner();
        while(true){
            try{
                inputView.visitDate();
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
