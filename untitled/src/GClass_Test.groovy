import org.junit.Test


class GClass_Test extends GroovyTestCase {

    @Test
    void JUnitAssertion() {
        def expected = 3
        def actual = 1 + 2
        assertEquals(expected, actual)
    }


}

1