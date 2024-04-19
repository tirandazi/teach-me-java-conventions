package powerpackage;


import org.junit.jupiter.api.Test;

public class PowerFinderTest {
    @Test
    public void testOnePowerOneEqualsOne() {
        assert PowerFinder.getPower(1, 1) == 1;
    }

    @Test
    public void testTwoPowerOneEqualsTwo() {
        assert PowerFinder.getPower(2, 1) == 2;
    }

    @Test
    public void testTwoPowerTwoEqualsFour() {
        assert PowerFinder.getPower(2, 2) == 4;
    }

    @Test
    public void testThreePowerTwoEqualsSix() {
        assert PowerFinder.getPower(3, 2) == 3 * 3;
    }
}
