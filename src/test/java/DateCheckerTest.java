import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY",
            "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"FEBRUARY",
            "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testDoesNotHave31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month));
    }

    @Test
    public void testHas31DaysWithNullValue() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> dateChecker.has31Days(null)
        );
        assertEquals("Month must not be null", exception.getMessage());
    }
}
