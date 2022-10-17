public class EnumExample4 {
    enum Season {
        SPRING, SUMMER, FALL, WINTER;
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }
}
