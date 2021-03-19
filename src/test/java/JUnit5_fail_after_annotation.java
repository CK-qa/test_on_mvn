import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5_fail_after_annotation {

    C2 c2 = new C2();

    @BeforeEach
    void setUp() {
        assertEquals(1, 1);
    }

    @AfterEach
    void tearDown() {
        assertEquals(1, 2);
    }

    @Test
    public void test_with_failed_after_annotation() {
        assertTrue("Pewpew".equalsIgnoreCase(c2.s));
    }
}
