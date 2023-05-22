import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FakeTest {
    static private int TEST_1 = 1;
    static private int TEST_2 = 2;

    @Test
    void fakeTest() {
        Assertions.assertEquals(TEST_1, TEST_1);
    }

    @Test
    void fakeTest1() {
        Assertions.assertEquals(TEST_1, TEST_2);
    }
}
