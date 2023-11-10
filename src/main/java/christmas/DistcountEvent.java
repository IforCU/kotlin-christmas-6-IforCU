package christmas;

import java.util.List;

public enum DistcountEvent {
    //목 0 금 1 토 2 일 3 월 4 화 5 수 6
    // 1 2 주말 할인
    // 0 3 4 5 6 평일 할인
    // 3 10 17 24 25 31 특별 할인
    // 크리스마스 디데이 할인.
    WEEKDAY(new int[]{0, 3, 4, 5, 6},2023),
    WEEKEND(new int[]{1,2},2023),
    SPECIAL(new int[]{3,10,17,24,25,31},1000),
    DDAY(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25},1000);

    private final int[] day;
    private final int discount;
    DistcountEvent(int[] day,int discount){
        this.day = day;
        this.discount = discount;
    }

}