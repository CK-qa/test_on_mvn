

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUint5_Passed_and_Ignored {

    C2 c2 = new C2();


    @Test
    public void test_passed() {
        assertTrue("Pewpew".equalsIgnoreCase(c2.s));
    }


    void ppp() {
        for (int i = 0; i < 1; i++) {

        }
    }

//    void ppp() {
//        for (int i = 0; i < 1; i++) {
//
//        }
//    }


    //fixme

    @Disabled
    @Test
    public void test_passed_before_ignored() {
        assertTrue("Pewpew".equalsIgnoreCase(c2.s));
    }

    //todo ololo
}
