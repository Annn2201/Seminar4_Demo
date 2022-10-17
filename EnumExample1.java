public class EnumExample1 {
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        Season season = Season.FALL;
        System.out.println(season);
    }
}
