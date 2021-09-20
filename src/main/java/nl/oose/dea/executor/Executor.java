package nl.oose.dea.executor;

public abstract class Executor {
    public String execute(int i) {
        StringBuilder returnValue = new StringBuilder();

        returnValue = executeDetailed(returnValue, i);

        return returnValue.toString();
    }

    protected abstract StringBuilder executeDetailed(StringBuilder stringBuilder, int i);
}
