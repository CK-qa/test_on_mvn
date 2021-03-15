import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class C1Test {

    C1 c1 = new C1();


    @org.junit.jupiter.api.Test
    void plus() {
        Assert.assertEquals("Ololo", c1.plus(), 7);
    }
}