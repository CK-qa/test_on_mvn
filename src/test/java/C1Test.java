import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class C1Test {

    C1 c1 = new C1();


    @Disabled
    @Test
    void plus() {
        assertEquals(c1.plus(), 7, "Ololo");
    }

    //todo

    @Test
    void always_pass() {
        assertEquals(1, 1, "Passed");
    }

    @Test
    void always_fail() {
        assertTrue(1 == 2, "Fail!");
    }
}