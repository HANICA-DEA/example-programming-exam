package nl.oose.dea.adder;

public class AdderExecutor {
    public String execute(int i) {
        StringBuilder returnValue = new StringBuilder();

        returnValue.append(i+1);

        return returnValue.toString();
    }
}
