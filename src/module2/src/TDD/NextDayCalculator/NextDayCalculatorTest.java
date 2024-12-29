package TDD.NextDayCalculator;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    private final NextDayCalculator nextDayCalculator = new NextDayCalculator();

    @Test
    public void testGetNextDay1() {
        LocalDate nextDay = nextDayCalculator.getNextDay(1, 1, 2018);
        assertEquals(LocalDate.of(2018, 1, 2), nextDay);
    }

    @Test
    public void testGetNextDay2() {
        LocalDate nextDay = nextDayCalculator.getNextDay(31, 1, 2018);
        assertEquals(LocalDate.of(2018, 2, 1), nextDay);
    }

    @Test
    public void testGetNextDay3() {
        LocalDate nextDay = nextDayCalculator.getNextDay(30, 4, 2018);
        assertEquals(LocalDate.of(2018, 5, 1), nextDay);
    }

    @Test
    public void testGetNextDay4() {
        LocalDate nextDay = nextDayCalculator.getNextDay(28, 2, 2018);
        assertEquals(LocalDate.of(2018, 3, 1), nextDay);
    }

    @Test
    public void testGetNextDay5() {
        LocalDate nextDay = nextDayCalculator.getNextDay(29, 2, 2020);
        assertEquals(LocalDate.of(2020, 3, 1), nextDay);
    }

    @Test
    public void testGetNextDay6() {
        LocalDate nextDay = nextDayCalculator.getNextDay(31, 12, 2018);
        assertEquals(LocalDate.of(2019, 1, 1), nextDay);
    }
}
