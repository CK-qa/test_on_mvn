import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit2_Failed_and_Ignored {


    C2 c2 = new C2();

    @Test
    public void test_failed() {
        assertTrue(false);
    }

    @Disabled
    @Test
    public void test_failed_before_ignored() {
        assertTrue("Pewpew".equalsIgnoreCase(c2.s));
    }
}
