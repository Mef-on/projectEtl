import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FakeTest {
    static private int TEST_1 = 1;
    static private int TEST_2 = 2;

    @Test
    void fakeTest() {
        Assertions.assertEquals(TEST_1, TEST_2);
    }
}
