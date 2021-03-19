import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUint5_Passed_and_Ignored {

    C2 c2 = new C2();

    @Test
    public void test_passed() {
        assertTrue("Pewpew".equalsIgnoreCase(c2.s));
    }

    @Disabled
    @Test
    public void test_passed_before_ignored() {
        assertTrue("Pewpew".equalsIgnoreCase(c2.s));
    }
}
