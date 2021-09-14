package nl.oose.dea.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzzRunner {

    private static final int RANGE_START_INCLUSIVE = 0;
    private static final int RANGE_END_EXCLUSIVE = 1001;

    public static void main(String[] args) {
        FizzBuzzExecutor fizzBuzzExecutor = new FizzBuzzExecutor();
        IntStream.range(RANGE_START_INCLUSIVE, RANGE_END_EXCLUSIVE).forEach(number -> {
            String result = fizzBuzzExecutor.execute(number);
            System.out.println(result);
        });
    }
}
