import static org.junit.Assert.assertEquals

class Test {

    @org.junit.Test
    void JUnitAssertion() {
        def expected = 3
        def actual = 1 + 2
        assertEquals(expected, actual)
    }
}
