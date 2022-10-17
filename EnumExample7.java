public class EnumExample7 {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
        SATURDAY, SUNDAY
    }

    public static void main(String args[]) {
        Day day1 = Day.SUNDAY;
        Day day2 = Day.MONDAY;

        if (day1.equals(Day.MONDAY)) {
            System.out.println("sunday");
        } else {
            System.out.println("today is not sunday");
        }

        if (day2 == Day.SUNDAY) {
            System.out.println("monday");
        } else {
            System.out.println("today is not monday");
        }

        if (day1 == day2) {
            System.out.println("It's not true");
        } else {
            System.out.println("it's true");
        }
    }
}
