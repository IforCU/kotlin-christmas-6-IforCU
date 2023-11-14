package christmas;

public enum Badge {
    STAR("별", 5000),
    TREE("트리", 10000),
    SANTA("산타", 20000);

    private final String badge;
    private final int prize;

    Badge(String badge, int prize) {
        this.badge = badge;
        this.prize = prize;
    }

    public String Badge() {
        return badge;
    }

    public int prize() {
        return prize;
    }
}
