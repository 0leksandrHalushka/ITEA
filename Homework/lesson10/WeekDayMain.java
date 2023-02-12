package lesson10;

public class WeekDayMain {
    public static void main(String[] args) {
        Weekday[] weekdays = Weekday.values();

        for (Weekday el: weekdays) {
            System.out.println(el.toString() +  " is a workday? - " + el.isWeekDay());
        }

    }

}
