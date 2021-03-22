import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUNit5_only_ignored {

    C2 c2 = new C2();

    @Disabled
    @Test
    public void test_passed_before_ignored() {
        assertTrue("Pewpew".equalsIgnoreCase(c2.s));
    }

    //todo ololo
}
