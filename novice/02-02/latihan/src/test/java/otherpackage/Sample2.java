package otherpackage;

import org.junit.Test;
import static org.junit.Assert.*;

public class Sample2 {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}