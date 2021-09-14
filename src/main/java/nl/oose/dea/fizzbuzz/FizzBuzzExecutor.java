package nl.oose.dea.fizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i)  {
        StringBuilder returnValue = new StringBuilder();

        if (i % 3 == 0) {
            returnValue.append("Fizz");
        }
        if (i % 5 == 0) {
            returnValue.append("Buzz");
        }
        if (returnValue.length() == 0) {
            returnValue.append(i);
        }

        return returnValue.toString();
    }
}
