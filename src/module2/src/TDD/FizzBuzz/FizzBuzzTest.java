package TDD.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzzTranslate = new FizzBuzz();

    @Test
    public void testTranslateFizz() {
        assertEquals("Fizz", fizzBuzzTranslate.translate(3));
        assertEquals("Fizz", fizzBuzzTranslate.translate(6));
    }

    @Test
    public void testTranslateBuzz() {
        assertEquals("Buzz", fizzBuzzTranslate.translate(5));
        assertEquals("Buzz", fizzBuzzTranslate.translate(10));
    }

    @Test
    public void testTranslateFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(15));
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(30));
    }

    @Test
    public void testTranslateNumber() {
        assertEquals("hai", fizzBuzzTranslate.translate(2));
        assertEquals("hai sau", fizzBuzzTranslate.translate(26));
    }

    @Test
    public void testTranslateContains3() {
        assertEquals("Fizz", fizzBuzzTranslate.translate(13));
        assertEquals("Fizz", fizzBuzzTranslate.translate(33));
    }

    @Test
    public void testTranslateContains5() {
        assertEquals("Buzz", fizzBuzzTranslate.translate(25));
        assertEquals("Buzz", fizzBuzzTranslate.translate(53));
    }
}
