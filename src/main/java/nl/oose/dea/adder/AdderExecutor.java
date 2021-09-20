package nl.oose.dea.adder;

import nl.oose.dea.executor.Executor;

public class AdderExecutor extends Executor {
    @Override
    protected StringBuilder executeDetailed(StringBuilder stringBuilder, int i) {
        stringBuilder.append(i+1);
        return stringBuilder;
    }
}
