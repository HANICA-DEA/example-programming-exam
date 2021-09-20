package nl.oose.dea.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static nl.oose.dea.fizzbuzz.FizzBuzzExecutor.*;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {
    private FizzBuzzExecutor fizzBuzzExecutor;

    @BeforeEach
    public void setup()
    {
        fizzBuzzExecutor = new FizzBuzzExecutor();
    }
    @Test
    public void whenNegativeInputIsEnteredAnExceptionIsThrown() {
        assertThrows(NonPositiveFizzBuzzInputException.class,
                () -> fizzBuzzExecutor.execute(-1));
    }

    @Test
    public void whenThreeIsEnteredFizzIsReturned() {
        assertEquals(FIZZ, fizzBuzzExecutor.execute(FIZZ_VALUE));
    }

    @Test
    public void whenFiveIsEnteredBuzzIsReturned() {
        assertEquals(BUZZ, fizzBuzzExecutor.execute(BUZZ_VALUE));
    }

    @Test
    public void whenFifteenIsEnteredFizzBuzzIsReturned() {
        assertEquals(FIZZ+BUZZ, fizzBuzzExecutor.execute(FIZZ_VALUE*BUZZ_VALUE));
    }

    @Test
    public void whenOneIsEnteredOneIsReturned() {
        assertEquals("1", fizzBuzzExecutor.execute(1));
    }

}
