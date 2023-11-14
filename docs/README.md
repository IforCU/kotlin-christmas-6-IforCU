# 목표 

클래스를 분리하는 단위를 명확히 하며 각 기능을 나누어보는 것.

# 12월 예약 주문 시스템.

## 1. 날짜에 따른 할인 금액

Class Discount

### 1) 크리스마스 디데이 할인. 12.1~12.25

ChristmasDiscount

#### 1일날 1000으로 스타트 크리스마스에 따라 할인 금액 100원 씩 증가.

총 주문 금액에서 해당 금액을 빼면 됌.

시작일인 12월 1일에 1,000원, 2일에 1,100원, ..., 25일엔 3,400원 할인

#### 2) 평일 할인 일 ~ 목

WeekdayDiscount

디저트 메뉴를 메뉴 1개당 2,023원 할인

#### 3) 주말 할인 금,토

WeekendDiscount

메인 메뉴를 메뉴 1개당 2,023원 할인

#### 4) 특별할인 3,10,17,24,31

SpecialDiscount

달력에 별이 있으면 총주문 금액에서 1,000원 할인

#### 5) 증정 이벤트

GiftEvent

할인 전 총주문 금액이 12만 원 이상일 때, 샴페인 1개 증정

## 2. 금액에 따른 이벤트 배지 부여

Class Badge

### 5천 원 이상 : 별

### 1만 원 이상 : 트리

### 2만 원 이상 : 산타

## 3. 고객에게 안내할 주의 사항

Class Exceptions

### 주문 금액 10000이상만 이벤트 적용

금액이 10000이상이 아니면 이벤트 적용 x

### 음료만 주문 시, 주문할 수 없습니다.

음료만 주문시 주문 x [ERROR] 다시 주문

### 메뉴는 한 번에 최대 20개까지만 주문할 수 있습니다.

메뉴가 20개 초과 시 [ERROR] 20개를 넘어서 주문 x


# 클래스나 eunm 요소

## Class Application

메인 프로그램

## Class ChristmasPreOrder

각각 클래스를 가져와 실행하는 당담.

---
## Order

### HashMap<String, Integer> order

주문을 저장함.

### int money

주문 금액을 저장함.

### void setMoney()

주문 금액이 얼마 인지 주문 금액으로 저장함.

### int getMainMenu()

주문 중에 메인이 몇 개인지 리턴함.

### int getDessertMenu()

주문 중에 디저트가 몇 개인지 리턴함.

### HashMap<String, Integer> getOrder()

주문을 리턴함.

### getMoney()

주문 금액을 리턴함.

---

## Discount

할인을 저장하는 객체


### int day

날짜를 저장함.

### HashMap<String, Integer> discount

할인 정보를 저장함.

### boolean gift

증정 메뉴 여부를 저장함.

### int getDay(), boolean getGift() 

각각 날짜, 증정메뉴 여부를 리턴함

### HashMap<String, Integer> getDiscount()

할인 정보를 리턴함.

### void setDiscount(int main , int dessert)

할인 내역을 처리하여 저장함.

### void setGift(int money)

증정 여부를 확인해 저장함.

### int getTotalDiscount()

총 할인 금액을 리턴함

### int estimateDiscount()

증정 여부에 따라 예상 할인 금액을 리턴함.

### String getBadge(int money)

배찌 이벤트 여부를 리턴함.

### private boolean isWeekendDiscount()

주말 할인 여부를 리턴함.

### private boolean isWeekdayDiscount()

평일 할인 여부를 리턴함

### private boolean isSpecialDiscount()

특별 할인 여부를 리턴함

### private boolean isCHRISTMASDiscount()

크리스마스 디데이 할인 여부를 리턴함.

## Class InputView

입력을 받는 객체

### int visitDate()

읽은 값을 예외처리 후 int 형식으로 리턴함.

### HashMap<String, Integer> order()

읽은 값을 예외처리 후 HashMap 형식으로 리턴함.


## Class OutputView

출력을 하는 객체

### void printEventPlanner()

이벤트 플래너 문구 출력

### void eventPreview(int day)

이벤트 해택 문구 출력

### void orderMenu(HashMap<String, Integer> order)

<주문메뉴> 출력

### void orderDiscountBefore(int money)

<할인 전 총 주문 금액> 출력

### void giftMenu(boolean bool)

<증정메뉴> 출력

### void benefits(HashMap<String, Integer> discount)

<해택내역> 출력

### void totalDiscount(int money)

<총해택 금액> 출력

### void estimatePayment(int money, int discountMoney)

<할인 후 예상 결제 금액> 출력

### void eventBadge(String str)

<12월 이벤트 배지> 출력

### String commaMoney(int money)

숫자 3마리 마다 콤마 찍어서 출력.

## Class Exceptions

예외처리를 도와주는 객체

### void isInteger(String strValue)

입력 받은 값이 정수인지 

### void isDecemberDay(String strValue)

입력 받은 값이 유효한 날짜인지 

### void isValidMenu(String str)

메뉴에 존재하는지

### void isValidLeastOne(Integer num)

최소 하나 이상 주문 했는지

### void isValidMenuFormat(String[] str)

형식에 맞게 주문했는지

### void isValidOverlapping(HashMap<String, Integer> order, String str)

중복된 주문이 없는지

### void isOrderJustDrinks(HashMap<String, Integer> order)

음료수만 주문하지 않았는지

### void isOrderUpTo20(HashMap<String, Integer> order)

20개가 넘게 메뉴를 주문하지 않았는지


## Enum Menu

<애피타이저> : 
양송이수프(6,000), 타파스(5,500), 시저샐러드(8,000)

<메인> : 
티본스테이크(55,000), 바비큐립(54,000), 해산물파스타(35,000), 크리스마스파스타(25,000)

<디저트> : 
초코케이크(15,000), 아이스크림(5,000)

<음료> : 
제로콜라(3,000), 레드와인(60,000), 샴페인(25,000)

## Enum Badge

별, 트리, 산타

## Enum DiscountEvent

WEEKDAY(2023, "평일 할인"), 

WEEKEND(2023, "주말 할인"), 

SPECIAL(1000, "특별 할인"), 

CHRISTMAS(1000, "크리스마스 디데이 할인")


