package TDD.NextDayCalculator;

import java.time.LocalDate;

public class NextDayCalculator {
    public LocalDate getNextDay(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.plusDays(1);
    }
}
