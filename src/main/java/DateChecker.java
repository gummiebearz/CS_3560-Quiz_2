import java.util.Arrays;

public class DateChecker {
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private DateChecker.Month[] monthThirtyOneDays = { Month.JANUARY,
            Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER,
            Month.DECEMBER };

    public boolean has31Days(Month month) {
        if(month == null) {
            throw new IllegalArgumentException("Month must not be null");
        }

        return Arrays.asList(monthThirtyOneDays).contains(month);
    }
}
