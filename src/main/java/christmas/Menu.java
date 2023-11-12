package christmas;

import java.util.Arrays;

public enum Menu {
    MushroomSoup("양송이스프", 6000, "Appetizer"),
    Tapas("타파스", 5500, "Appetizer"),
    CaesarSalad("시저샐러드", 8000, "Appetizer"),
    TBoneSteak("티본스테이크", 55000, "Main"),
    BBQRibs("바비큐립", 54000, "Main"),
    SeafoodPasta("해산물파스타", 35000, "Main"),
    ChristmasPasta("크리스마스파스타", 25000, "Main"),
    ChocolateCake("초코케이크", 15000, "Dessert"),
    IceCream("아이스크림", 5000, "Dessert"),
    ZeroCola("제로콜라", 3000, "Beverage"),
    RedWine("레드와인", 60000, "Beverage"),
    Champagne("샴페인", 25000, "Beverage");

    private final String menuname;
    private final Integer price;
    private final String kind;


    Menu(String menuname, Integer price, String kind) {
        this.menuname = menuname;
        this.price = price;
        this.kind = kind;
    }

    public static Menu hasMenu(String str){
        return Arrays.stream(values())
                .filter(value -> value.menuname.equals(str))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요."));
    }

    public String menuname(){
        return menuname;
    }

    public Integer price() {
        return price;
    }

    public String kind() {
        return kind;
    }
}
