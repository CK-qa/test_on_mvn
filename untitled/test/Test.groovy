import static org.junit.Assert.*

class Test {

    @org.junit.Test
    void JUnitAssertion() {
        def expected = 32
        def actual = 1 + 2
        assertEquals(expected, actual)
    }
}
