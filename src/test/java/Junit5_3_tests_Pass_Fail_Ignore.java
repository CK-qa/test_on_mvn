import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Junit5_3_tests_Pass_Fail_Ignore {
    C1 c1 = new C1();


    @Disabled
    @Test
    void plus() {
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
     */

    @Test
    void always_fail() {
        assertTrue(1 == 2, "Fail!");
    }
}