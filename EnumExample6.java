public class EnumExample6 {
    enum Season {
        SPRING, SUMMER, FALL, WINTER;
    }

    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            default:
                System.out.println("one of 4 seasons in a year.");
        }
    }
}
