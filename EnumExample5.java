public class EnumExample5 {
    enum Season {
        SPRING(5), SUMMER(10), FALL(15), WINTER(20);

        private int value;
        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.value);
        }
    }
}
