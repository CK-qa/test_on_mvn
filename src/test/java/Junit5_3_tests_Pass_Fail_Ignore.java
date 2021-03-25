import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5_3_tests_Pass_Fail_Ignore {
    C1 c1 = new C1();

    //todo pewpew

    @Disabled
    @Test
    void plus() throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(c1.plus(), 7, "Ololo");
    }

    //fixme test pre-commit

    //todo test pre-commit


    @Test
    void always_pass() {
        assertEquals(1, 1, "Passed");
    }

    /**
     * pewpew
     *
     */

    @Test
    void always_fail() {
        assertEquals(1, 2, "Fail!");
    }
}