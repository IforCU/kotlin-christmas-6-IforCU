package christmas;

public enum DistcountEvent {
    //목 0 금 1 토 2 일 3 월 4 화 5 수 6
    // 1 2 주말 할인
    // 0 3 4 5 6 평일 할인
    // 3 10 17 24 25 31 특별 할인
    // 크리스마스 디데이 할인.
    WEEKDAY(2023, "평일 할인"),
    WEEKEND(2023, "주말 할인"),
    SPECIAL(1000, "특별 할인"),
    CHRISTMAS(1000, "크리스마스 디데이 할인");


    private final int discount;

    private final String benefit;

    DistcountEvent(int discount, String benefit) {

        this.discount = discount;
        this.benefit = benefit;
    }


    public int getDiscount() {
        return discount;
    }

    public String getBenefit() {
        return benefit;
    }
}
