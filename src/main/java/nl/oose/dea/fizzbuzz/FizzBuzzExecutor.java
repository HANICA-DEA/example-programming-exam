package nl.oose.dea.fizzbuzz;

import nl.oose.dea.executor.Executor;

public class FizzBuzzExecutor extends Executor  {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int FIZZ_VALUE = 3;
    public static final int BUZZ_VALUE = 5;

    protected StringBuilder executeDetailed(StringBuilder returnValue, int i)  {

        if (i <= 0) throw new NonPositiveFizzBuzzInputException();

        if (i % FIZZ_VALUE == 0) {
            returnValue.append(FIZZ);
        }
        if (i % BUZZ_VALUE == 0) {
            returnValue.append(BUZZ);
        }
        if (returnValue.length() == 0) {
            returnValue.append(i);
        }

        return returnValue;
    }
}
