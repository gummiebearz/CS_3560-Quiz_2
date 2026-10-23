import java.util.Arrays;

public class DateChecker {
    /**
     * Represents the 12 months of the calendar year,
     * used by has31Days() so that only
     * valid months can be passed in instead of plain numbers or strings.
     */
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

    /**
     * Returns true if the given month has 31 days.
     *
     * February always returns false because it has 28 or 29 days only
     *
     * @param month the month to check
     * @return true for January, March, May, July, August, October, December
     * @throws IllegalArgumentException if month is null
     */
    public boolean has31Days(Month month) {
        if(month == null) {
            throw new IllegalArgumentException("Month must not be null");
        }

        return Arrays.asList(monthThirtyOneDays).contains(month);
    }
}
