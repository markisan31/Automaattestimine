package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void checkLength() {
        Counter cnt = new Counter();
        String name = "mark";
        int resultExpected = 4;

        assertEquals(resultExpected, cnt.checkLength(name));
    }
}