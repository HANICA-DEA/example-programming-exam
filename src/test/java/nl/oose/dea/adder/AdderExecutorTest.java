package nl.oose.dea.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderExecutorTest {

    @Test
    void oneShouldBeIncrementedToTwo() {
        AdderExecutor adderExecutor = new AdderExecutor();
        assertEquals("2", adderExecutor.execute(1));
    }
}
